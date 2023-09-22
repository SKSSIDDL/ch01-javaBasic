package kr.s02.variable;

public class VariableTypeMain01 {
	public static void main(String[] args) {
		System.out.println("===논리형===");
		//논리형 (true, false)
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");
		//문자형, 크기 :  2 byte, 표현범위 : 0 ~ 65,535
		//다국어 처리를 위한 유니코드(unicode) 방식
		char c1 = 'A'; // 내부적으로 아스키 코드값 65로 인식
		System.out.println("c1 = " + c1);
		
		char c2 = 65; //A에 해당하는 아스키 코드값 65를 직접 대입
		System.out.println("c2 = " + c2);
		
		char c3 = '\u0041'; //A를 유니코드로 표현
		System.out.println("c3 = " + c3);
		
		char c4 = '자';
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790'; //자를 유니코드로 표현
		System.out.println("c5 = " + c5);
		
		System.out.println("===정수형===");
		//byte, 크기 : 1 byte, 표현범위: -128 ~ 127 (연산에선 사용 x, 입/출력 할 때)
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		//short, 크기 : 2 byte, 표현범위 : -32,768 ~ 32,767 (연산에서 사용 x)
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4 byte, 표현범위 : -2,147,483,648 ~ 2,147,483,647
		int in1 = 1234567;
		System.out.println("in1 = " + in1);
		
		//지정을 안했을 경우 int로 인식(기본)
		
		//long, 크기 : 8 byte
		long lo1 = 1234567L; //처음부터 long형 데이터로 인식(원래는 int에서 long으로 변환)
		//L자는 자료형을 의미 => 출력시 사라짐
		System.out.println("lo1 = " + lo1);
		
		System.out.println("===실수형===");
		//float, 크기 : 4 byte
		float f1 = 9.2f; //기본이 double이라 float으로 출력하고 싶으면 끝에 f 작성
		System.out.println("f1 = "+ f1);
		//f는 자료형을 의미
		
		//double, 크기 : 8 byte -> 정밀도가 더 높음(기본)
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
		
		System.out.println("===문자열===");
		//문자열 표시(기본 자료형 아님, 참조 자료형)
		String str  = "Hello World!";
		System.out.println("str = " + str);
		
		
		
		
	}
}
