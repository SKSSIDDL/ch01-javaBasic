package kr.s16.object.thistest;

public class ThisMain03 {
	/*
	 * 생성자 내부에서 또 다른 생성자를 호출할 때 this()를 표시함
	 * this()를 이용해서 도 다른 생성자를 호풀하는 경우는 생성자 내부에 반복적인 코드가 잇어서
	 * 반복적인 코드를 제거하고 코드를 재사용하고자 할 때 사용.
	 */
	public ThisMain03() {
		//System.out.println("~~~~~~~~~~~~~");
		this("바람"); //this()전에 별도의 수행문이 없어야함
		System.out.println("=============");
	}
	public ThisMain03(int a) {
		this(String.valueOf(a)); //int->string
	}
	public ThisMain03(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ThisMain03 tm= new ThisMain03();
		ThisMain03 tm2 = new ThisMain03(3000);
		ThisMain03 tm3 = new ThisMain03("Korea");
		
		//재활용성 증가하기
		//증복되는 syso를 this로 대체
	}
}
