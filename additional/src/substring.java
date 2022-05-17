




public class substring {
//	활용 예제로는 마지막 3글자 자르기, 특정 문자 이후의 문자열 자르기, 특정(단어) 부분만 자르기
	public static void main(String[] args) {
		
		int start = 1;
		int end = 3;
		String str1 = "abcd";
		
		
		str1.substring(start); //문자열  start위치부터 끝까지 문자열 자르기
		System.out.println(str1.substring(start));
				//bcd
		str1.substring(start,end); //문자열  start위치 부터 end전까지 문자열 발췌
		System.out.println(str1.substring(start,end));
				//bc
		//--------------------------------------------
		String str2 = "ABCDEFG"; //대상 문자열
		/*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/
				
		str2.substring(3); 
		System.out.println(str2.substring(3));
		/*substring(시작위치) 결과값 = DEFG*/

		str2.substring(3, 6); 
		System.out.println(str2.substring(3,6));
	//def
		
		//1. 마지막 3글자 자르기
		String result1 = str2.substring(str2.length()-3, str2.length());
		System.out.println(result1);
		 //결과값EFG
		//2. 특정문자 이후의 문자열 제거          //여기부터는 아직 이해 안하고 넘어감 추후에 다시 봐야함
//		String str3 = "ABCD/DEFGH";
//		String result2 = str3.substring(str3.lastIndexOf("/")+1); 
//		System.out.println(result2); 
//		//결과값 DEFGH
//		//3. 특정단어(부분)만 자르기
//		String str4 = "바나나 : 1000원, 사과 : 2000원, 배 : 3000원";
//		String target = "사과";
//		int target_num = str4.indexOf(target); 
//		String result3 = str4.substring(target_num,(str4.substring(target_num).indexOf("원")+target_num));
//		System.out.println(result3+"원"); 
//		//결과값 : 사과 : 2000원
	
	}
}