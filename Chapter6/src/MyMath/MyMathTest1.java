package MyMath;

public class MyMathTest1 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		// mm.method(long a, long b) 의 결과값을 호출한다 그 값을  long result 에 저장한다; 
		// long result ;
		//result = mm.add(long a , long b )
		// 두문장 축약한거임 단순.
		System.out.println("add(5L, 3L) = "+ result1);
		System.out.println("subtract(5L, 3L) = "+ result2);
		System.out.println("multiply(5L, 3L) = "+ result3);
		System.out.println("divide(5L, 3L) = "+ result4);
//	System.out.println(mm.add(5L, 3L));
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b; 위에 두 줄을 이와같이 한줄로 표시 가능하다
	}
//	long subtract(long a, long b) {return a - b ; }
	long subtract(long a, long b) {
		long result = a - b ;
		return result;
		//return a - b; 와 같다
	}
	long multiply(long a, long b) {
		long result = a * b ;
		return result;
		//return a*b; 랑 같다
	}
	double divide(double a, double b) {return a / b ; }

}
