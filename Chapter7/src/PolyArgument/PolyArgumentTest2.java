package PolyArgument;

public class PolyArgumentTest2 {

	public static void main(String[] args) {

		Buyer2 b2 = new Buyer2();
		b2.buy(new Tv2());
		b2.buy(new Computer2());
		b2.buy(new Audio2());
		b2.summary();
		
		
		
	}

}
class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
//	Product(){}
}
class Tv2 extends Product2{
	Tv2(){ super(100);}
	public String toString() {return "Tv";}
}
class Computer2 extends Product2{
	Computer2(){ super(200);}
	public String toString() {return "Computer";}
}
class Audio2 extends Product2{
	Audio2(){ super(50); }
	public String toString() {return "Audio";}
	}
class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	int i= 0;
	
	Product2[] item = new Product2[10];
	void buy(Product2 p2) {
	if(money<p2.price) {
		System.out.println("잔액 부족");
		return;
	}
	money -= p2.price;
	bonusPoint += p2.bonusPoint;
	item[i++] = p2;
	
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