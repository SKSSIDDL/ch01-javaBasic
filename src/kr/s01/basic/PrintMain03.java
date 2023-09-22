package kr.s01.basic;
 public class PrintMain03 {
	public static void main(String[] args) {
		//문자 : 한 문자
		System.out.println('A'); //''->특수문자->출력X
		System.out.println('가');
		
		//문자열 : 한 문자 이상의 문자들
		System.out.println("Z"); //""->특수문자->출력X
		System.out.println("Bus");
		System.out.println("한강");
		
		//숫자(정수)
		System.out.println(23); //"23"은 문자열(연산 할거면 사용x), 23은 숫자
		
		//숫자(실수)
		System.out.println(25.67);
		
		//논리값(boolean)
		System.out.println(true); //참값
		System.out.println(false); //거짓값
		
		
		
		
	}
}
