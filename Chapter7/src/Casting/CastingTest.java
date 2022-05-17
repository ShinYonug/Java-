package Casting;

 class  Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("Stop!!!");
	}

}
 class FireEngine extends Car{
	
	void water() {
		System.out.println("water!!!");
	}
}

public class CastingTest {

	public static void main(String[] args) {

		Car car = null;                              //Car타입의 참조변수car 을 선언하지만 null 로 초기화
		FireEngine fe = new FireEngine();           // FireEndine 타입의 참조변수 fe를 선언하고 FireEngine 타입의 참조변수가 참조하도록한다.
		FireEngine fe2 = null;                      // 
		
		fe.water();                                 
		car = fe;                                    // fe가 참조하고 있는 참조변수를 car가 참조하도록 한다.
		//car.water()	; 조상 타입으로는 자손타입의 메서드를 호출 불가능          // car타입이므로 참조하는건 같지만 타입이 달라 호출 불가능
		fe2 = (FireEngine)car;                      // FireEngine 타입으로 형변환하여 fe2가 참조하도록 한다
		fe2.water();                                 // car의 참조변수를 참조하며 타입도 FireEngine이므로 water 메서드 호출이 가능.
	
	}

}
