package Lambda;
interface Printable1{ void print(String s); }

class Printer implements Printable1{

	@Override
	public void print(String s) { System.out.println(s); }
	
	
}
public class Lambda {

	public static void main(String[] args) {
		Printable1 prn = new Printer();
		prn.print("java is lambda!!");
	}

}