package FinalCard;


class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
			
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}

	public String toString() {
		return KIND + " "	+ NUMBER;
	}
}
public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART" , 10);
//		c.NUMBER = 5;   // final이 붙어있어서 직접 변경이 안됌 생상저를 통해서 변경해야한다
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
		
	}

}
