package kr.s24.object4.finaltest;

class A{
	final int NUM = 10; //상수-지정한 값은 변경 불가능 
	public static final int NUMBER = 20;
	
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//ap.NUM = 20;
		//상수는 변경 불가능
		System.out.println(ap.NUM); //호출은 가능
		
		//static 상수 호출
		System.out.println(A.NUMBER);
		
		//상수
		final int NO = 30;
		System.out.println(NO);
		
	}
}
