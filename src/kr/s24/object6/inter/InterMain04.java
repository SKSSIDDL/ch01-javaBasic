package kr.s24.object6.inter;

interface I{
	public abstract void play();
}

class Pianist implements I {
	@Override
	public void play() {
		System.out.println("피아노를 연주하다.");
	}
}

class Cellist implements I{
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
}

class Stage{
	public void autoPlay(I i) { //인터페이스가 공통의 자료형(공통의 부모 역할)
		i.play(); 
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		Stage a = new Stage();
//		Pianist p = new Pianist();
//				a.autoPlay(p); 와 같다
		a.autoPlay(new Pianist()); //피아니스트 -> I (클래스타입 -> 인터페이스타입 형변환)
		a.autoPlay(new Cellist()); //첼리스트 -> I (클래스타입 -> 인터페이스타입 형변환)
	}
}
