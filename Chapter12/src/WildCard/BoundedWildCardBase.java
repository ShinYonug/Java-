package WildCard;

class Box3<T>{
	private T ob;
	public T getOb() { return ob;}
	public void setOb(T ob) {this.ob=ob;}
	
	public String toString() {
		return ob.toString()	;
	}
}
class Toy3 {
	public String toString() {
		return "I am Toy";
	}
}
class BoxHandler	{
	public static void outBox(Box3<? extends Toy3> box) {
		Toy3 t = box.getOb()	;
		System.out.println(t);
//		box.setOb);
	}
	public static void inBox(Box3<? super Toy3> box, Toy3 t) {
		box.setOb(t);
//		box.getOb(t);
	}
}

public class BoundedWildCardBase {

	public static void main(String[] args) {

		Box3<Toy3> box = new Box3<>();
		BoxHandler.inBox(box, new Toy3());
		BoxHandler.outBox(box);
		
		
		
	}

}
