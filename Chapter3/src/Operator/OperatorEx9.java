package Operator;

public class OperatorEx9 {

	public static void main(String[] args) {

		long a= 1_000_000 * 1_000_000;
		long b= 1_000_000 * 1_000_000L;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}
// a 는 int 값인 2*10^9 를 넘는 값이 나와서 오버플로우가 발생한다
