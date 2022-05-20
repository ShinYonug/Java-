//Member inner class
class Outer{
	
	private int num  = 0;
	
	class Member{
		void add(int n) { num += n;}
		int get() {return num;}
	}
}
public class MemberClass {

	public static void main(String[] args) {

		Outer out1 = new Outer();
		Outer out2 = new Outer();
		Outer.Member o1 = out1.new Member();      // 아우터의 객체 생성 후 객체 통해서 뉴연산자 사용
		Outer.Member o2 = out2.new Member();
		
		o1.add(5);
		System.out.println(o1.get());
		o2.add(2);
		System.out.println(o2.get());
	}

}
