package kr.s24.object2.poly;

//부모 클래스
class A{
	public void make() {
		System.out.println("make 매서드");
	}
}

//자식 클래스
class B extends A{
	public void play() {
		System.out.println("play 매서드");
	}
}

public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B();
		bp.make();
		bp.play();
	
		A ap = bp; //자식 클래스 타입 -> 부모 클래스 타입으로 형변환(업캐스팅)
		ap.make();
		//ap.play(); ->호출 범위를 벗어나 호출 불가능
		
		B bp2 = (B)ap; //부모 클래스 타입 -> 자식 클래스 타입으로 형변환(다운캐스팅),명시적으로 형변환
		bp2.make();
		bp2.play();
	}
}
