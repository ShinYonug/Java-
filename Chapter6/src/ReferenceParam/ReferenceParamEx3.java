package ReferenceParam;

public class ReferenceParamEx3 {

	public static void main(String[] args) {

		int[] arr = new int[] {3,2,1,6,5,4} ;
		
		printArr(arr); // 배열의 모든 요소를 출력;
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));
	}

	static void printArr(int[] a) {
		System.out.print("[");
		for(int i : a) 
			System.out.print(i + ",");
		
		System.out.println("]");
		}
		
	static void sortArr(int[] a) {
		for(int i = 0 ; i<a.length -1 ; i++)
			for(int  j= 0 ; j <a.length -1 -i; j++)
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
	}
	static int sumArr( int[] a) {
		int sum = 0;
		
		for(int i = 0 ; i<a.length; i++)
			sum += a[i];
		return sum;
	}
	
}

