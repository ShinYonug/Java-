package PolyArgument;

public  class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println(b.money + " ," + b.bonusPoint);
	}

}
class Product{
	int price;
	int bonusPoint;
	
	Product( int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv extends Product{
	Tv(){
		//조상 클래스의 Product(int price)를 호출한다
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	public String toString(){ return "Tv";}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString(){ return "Computer";}
}
class Audio extends Product{
	Audio(){
		super(300);
	}
	public String toString(){ return "Audio";}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
	if(money<p.price) {
		System.out.println("잔액 부족"); return;
	}
	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p + "구입하였습니다.");
	}
}