package SingleTon;

final class Singleton{
	
	private static Singleton s = new Singleton();
	
	private Singleton() {}

	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	}

	
}

public class SingletonTest {

	public static void main(String[] args) {

//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		
	}

}// 생성자를 통해 직접 인스턴스를 생성하지 못하게 하고 퍼블릭 메서드를 통해 인스턴스에 접근하게 함으로써 
// 사용할 수 있는 인스턴스의 개수를 제한할 수 있다
