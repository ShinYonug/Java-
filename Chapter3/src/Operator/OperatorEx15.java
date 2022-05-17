package Operator;

public class OperatorEx15 {

	public static void main(String[] args) {
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase -32);
		System.out.println(upperCase);
		
		for(int i = 0; i< 26; i++ ) {
			upperCase = (char)(lowerCase -32 +i);
			System.out.print(upperCase);
		}
		System.out.println();
		System.out.print(upperCase);
	}

}
