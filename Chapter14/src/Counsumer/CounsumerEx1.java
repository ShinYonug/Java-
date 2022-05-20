package Counsumer;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class CounsumerEx1 {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("consumer!!");

		c.accept("java consumer");
		//						<String>,int
		ObjIntConsumer<String> c2 = (s,i) -> System.out.println(i + " , " + s);
		ObjIntConsumer<String> c3 = (s,d) -> System.out.println(d + ", " + s);
		
		int n = 1;
		double d = 1.1;
		
		c2.accept("toy", n++);
		c2.accept("robot", n++);
		c2.accept("box", n++);
		
		c3.accept("toy", n++);
		c3.accept("robot", n++);
		c3.accept("box", n++);
		
	}
}
