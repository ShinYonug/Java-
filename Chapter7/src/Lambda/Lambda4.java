//package Lambda;
//
//interface Printable4{ void print(String s); }
//
////interface Calculate{
////	void cal(int n1,int n2);
////}
//interface Calculate1{ void cal(int n1,int n2); }
//
//class Cal implements Calculate1{
//
//	@Override
//	public void cal(int n1, int n2) {
//		System.out.println(n1+n2);
//	}
//	
//	
//}
//
//class printer implements Printable4{
//
//	@Override           // 인터페이스에 프린트 기능을 가져왔지만 안에 시스아웃이 없어서 에러남 이경우 오버라이딩 필수
//	public void print(String s) {
//	System.out.println(s);
//	}
//	
//}
//
//public class Lambda4 {
//
//	public static void main(String[] args) {
//		
//		Printable4 prn;
//		prn = (String s) -> {   System.out.println(s);	};
//		prn.print("java is lambda1!!");
//
//		prn = (String s) ->    System.out.println(s) ;
//		prn.print("java is lambda2!!");
//		
//		prn = (s) ->    System.out.println(s) ;
//		prn.print("java is lambda3!!");
//		
//		prn = s ->    System.out.println(s) ;	
//		prn.print("java is lambda1!!");
//		
//		Calculate1 c = new Cal();
//		c.cal(10, 10);
//		
////		c = (int n1, int n2) -> {
////			System.out.println(n1 + n2);
////		};
////		c.cal(5, 2);
//		
//		c = (int n1, int n2) -> { System.out.println(n1 + n2); };
//		c.cal(5, 2);
//		
//		c = (n1, n2) -> { System.out.println(n1 + n2); };
//		c.cal(5, 4);
//		
//		c = (n1, n2) ->  System.out.println(n1 + n2); 
//		c.cal(7, 2);
//		
//	}
//
//}
