package kr.s24.object6.inter;

//인터페이스(클래스를 돕기 위해 사용, 단독사용 불가, 형식만 있음)
interface A2{
	//추상메서드
	public abstract void make();
	void play(); //public abstract 생략 가능
}

class B2 implements A2 {
	//인터페이스의 추상메서드 구현
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
	@Override
	public void play() {
		System.out.println("play 메서드");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.play();
	}
}
