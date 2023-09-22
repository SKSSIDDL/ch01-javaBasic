package kr.s04.operator;

public class OperatorMain14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [실습]
		 * 은행 프로그램
		 * 잔고(balance)는 0이고 원하는 금액을 입금해서 잔고를 증가시키고 출금을 해서 잔고를 감소하게 하는 프로그램을 작성
		 * 
		 * [입력 예시]
		 * 예금액 : 5000
		 * 
		 * [출력 예시]
		 * 잔고 : 5,000원
		 * 
		 * [입력 예시]
		 * 출금액 : 2500
		 * 
		 * [출력 예시]
		 * 잔고 : 2,500원
		 * 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
//		int balance = 0;
//		int a = 0;
//		int b =0;
//		
//		System.out.print("예금액 : ");
//		balance = input.nextInt();
//		
//		System.out.printf("잔고 : %,d원%n", (balance+a));
//		
//		System.out.print("출금액 : ");
//		b = input.nextInt();
//		
//		System.out.printf("잔고 : %,d원%n", (balance+a-b)); //a를 초기화 안한다면?
//		
		
		int balance = 0; //잔고
		
		System.out.print("예금액 : ");
		balance += input.nextInt(); //대입연산자 이용해서 누적시키기
		
		System.out.printf("잔고 : %,d원%n", balance);
		
		System.out.print("출금액 : ");
		balance -= input.nextInt(); //대입연산자 이용해서 차감시키기
		
		System.out.printf("잔고 : %,d원%n", balance);
		
		//변수 만들지 않고 대입연산자 하나로 깔끔해질 수 있음

		
		input.close();
	}

}
