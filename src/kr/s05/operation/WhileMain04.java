package kr.s05.operation;

public class WhileMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [실습]
		 * 입력받은 정수값부터 0까지 출력하는 프로그램을 작성하시오.
		 * (0보다 큰 수를 입력하는데 만약 0을 입력하면 조건체크, "0보다 큰 수를 입력하세요" 출력)
		 * 
		 * (입력 예시)
		 * 정수 입력 3 
		 *
		 * [출력 예시]
		 * 3
		 * 2
		 * 1
		 * 0
		 */
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = input.nextInt();
		
		if(num>0) {
			while(num >= 0) {
				System.out.println(num--); //증감식 => 출력
			}
		}else {
			System.out.println("0보다 큰 수를 입력하세요");
		}
		
		input.close();
	}
}
		
		
		
		
//		
//		
//		
//		System.out.println("정수값 : ");
//		int a = input.nextInt();
//		
//		if(a==0) {
//			System.out.println("0보다 큰 수를 입력하세요");
//			for(int )
//		}
//		}
//		
//		
//		for(int i=3; i >=1; i--) {
//			if(i == 0) {
//				System.out.println("0보다 큰 수를 입력하세요");
//			}
//			System.out.println(i);
//	
