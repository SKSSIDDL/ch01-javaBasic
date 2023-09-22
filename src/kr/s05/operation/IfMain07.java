package kr.s05.operation;

public class IfMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [실습]
		 * 정수 하나를 입력하여 작수면 10을 더하고 홀수면 20을 더하여 결과를 출력하시오.
		 * 
		 * [입력예시[
		 * 정수 하나 입력 : 5
		 * 
		 * [출력 예시]
		 * 결과 : 25
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int a = input.nextInt();
		
		if(a%2 == 1) {
			System.out.println("결과 : " + (a+20));
		}else {
			System.out.println("결과 : " + (a+10));  // else if로 끝나고 되는건가?
		}
		
//		int b, result;
//		
//		if(b%2==0) {
//			result = b +10;
//		}else {
//			result = b +20;
//		}
//		System.out.println("결과 : %d", result);
//		
		
		input.close();
	}

}
