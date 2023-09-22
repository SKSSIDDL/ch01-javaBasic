package kr.s14.object.capsule;

class Capsule{
	//private은 같은 클래스내에서만 접근 가능
	//은닉화
	private int a; //=금고 => 금고에 돈 맡기기, 중요하니까 가린다(직접 access 못함)
	
	//캡슐화(은행원 역할)
	public void setA(int n) { //입금
		if(n>=0) {
			a = n;
		}else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	public int getA() { //잔고확인(데이터 반환)
		return a;
	}
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//cap.a = -10;
		//System.out.println(cap.a);
		
		//변수 a의 접근 지정자(제한자)가 private이기 때문에 같은 class내에서는 호출이 가능하지만
		//다른 class에서 호출이 불가능
		
		cap.setA(100); //데이터 저장
		System.out.println(cap.getA()); //데이터 호출
		
		cap.setA(-20);
		System.out.println(cap.getA());
	
	}
}

//setA, getA =>은행원 역할
//private int a = 금고 역할
