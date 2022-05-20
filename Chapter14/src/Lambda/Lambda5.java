package Lambda;

interface Calculate2{ int cal(int n1,int n2); }

class Caltor implements Calculate2{

	@Override
	public int cal(int n1, int n2) {
		System.out.println(n1*n2);
	return n1*n2;
	}
	
	
}

public class Lambda5 {

	public static void main(String[] args) {
		
//		Calculate c = (int n1, int n2)  -> {
//			return n1+n2;
//		};

//		System.out.println(c.cal(5, 2));
		
//		c = ( n1, n2) -> n1 + n2;
//		System.out.println(c.cal(5, 9));
		 // 람다에서는 인터페이스에 리턴문이 없어도 유추가 가능하다면 된다
		Calculate2 c = new Caltor();
		c.cal(1, 2);
		
	}

}
