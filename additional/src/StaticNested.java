/*
 * Nested 클래스 와 Inner 클래스
 * Nested ==> static
 * 
 * Inner --> static X
 * Member inner class
 * Local inner class
 * Anonymous inner class
 */

 class Outer2{
	private static int num = 0;
	
	static class Nested1{
		void add( int n ) {num += n;}
	}
	static class Nested2{
	int get() {return num;}
}
}

public class StaticNested {
	public static void main(String[] args) {
		Outer2.Nested1 nst1 = new Outer2.Nested1();
		nst1.add(10);
		Outer2.Nested2 nst2 = new Outer2.Nested2();
		System.out.println(nst2.get());
	}
}
