package BoundedGenericks;
//클래스 박스 < 티 상속 넘머 > T에올 수 있는 대상은 Number이거나 상속한 객체만 가능
class Box<T extends Number>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() {
		return ob.intValue()	;    // 위에 클래스에서 제레닉스에 넘버를 상속한다는 조건이 없으면 값을 인트값으로 반환하는 이 문장은 오류가 난다.
		// 즉 인트값으로 받게하기 위해서는 위에 제네릭스에서 타입에 넘버를 상속한다는 제한을 걸면 가능하다 
		
	}
}
class Person{}
public class BoundedBoxEx {

	public static void main(String[] args) {
		
		Person p = new Person();
		
//		Box<Person> abox = new Box<>();
//		Box<Double> bbox = new Box<>();
//		bbox.set(new Doubld(10.5));
		
		
	
		
	}

}
