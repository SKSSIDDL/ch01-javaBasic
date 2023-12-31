package kr.s16.object.thistest;

class ThisTest {
	//은닉화
	        //멤버 변수
	private int a;
	
	//캡슐화
	               //지역 변수
	public void setA(int a) {
		//매서드 내에서 지역 변수명을 멤버 변수명과 동일하게 사용하면 지역 변수명이 우선하기 때문에 멤버 변수를 인식하지 못함
		//이런 경우 this를 이용해서 멤버 변수명을 지칭함
		
		//a = a; //명칭이 충돌 - 우선순위(지역변수 = 지역변수;)
		this.a = a;
	 //멤버 변수  지역 변수
	}
	
	public int getA() {
		return a;
	}
}

public class ThisMain02 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}
}
