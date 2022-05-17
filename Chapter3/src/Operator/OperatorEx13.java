package Operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1+1   컴파일 에러!!! 에러가 안나기 위해서는 c1+1 을 묶고 char형으로 형변환 해주어야 한다
		char c2 = 'a'+1;
		
		System.out.println(c2);
	}

}
