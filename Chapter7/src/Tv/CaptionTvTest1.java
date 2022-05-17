package Tv;

class Tv{
	boolean power; // 전원상태
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class CaptionTv extends Tv{
	boolean caption; // 캡션상태 온오프
	void displayCation(String text) {
		if (caption) { //캡션 상태가 on일때만 text를 보여준다
			System.out.println(text);
		}
	}
}

public class CaptionTvTest1 {

	public static void main(String[] args) {

		CaptionTv ctv = new CaptionTv()	;
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCation("Hello World");
		ctv.caption = true;
		ctv.displayCation("Hello Wolrd");
		
	}

}
