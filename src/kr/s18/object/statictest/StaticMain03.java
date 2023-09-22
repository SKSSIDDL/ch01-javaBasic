package kr.s18.object.statictest;

public class StaticMain03 {
	//인스턴스 변수-객체 생성 후 호출, return XXX
	String s1 = "여름";
	//static(클래스) 변수
	static String s2 = "겨울";
	
	//static 메서드
	public static String getString() {
		return s2; //getString 호출하면 class명 필요 X
	}
	
	public static void main(String[] args) {
		System.out.println(getString()); //static 사용하면 객체 생성안해도 단독으로 호출 가능
	}
}
