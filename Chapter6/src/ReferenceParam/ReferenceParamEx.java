package ReferenceParam;

class Data { int x; }

public class ReferenceParamEx {
	public static void main(String[] args) {

//		Data a = new Data();
//		a.x = 10;
//		System.out.println("main() : x = " + a.x);
		Abc b = new Abc();
		b.y = 12;
		change(b);
		System.out.println("After change(a)");
		System.out.println("main() : x = " + b.y);
		System.out.println("a.x = " + b.y);
	
	}
	static void change(Abc x) {//Abc 클래스의 주소값
		x.y = 500;
		System.out.println("change() : x = " + x.y);
		
	}

}
class Abc{
int y;
}
