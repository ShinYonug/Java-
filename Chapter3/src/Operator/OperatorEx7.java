package Operator;

public class OperatorEx7 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
	}

}
// int 형을 byte 형에 저장하면 손실값이 발생하여 44가 출력