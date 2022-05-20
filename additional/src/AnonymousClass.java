interface Printable{
	void print();
}
class Papers{
	
	private String con;
	public Papers(String s) { con = s;}

	
	
	public Printable getPrinter() {
		 // 익명 클래스의 정의와 인스턴스 생성        
		return new Printable() {//몸체 없이 new Printable 했으면 객체 생성 못하지만 몸체 있으면 가능
			public void print() {
			System.out.println(con);
			}
		};
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();

	}
}
