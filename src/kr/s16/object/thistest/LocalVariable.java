package kr.s16.object.thistest;

public class LocalVariable {
	//멤버 변수: 클래스 블럭 내에서 정의된 변수
	int b = 200;
	
	//생성자
	public LocalVariable() {
		int a = 300; //지역 변수 =>해당 블럭에서 사용되고 소멸
		int c = 500;
		System.out.println("a : "+a);
		System.out.println("c : "+c);
	}
	//메서드
	public void make() {
		//지역 변수 : 매서드, 생성자, 제어문 블럭 내에서 생성된 변수, 해당 블럭이 종료되면 변수는 소멸
		int a = 100;
		System.out.println("a : "+ a); //지역 변수
		System.out.println("b : "+ b); //멤버 변수
		//생성자에서 생성된 지역 변수로 생성자가 종료되면 소멸
		//System.out.println("c : "+ c);
	}
	
	public static void main(String[] args) {
		for(int i =1; i<= 5; i++) { //제어문 블럭안의 지역변수
			System.out.println(i);
		}
		System.out.println("----------------");
		//제어문 블럭밖에서 호춣면지역 변수가 소멸해서 호출 불가
		//System.out.println(i);
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
