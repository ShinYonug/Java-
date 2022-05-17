class Tv1 {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp 	() {++channel ; }
	void channelDown ()	{--channel ; }
}
public class Ex6_2 {

	public static void main(String[] args) {

		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();

		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t1.channel = 7;
	    t2 = t1 ;
	    
	    System.out.println(t1.channel);
	    t1.channelUp();
	    System.out.println(t2.channel);
		
		
		
	}

}
