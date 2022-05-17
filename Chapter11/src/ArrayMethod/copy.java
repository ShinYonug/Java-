package ArrayMethod;
import java.util.Arrays;
import java.util.Arrays.*;
public class copy {

	public static void main(String[] args) {

		//toString() 모든 기본형과 참조형 배열 별로 하나씩 있다
//		static String toString(int[] a)	;   
		
		//copyOf()     // copyOfRange() -- 지정된 범위의 끝은 포함되지 않는다.
		//배열 전체를 ,   // 배열의 일부를                복사해서 새로운 배열을 만들어 반환한다.
	int[] arr = new int[] {1,2,3,4,5,6};
	int[] arr2 = Arrays.copyOf(arr, arr.length); // 배열 arr을 처음부터 배열의 길이만큼 (실제로는 -1) 복사한다
//	System.out.print(Arrays.toString(arr2));
	int[] arr3 = Arrays.copyOf(arr, 3); // 배열 arr을 처음부터 3 길이만큼 복사한다 -- arr[0] , arr[1], arr[2]
//	System.out.print(Arrays.toString(arr3));
	int[] arr4 = Arrays.copyOf(arr, 10); // 배열을 초과하는 자리에 대해서는 null값인 0으로 초기화된다
//	System.out.print(Arrays.toString(arr4));
	int[] arr5 = Arrays.copyOfRange(arr, 2, 4);   // arr[2] , arr[3] 만 복사한다
//	System.out.print(Arrays.toString(arr5));
	int[] arr6 = Arrays.copyOfRange(arr, 0, 10); //값이 없는 경우는 null값인 0으로 반환한다 
	System.out.print(Arrays.toString(arr6));
	
			
	}

}
