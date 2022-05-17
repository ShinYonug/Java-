package day220517;
import java.util.Scanner;
//프로그래머스 레벨1 Java 연습문제
public class printStar {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        
	        
	        for(int i = 0; i<b ; i++){
	            for(int j = 0; j<a ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}

