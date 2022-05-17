package ArrayMethod;

import java.util.*;

public class fillsetall {

	public static void main(String[] args) {

		
		
		int[] arr = new int[5];
		Arrays.fill(arr, 9);      //fill() 은 지정된 값을 모든 요소를 채운다
		System.out.println(Arrays.toString(arr));
		Arrays.setAll(arr, i -> (int)(Math.random()*9)+1);//setAll() 은 배열을 채우는데 사용할 함수형 인터페이스를 구현한 
		System.out.println(Arrays.toString(arr));         //매개변수를 지정하던가 아니면 람다식을 지정해야한다.
	}

}
