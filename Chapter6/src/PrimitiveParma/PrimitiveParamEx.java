package PrimitiveParma;

public class PrimitiveParamEx {
	public static void main(String[] args) {

		Data d= new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x );
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+ d.x);
	}
	static void change( int x) {// d.x 값이 변경된게 아니라 change메서드에 있는 매개변수 x값이 변경되었음.
		x=1000;
		System.out.println("change() : x = " + x);
	}
}
class Data { 
	int x ;
	}