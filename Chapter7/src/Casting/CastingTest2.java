package Casting;

public class CastingTest2 {

	public static void main(String[] args) {

//		Car car = new Car();
//		Car car2 = null;	
//		FireEngine fe = null;	
		
//		car.drive();
//		fe = (FireEngine)car;
//		fe.drive();
//		car2 = fe;
//		car2.drive();
		
		Car car = new FireEngine();
		FireEngine fe = new FireEngine();
		Car car2 = car;
		FireEngine fe2 = (FireEngine)car2;
		fe2.water();;
	
	}

}
// 실제 인스턴스가 무엇인지가 중요.