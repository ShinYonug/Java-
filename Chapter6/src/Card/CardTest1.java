package Card;
class Card{
	String kind ; 
	int number;
	static int width = 100;
	static int height = 250;
}
public class CardTest1 {

	public static void main(String[] args) {
		

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width 와 height 를 각각 50, 80으로 변경합니다 ");
		c1.width= 50;
		c1.height = 80;
	
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}

// static 이 붙어있는 공유 변수는 클래스명을 입력후 직접 접근이 간으하지만
// 인스턴스 변수는 접근이 불가능하다
// 인스턴스 변수에 접근을 하려면 객체를 생성하여야 접근이 가능하다.