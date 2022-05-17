import java.util.*;

public class sort{
    public static void main(String[] args)  {
        String arr[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr); // 오름 차순으로 정렬해줌
        for (String i : arr) {
        	System.out.print("["+i+"]");
        }System.out.println();
        
        
        Arrays.sort(arr,Collections.reverseOrder());// 내림 차순으로 정렬해줌
        for (String j : arr) {
        	System.out.print("["+j+"]");
        }System.out.println();
        String arr2[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr2, 0 , 3);// arr 배열에 0번째부터 3번까지만 정렬해줌 (0,1,2,3)
        for(String k : arr2) {
        	System.out.print("["+k+"]");
        }
    }
}
