package TargetTypes;

class Box<T>{
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
}	
class EmptyBoxFactory{
	public static <T> Box<T> makeBox(){ //제너릭 메소드이다   스태틱이 붙어있기에 객체 생성해서 접근해도 가능하고 그냥 클래스. 으로 접근해도 사용가능
		Box<T> box = new Box<T>();
		return box;
	}
}
public class TargetTypesEx {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
	
		iBox.setOb(25);
	
		System.out.println(iBox.getOb());
	
	}

}
