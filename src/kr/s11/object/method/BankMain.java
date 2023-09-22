package kr.s11.object.method;

import java.util.Scanner;

class Account {
/*
 * [실습]
 * Account
 * 1) 멤버 변수 : 계좌번호(account_num), 예금주(name), 잔고(balance)
 * 2) 멤버 메서드 : 1. 예금하기(deposit) : balance에 누적
 *                  예금 처리 후 "입금이 완료되엇습니다."
 *               2. 출금ㅎ기(withdraw) : balance 차감
 *                  출금 처리 후 "출금이 완료되엇습니다."
 *        		 3. 계좌정보(printAccount) : 계좌ㅓㄴ호, 예금주, 잔고 출력
 *        
 * BankMain
 * 1) account 생성
 *   "계좌 기본 정보를 입력해서 계좌를 생성합니다" 문구 출력 후
 *   계좌번호, 예금주, 잔고를 입력받기
 *   "홍길동님 계좌가 개설되엇습니다." 문구 출력
 * 2) while문을 만들고 메뉴 지정
 * 1. 예금, 2. 출금, 3. 잔고 확인, 4. 종료
 * 
 *                  
 */
	//멤버변수
	String account_num; //계조번호
	String name; //예금주
	int balance; //잔고
	
	//멤버 매서드
	//예금하기
	public void deposit(int money) {
		if(money <= 0) {
			System.out.println("입금액을 0보다 크게 입력하세요.");
		}else {
			balance += money;
			System.out.println("입금이 완료되었습니다.");
		}
	} 

	//출금하기
	public void withdraw(int money) {
		if(money <= 0) {
			System.out.println("출금액을 0보다 크게 입력하세요.");
		}else if(balance<money) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -=money;
			System.out.println("출금이 완료되었습니다.");
		}
	}
	
	//계좌정보 출력
	public void printAccount() {
		System.out.println("계좌번호 : "+ account_num);
		System.out.println("예금주 : "+ name);
		System.out.printf("잔고출력 : %,d%n", balance);
	}
}

public class BankMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account me = new Account();
	
		System.out.println("계좌 기본 정보를 입력해서 계좌를 생성합니다.");

		System.out.print("계좌번호 : ");
		me.account_num = input.nextLine();
		System.out.print("이름 : ");
		me.name = input.nextLine();
		System.out.print("잔고 : ");
		me.balance =input.nextInt();
		
		System.out.println(me.name +"님 계좌가 개설되었습니다.");
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 확인 | 4. 종료");
			System.out.println("--------------------------------------");
			
			System.out.print("메뉴 선택> ");
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("예금액> ");
				me.deposit(input.nextInt());  //int money = input.nextInt();
				                              //me.deposit(money);
			}else if (num == 2) {
				System.out.print("출금액> ");
				me.withdraw(input.nextInt());
			}else if (num == 3) {
				me.printAccount();
			}else if (num == 4) {
				System.out.println("프로그램 종료"); break; //break 꼭하기!!!!!!!!!!!!!!!!!!!
			}else {
				System.out.println("잘못 입력했습니다");
			}
			
		}
		
		input.close();
	}

}