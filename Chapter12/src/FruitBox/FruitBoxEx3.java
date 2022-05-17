package FruitBox;

import java.util.ArrayList;

class Fruit3{public String toString()	{return "Fruit3";}}
class Apple3 extends Fruit3{public String toString()	{return "Apple3"; }}
class Grape3 extends Fruit3{public String toString()	{return "Grape3";}}

class Juice{
	String name;
	
	Juice(String name)		{this.name = name + "Juice" ; }
	public String toString()	{return name;}
}
class Juicer{
	static Juice makeJuice(FruitBox3<? extends Fruit> box) {
		String tmp = "";
		
		for( Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}
public class FruitBoxEx3 {

	public static void main(String[] args) {
		
		FruitBox3<Fruit> fruitBox = new FruitBox3<Fruit>();
		FruitBox3<Apple> appleBox = new FruitBox3<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());

		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}
class FruitBox3<T extends Fruit> extends Box3<T>{}

class Box3<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size() {return list.size()	;}
	public String toString() {return list.toString();}

		
	}
