package SQL;

		import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.AbstractDocument.Content;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
// 뉴스에서 읽어온 데이터를 sql에 연동하여 저장후 출력하기
public class Database {
	
	private Connection con; // mysql 연결
	private PreparedStatement pstmt;  // sql 문장 전송
	private final String URL = "jdbc:mysql://localhost:3306/naver?serverTimezone=UTC"; // SQL 서버 연결 주소
	
	// 드라이버 등록 : 한번만 등록하면 된다.
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결
	public void getConnection() {
		try {
			
			con = DriverManager.getConnection(URL, "root", "1234");  // 경로, 아이디, 비번
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결 해제
	public void disConnection() {
		try {
			
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 정보 가져오기 / 데이터 목록
	public void mydbListData() {
		try {
			// 1. MySql 연결
			getConnection();
			// 2. SQL 문장 작성
			String sql = "select * from member";
			// 3. MySql로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
			// 4. 실행결과를 받아온다.
			ResultSet rs = pstmt.executeQuery();  // db값을 조회할 때
			// 5. 결과를 출력
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3)
				+ " "
						);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	/*
	 try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	 * */
	// 추가(Insert)
	public void mydbInsert(String title, String content) {
		try {
			// 1. 연결
			getConnection();
			// 2. sql 문장 작성
			String sql = "insert into member(no, title, content) "  // 오라클? 에서 에러가 나기 때문에 반드시 한 칸 띄워야한다
					+ "values(no,?,?)";
			// 3. mysql로 sql 문장 전송
			pstmt = con.prepareStatement(sql);

			// 4. ????를 채운다.
//			pstmt.setInt(1, no);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			
			// 5. 실행
			pstmt.executeUpdate();  // db값 변동시에는 executeUpdate
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	// 수정
	public void mydbUpdate(int no, String title1, String text1) {
		try {
				getConnection();
				String sql = "update member set name = ?, sex = ?, content = ? "
						+ "where no = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, title1);
				pstmt.setString(2, text1);
				pstmt.setInt(3, no);
				
				pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnection();
			}
		
	}
	
	// 삭제
	public void mydbDelete(int no) {
		 try {
			 
			 getConnection();
			 String sql = "delete from member where no = ? ";
			 
			 pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1, no);
			 
			 pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnection();
			}
	}
	
	// 선택
	public void mydbSelect(int no) {
		try {
			
			getConnection();
			String sql = "select * from member where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3)
				+ " ");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	// 추가(Insert)
//		public void mydbInsertin(String content) {
//			try {
//				// 1. 연결
//				getConnection();
//				// 2. sql 문장 작성
//				String sql = "insert into member(content) "  // 오라클? 에서 에러가 나기 때문에 반드시 한 칸 띄워야한다
//						+ "values(?)";
//				// 3. mysql로 sql 문장 전송
//				pstmt = con.prepareStatement(sql);
//
//				// 4. ????를 채운다.
//				pstmt.setString(2, content);
//				
//				// 5. 실행
//				pstmt.executeUpdate();  // db값 변동시에는 executeUpdate
//				
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				disConnection();
//			}
//		}
//	
//	
	public static void main(String[] args) throws IOException {
		Database db = new Database();

		int pages = 3;
		for(int i = 1; i <= pages; i++) {
			
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page=1" + i;
			// 기사 1페이지부터 돌리기
			Document doc = Jsoup.connect(url).get();
			// rul에 있는 값들을 반환
//			System.out.println(doc);
			
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			// doc 에서 class 속성의 value 값을 구해서 elements 저장
//			System.out.println(elements.get(0));
		
			Element element = elements.get(0);
			//elements 의 값을 하나를 element의 반환
//			System.out.println(element);
			
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
			//element 의 class 속성에서 photo value 값을 photoElements 에 반환
//			System.out.println(photoElements);
			
			for(int j = 0; j < photoElements.size(); j++) {
				
				
				Element articleElement = photoElements.get(j); // 모아서 하나의 값으로 반환하고 
//				System.out.println(articleElement);
				Elements aElements = articleElement.select("a"); //  반환받은 값에서 a 문자를 골라서 반환
				Element aElement = aElements.get(0); // 반환받은 첫번째 하나를 반환
//				System.out.println(aElements);
				
				String newsUrl = aElement.attr("href"); // 반환받은 값에서 href 요소를 newsUrl에 넣고
//				System.out.println(newsUrl);
				
				Element imgElement = aElement.select("img").get(0);  // aElement에서 img가 들어간 값들 첫번째를 imgElement 에 반환 
				String imgUrl = imgElement.attr("src"); // src 요소를 url에 저장 
//				System.out.println(imgUrl);
				
				String title = imgElement.attr("alt");    //alt 요소를 타이틀에 저장
//				System.out.println(title);
				
				Document detailDoc = Jsoup.connect(newsUrl).get();      //detailDoc에 newsUrl에 접속해서 얻은 값들을 반환
				Element contentElement = detailDoc.getElementById("dic_area"); // 반환 받은 값에서 id속성에 dic_area 요소를 반환
				String content = contentElement.text(); // 반환받은 값에서 텍스만 저장
				
//				System.out.println(content);
//				System.out.println();
			
				
//				db.mydbInsert(title,content);  // title 값과 content 값을 데이터 베이스에 저장
			}//j값이 
		
		} // end for

//		Database db = new Database();
////		db.getConnection();
		db.mydbListData();
//		
//		db.mydbInsertin("content");
		
//		db.mydbInsert(13, "김이박", "남성");
//		System.out.println("--------------------");
//		db.mydbInsert(13, "김이박", "남성", "김씨이씨박씨");
//		System.out.println("--------------------");
//		
//		db.mydbUpdate(15, "으으으", "으으");
//		db.mydbDelete(13);
//		db.mydbListData();
//		System.out.println("--------------------");
//		db.mydbSelect(4);
	}

	}