package Operator;

public class OperatorEx8 {

	public static void main(String[] args) {

		int a = 1_000_000;  //1백만
		int b = 2_000_000; // 2백만
		
		long c= a * b ;    //a * b = 2,000,000,000,000
		long d= (long)a*b;
		long e= (long)(a*b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
// 올바른 결과를 얻으려면 long 형으로 형변환을 해줘야 한다
// long (a * b ) 경우 이미 값이 int 값이기 때문에 long 으로 형변환 해도 다른 값이 출력 된다.