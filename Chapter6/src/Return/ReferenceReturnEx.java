package Return;
class Data { int x ; }
public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		d2.x = 20;
		System.out.println("d.x = "+ d.x);
		System.out.println("d2.x = "+ d2.x);
	}

	static Data copy(Data d) {    // 반환 타입이 참조형이라는 것은 메서드가 객체의 주소를 반환한다는 의미이다
		Data tmp = new Data();   // tmp(0x200) 객체를 생성하고 tmp 객체에 있는 x에 d에 있는 x값을 저장
		tmp.x = d.x;	           // tmp 주소값을 copy(d) 에 반환 즉 d2는 0x200 주소값을 가지고 x의 값이 10이 저장되어있는것이다
		return tmp;               // 그래서 d , d2 는 각각 주소값이 다르고 저장된 변수의 값도 별개의 값이다
	}
}
