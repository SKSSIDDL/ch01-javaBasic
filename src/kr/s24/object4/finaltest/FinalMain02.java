package kr.s24.object4.finaltest;

//부모 클래스
class Me{
	int a = 100;
	
	//매서드에 final을 지정하면 자식클래스에 메서드 오버라이딩(재정의)를 할 수 없음
	public final void setA(int a) {
		this.a = a;
	}
}

//자식 클래스
public class FinalMain02 extends Me{
	/*
	@Override
	public void setA(int a) {
		System.out.println(a);
	*/
	//부모 클래스의 final 매서드는 재정의 할 수 없음
	
	public static void main(String[] args) {
		FinalMain02 me = new FinalMain02();
		me.setA(200);
	}
}
