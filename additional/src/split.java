import java.util.Arrays;

public class split {
	public static void main(String[] args) {
		//문법
//		문자열배열 = 대상문자열.split("기준문자");
//      문자열에서 기준문자 기준으로 문자열을 잘라 배열에 넣는다
		//예제
		String str = "";

		for(int i=0;i<5;i++) {
		str += i+"#";
		}
				
		String[] array = str.split("#");
				
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}

		//결과값 
		//array[0] = 1
		//array[1] = 2
		//array[2] = 3
		//array[3] = 4
		//2. 공백(" ")으로 문자열 잘라서 배열에 넣기
		String str1 = "동해물과 백두산이 마르고 닳도록 하나님이 보우하사 우리나라 만세";
		String[] array1 = str1.split(" ");
				    
		//출력				
		for(int i=0;i<array1.length;i++) {
		System.out.println(array1[i]);
		}
		System.out.println(Arrays.toString(array1));// 배열 내용 출력
				  
		//결과값 
		//array[0] = 동해물과
		//array[1] = 백두산이
		//array[2] = 마르고
		//array[3] = 닳도록
		//array[4] = 하나님이
		//array[5] = 보우하사
		//array[6] = 우리나라
		//array[7] = 만세
	}

}