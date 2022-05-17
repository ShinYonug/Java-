package Operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		int a= 10;
		int b= 4;
		
		System.out.printf("%d + %d = %d%n", a , b, a+b);
		System.out.printf("%d - %d = %d%n", a , b, a-b);
		System.out.printf("%d * %d = %d%n", a , b, a*b);
		System.out.printf("%d / %d = %d%n", a , b, a/b);
		System.out.printf("%d / %f = %f%n", a , (float)b, a/(float)b);
	}

}
//int 타입은 결과값이 정수로 반환되기에 소수점 아래는 버려진다 이 떄 반올림이 발생하지 않음
//소수점 아래를 출력하기 위해서는 float형으로 형변환을 해준다