package WildCard;

class Box<T>{
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
	
}	
class UnBoxer{
	public static <T> T openBox(Box<T> box) {
		return box.getOb()	;
	}
	public static <T> void peekBox(Box<T> box) {
		System.out.println(box);
	}
	
}

public class WildCarUnBoxerEx {
	public static void main(String[] args) {
	Box<String> box = new Box<>();
	box.setOb("apple");
	UnBoxer.peekBox(box);
}
}
