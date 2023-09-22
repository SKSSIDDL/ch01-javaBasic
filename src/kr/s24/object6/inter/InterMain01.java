package kr.s24.object6.inter;

interface A1{
	//상수          //자료형 변경가능
	public static final int W = 10;
	int X =20;
	static int Y = 30;
	final int Z = 40;
}

public class InterMain01 {
	public static void main(String[] args) {
		//A1 ap = new A1();
		//인터페이스는 객체생성 불가
		
		System.out.println("W = "+A1.W);
		System.out.println("X = "+A1.X);
		System.out.println("Y = "+A1.Y);
		System.out.println("Z = "+A1.Z);
		
		//A1.X = 100; 
		//상수이기 때문에 변경 불가능
		
	}
}
