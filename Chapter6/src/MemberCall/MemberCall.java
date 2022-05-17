package MemberCall;

public class MemberCall {

		int iv = 10;
		static int cv = 20;
		
		int iv2 = cv;
//		static int cv2 = iv;// 클래스 변수는 인스턴스 변수를 사용할 숭 없음.
		static int cv2 = new MemberCall().iv; // 사용하기 위해서는 객체를 생성해야만 가능.
		
		static void staticMethod1() {
			System.out.println(cv);
//			System.out.println(iv); // 에러가 난다 클래스 메서드에서 인스턴스 변수를 사용이 불가능하다
			MemberCall m = new MemberCall()	;
			System.out.println(m.iv); // 객체를 생성한 후에야 인스턴스 변수의 참조가 가능하다
	System.out.println(new MemberCall().iv);
		}
		void instanceMethod1() {
			System.out.println(cv);
			System.out.println(iv);  // 인스턴스 메서드에서는 인스턴스변수를 바로 사용이 가능하다.
		}
		
		static void staticMethod2() {
			staticMethod1();
//			instanceMethod1(); // 클래스 메서드에서는 인스턴스 메서드를 호출 불가능
			MemberCall c = new MemberCall()	;
			c.instanceMethod1();    //객체를 생성해야 인스턴스 메서드 호출 가능
		}
		void instanceMethod2() { // 인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 객체 생성없이 호출 가능하다.
			staticMethod1();
			instanceMethod1();
		}
	}


