package kr.s05.operation;

public class IfMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===단일 if문===");
		
		int n = 10;
		
		//단일 if문 : 조건이 true이면 if블럭안의 수행문을 실행
		if(n>5) {
			System.out.println("n은 5보다 크다");
		}
		System.out.println("==============");
		
		//if문 블럭내의 수행문이 한 줄이면 {} 생략가능
		if(n<5)
			System.out.println("~~~~~~"); //false라 실행 x
			
		System.out.println("프로그램 종료!");	
	 }
}