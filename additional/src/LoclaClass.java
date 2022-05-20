//interface Printable{
//	void print();
//}
//class Papers{
//	
//	private String con;
//	public Papers(String s) { con = s;}
//
//	
//	
//	public Printable getPrinter() {
//		//local class 은닉의 정도가 더 크다
//		class Printer implements Printable{
//			public void print() {
//			System.out.println(con);
//			}
//		}
//			return new Printer();
//	}
//}
//public class LoclaClass {
//	public static void main(String[] args) {
//		Papers p = new Papers("message java!!");
//		Printable prn = p.getPrinter();
//		prn.print();
//
//	}
//
//}
