package FruitBox;

import java.util.ArrayList;

interface Eatable {}
class Fruit implements Eatable{
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy 			      { public String toString() {return "Toy";}}

public class FruitBoxEx2 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
	// appleBox.add(new Grape()	)	; 그레이프는 에플의 자손이 아님 즉 객체 생성해서 참조가 불가능함 상위클래스는 하위 클래스 참조가 가능하고 하위는 상위 참조 x
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBOx-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}

}                             //인터페이스 구현을 & 기호로 표시
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
