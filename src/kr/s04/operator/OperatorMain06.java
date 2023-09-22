package kr.s04.operator;

public class OperatorMain06 {
	public static void main(String[] args) {
		
		System.out.println("===비교(관계)연산자==="); // 하나의 기호라 공백금지 ( ==,!=, >=)
		boolean result;
		int a = 10;
		double b = 10.5; //자료형이 같지 않아도 자동으로 형변환
		
		result = a < b;
		System.out.println("a < b : " + result);
		
		result = a> b;
		System.out.println("a > b : " +result);
		
		result = a >= b;
		System.out.println("a >= b :" +result);
		
		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b;
		System.out.println("a == b : " + result);
		
		result = a != b;
		System.out.println("a != b : " + result);
		
	}
}
