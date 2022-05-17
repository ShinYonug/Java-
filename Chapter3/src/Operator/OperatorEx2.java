package Operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0; // 한줄에 ,를 써서 작성이 가능
		
		j = i++;
		 System.out.println("j = i++; 실행 후 , i=" + i + ", j= "+ j);
		 
		 i=5;     // 결과를 비교하기 위해서 다시 초기화.
		 j=0;
		 
		 j= ++i;
		 System.out.println("j=++i; 실행 후 i= " + i + ", j="+j);
	}

}
// 후위형은 j 에 값이 먼저 저장되고 i 값이 증가하지만
// 전위형은 i 값이 먼저 증가하고 j에 저장된다