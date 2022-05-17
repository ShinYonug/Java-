package TV;

class Tv5{
	int channel;
	
	void channelUp() {++channel;}
}
public class TvTest5 {

	public static void main(String[] args) {

		Tv5[] tvArr = new Tv5[3];
		
		for(int i = 0; i < tvArr.length; i++	) {
			tvArr[i] = new Tv5();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0 ; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n " , i , tvArr[i].channel);
		}
		
		//  결과 값 보고 코드 치면서 틀렸던 점
		// 배열[ㅑ].channel 에 값을 저장하는것
		// 값을 출력할때도 마찬가지로 배열.채널 을 출력해야한다
		
		
	}

}
