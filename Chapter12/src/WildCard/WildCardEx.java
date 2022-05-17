package WildCard;

public class WildCardEx {

	public static void main(String[] args) {
		//< ? extends T > -- >>  T와 그 자손들만 가능 
		//< ? suepr T > -- >> T와 그 조상들만 가능
		//< ? > 제한이 없음 , <? extends Object> 와 같은 의미이다
		
		//B<T> b    --// 제너릭 메서드 기반
		//B<?> b    --// 와일드 메서드 기반
		//제너릭에서는 반환타입 앞에 <T>를 써줘야하지만            public static <T> void peekBox(Box<T> box)
		//와일드에서는 반환타입 앞에 <T>를 생략할 수 있다.         public static void peekBox(Box<?> box)
//		Box<Integer> box = new Box<>();
//		box.setOb(123);
//		UnBoxer.peekBox(box);
//		
//		Box<Number> box2 = new Box<>();
//		box2.setOb(12.4);
//		UnBoxer.peekBox(box2);
//		
//		Box<Object> box3 = new Box<>();
//		box3.setOb("String");
//		UnBoxer.peekBox(box3);
	}
}
