package ArrayMethod;

import java.util.*;

public class sortsearch {

	public static void main(String[] args) {

		int[] arr = {3, 2, 0, 1, 4};
		int idx = Arrays.binarySearch(arr, 2);
		System.out.println(idx);   //-5로 잘못된 결과가 나온다 먼저 꼭 정렬을 하고나서 바이너리 서치를 이용
		
		Arrays.sort(arr);  // arr배열을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		int idx2 = Arrays.binarySearch(arr, 2);
		System.out.println(idx2);
				
	}
}
