package PolyArgument;

public class PolyArgumentTest3 {

	public static void main(String[] args) {

		Buyer3 b3 = new Buyer3();
		b3.buy(new Tv3());
		b3.buy(new Computer3());
		b3.buy(new Audio3());
		b3.summary();
		
		
		
	}

}
class Product3{
	int price;
	int bonusPoint;
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
//	Product(){}
}
class Tv3 extends Product3{
	Tv3(){ super(100);}
	public String toString() {return "Tv";}
}
class Computer3 extends Product3{
	Computer3(){ super(200);}
	public String toString() {return "Computer";}
}
class Audio3 extends Product3{
	Audio3(){ super(50); }
	public String toString() {return "Audio";}
	}
class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	int i= 0;
	
	Product3[] item = new Product3[10];
	void buy(Product3 p3) {
	if(money<p3.price) {
		System.out.println("잔액 부족");
		return;
	}
	money -= p3.price;
	bonusPoint += p3.bonusPoint;
	item[i++] = p3;
	
	}
	void refund(Product3 p3) {
		
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		for(int i =0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] +",";
		}
		System.out.println(sum);
		System.out.println(itemList);
	}
	
}