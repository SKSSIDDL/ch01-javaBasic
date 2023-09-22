package kr.s24.object2.poly;

//부모 클래스
class Parent{
	int a = 100;
}

//자식 클래스
class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
	 //참조자료형 = 호출범위를 뜻함
		
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		//자식 클래스 타입 -> 부모 클래스 타입으로 형변환(업캐스팅, 자동적으로 형변환)
		Parent p = ch; //주소 복사, Parent 영역에 있는 것만 호출 가능
		System.out.println(p.a);
		//System.out.println(p.b); 
		//메모리에 있지만 호출은 불가능
		
		//부모 클래스 타입 -> 자식 클래스 타입으로 형변환(다운캐스팅, 명시적으로 형변환)
		Child ch2 = (Child)p; //주소 복사-> 영역 확장
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}
}
