package ArrayList;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {

		final int LIMIT = 10;     //자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();      // source 의 글자 개수가 = 길이
		
		List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 잡는다. 약 14정도 됨
		
		for( int i = 0 ; i< length; i+=LIMIT) {  // i는 10씩 증가 i=0~10 i=10~20 ...
			if(i+LIMIT < length)                         
				list.add(source.substring(i, i+LIMIT));   //substinf i부터 i+LIMIT 전까지 잘라 list에 추가하기 
			else
				list.add(source.substring(i)); // i 부터 끝까지 자르기
		}
				
		for( int i = 0; i < list.size(); i++) {  //list 0~4까지 출력하는 포분
			System.out.println(list.get(i));
		}
	}

}
