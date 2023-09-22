package kr.s24.object2.poly;

//부모 클래스
class Parent2{
	public void make() {
		System.out.println("부모클래스의 make");
	}
}

//자식 클래스
class Child2 extends Parent2{
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
	}
}

public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make(); //재정의된 매서드 호출
		
		System.out.println("========================");
		
		//자식 클래스 타입 -> 부모 클래스 ㅌ입으로 형변환(업캐스팅, 자동적으로 형변환)
		Parent2 p= ch; //재정의가 제일 먼저->타입이 바뀌더라도 재정의가 먼저
		p.make(); //재정의된 매서드 호출
	}
}
