package kr.s09.object.instance;

public class InstanceMain {
	
	//클래스의 기본 구조
	//멤버변수
	int var1; 
	String var2;
	
	//생성자(생략가능)
	public InstanceMain() {}
	
	//멤버 메서드
	public int sum(int a, int b) {
		return a+b; //return => 함수밖으로 빠져나감
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		InstanceMain me = new InstanceMain();
		//  자료형   참조자료형     생성자(객체포함X)
		System.out.println("me : " +me);
		
		int result = me.sum(5, 6); //함수 내부적으로 11을 계산해 result에 담김
		System.out.println("result = " + result);
	}
	
}
//가공된 주소(참조값)을 사용 = @371f7a8d
//자바는 class 파일을 만들어야지 main 생성 가능
//함수대신 메서드를 사용, return -> 반환하다