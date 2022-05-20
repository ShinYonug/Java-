package LambdaEx;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
	public static void main(String[] args) {
	IntSupplier s = ()-> (int)(Math.random()*100)+1;
//	IntConsumer c = i -> System.out.print(i + ", ");
//	IntPredicate p = i -> i%2 == 0;
//	IntUnaryOperator op = i -> i/10*10;
	
	int[] arr = new int[10];
	
	makeRandomList(s, arr);
	System.out.println(Arrays.toString(arr));
//	printEvenNum(p,c,arr);  //
//	int[] newArr = doSomething(op, arr);
//	System.out.println(Arrays.toString(newArr));
}
									
//	private static int[] doSomething(IntUnaryOperator op, int[] arr) { // i -> i/10*10
//		int[] newArr = new int[arr.length];
//		
//		for(int i = 0 ; i<newArr.length; i++) {
//			newArr[i] = op.applyAsInt(arr[i]);     //apply() 가 아님 주의
//		}
//		return newArr;
//	}
//
//	private static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {//i-> i%2==0 , i ->sysout"i + "," "
//			System.out.println("[");
//			for(int i : arr) {
//				if(p.test(i))
//					c.accept(i);
//			}
//			System.out.println("]");
//	}
//
private static void makeRandomList(IntSupplier s, int[] arr) { // (int)(Math.random()*100)+1
		for(int i = 0; i<arr.length; i++)
			arr[i] = s.getAsInt();       //
	}
}
