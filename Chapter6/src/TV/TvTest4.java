package TV;

public class TvTest4 {

	public static void main(String[] args) {

		Tv4[] tvArr = new Tv4[3]; // 길이 3인 Tv객체 배열
		//Tv 객채 생성해서 각 요소에 저장
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv4();
			tvArr[i].channel = i + 10; // tvArr 각 배열에 10+i 값을 저장
		}
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp(); // 각 채널 메서드 호출 각각 1증가
			System.out.printf("tvArr[%d].channel = %d%n" , i , tvArr[i].channel);
		}
		
		
		
	}

}

class Tv4 {
	// Tv의 속성 (멤버 변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능 (메서드)
	void power()	 { power = !power ;  }
	void channelUp()   { ++channel ; }
	void channelDown() { --channel ; }
}