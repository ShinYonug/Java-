
// TvTest
	class Tv{
	String color;
	boolean power;
	int channel;

	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
	}
	
	public class Ex6_1 {
	public static void main(String[] args) {

		Tv t = new Tv();
		t.channel = 10;
		t.channelUp();
		System.out.println(t.channel);
	}

}
