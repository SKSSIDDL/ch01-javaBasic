package kr.s20.object.extention;

//부모 클래스
class A{
	int x = 100;
	private int y = 200; //메모리 안에 들어있긴 하나 금고에 있음, 금고 열쇠필요!
	
	public int getY() { //열쇠 역할
		return y;
	}
}

//자식 클래스
class B extends A{
	int z = 300;
}
public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private 멤버변수는 상속 관계라도 다른 클래스에서 호출은 불가
		//System.out.println(bp.y);
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}
