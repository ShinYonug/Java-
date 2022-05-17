package Operator;

public class OperatorEx18 {

	public static void main(String[] args) {

		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//Math.round 는 소수점 첫째자리에서 반올림하고 그 결과 값을 정수로 반환하는 메서드이다
		System.out.println(shortPi);
	}

}
