package List;

import java.io.*;
import java.util.*;




public class StudentManagement {

	static ArrayList record = new ArrayList(); // 성적 데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			switch(displayMenu()) {
			case 1 : inputRecord(); break;
			case 2 : displayRecord(); break;
			case 3 : System.out.println("프로그램을 종료합니다.");
					 System.exit(0);
			}// switch
		}// while
	}// main
	static public int displayMenu() {
System.out.println("***********************");
	System.out.println("*    성적 관리 프로그램    *");
System.out.println("***********************");
	System.out.println();
	System.out.println(" 1. 학생성적 입력하기");	
	System.out.println();
	System.out.println(" 2. 학생성적 보기");	
	System.out.println();
	System.out.println(" 3. 프로그램 종료");	
	System.out.println();
	System.out.println("원하는 메뉴를 선택하세요.(1~3) ");
	
	int menu = 0;
	
	while(true) {
		menu = s.nextInt();
		if( menu >3 || menu < 1) {
			System.out.println("다시 입력하세요 (1~3)") ;
			continue;
		}// if
		else return menu;
	}// while
	}// displayMenu
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름,반,번호,국어성적,영어성적,수학성적 의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
	String input = "";
	while(true) {
		System.out.println(">>");
		try {
		 input = s.nextLine();
		 
		}catch(Exception e) {
			System.out.println("입력 오류입니다. 다시 입력하세요");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력하세요.");
		}//try-catch
		StringTokenizer st = new StringTokenizer(input); 
		String name = st.nextToken();
		int ban = Integer.parseInt(st.nextToken());
		int no = Integer.parseInt(st.nextToken());
		int kor = Integer.parseInt(st.nextToken());
		int eng = Integer.parseInt(st.nextToken());
		int math = Integer.parseInt(st.nextToken());
		record.add(new Student(name,ban,no,kor,eng,math));
		if(s.nextLine().equalsIgnoreCase("q")) {  break;}

			
			
	
	}// while
	}//inputRecord
	static void displayRecord() {
		int korTotal = 0, engTotal = 0, mathTotal = 0, total = 0;
	    int length = record.size();
	    
	    if(length > 0) {
	    	System.out.println();
	    	System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
System.out.println("==========================================================================");
				System.out.println("총점:" + korTotal + " " + engTotal + " " + mathTotal + " " + total);
				System.out.println();
	    }else {				
System.out.println("==========================================================================");
				System.out.println("데이터가 없습니다.");
System.out.println("==========================================================================");
	    }// else
	    }// displayRecord
}// class
class Student implements Comparable{
	String name;
	int ban, no, kor, eng, math, total, schoolRank, classRank ;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/3f)*10 + 0.5)/10f;
	}
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return tmp.total - this.total;
		}else { return -1;}
	}// compareto
	public String toString() {
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal()+", "+getAverage()+", "+schoolRank+", "+classRank ;
	}
}// Student