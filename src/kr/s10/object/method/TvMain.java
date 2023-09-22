package kr.s10.object.method;
//void형 메서드

class Tv{
	//Tv의 속성(멤버 변수)
	boolean power;//전원상태(on/off)
	int channel; //채널
	
	//Tv의 동작(멤버 메서드), 반환하는 데이터가 없기에 void 사용
	public void isPower() {
		power = !power; //리모콘의 전원버튼
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}

public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.isPower(); //토글형태
		System.out.println("Tv 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		System.out.println("===================");
		
		t.channel = 7;
		System.out.println("첫번째 변경된 채널 : "+ t.channel);
		System.out.println("===================");
		
		t.channelDown();
		System.out.println("두번째 변경된 채널 : " + t.channel);
		System.out.println("===================");
		
		t.isPower();
		System.out.println("Tv 실행 여부 : " + t.power);
	}
}













