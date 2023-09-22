package kr.s23.object.bank;

public class MinusAccount extends BankAccount{
	//한도
	private long minusLimit;
	
	public MinusAccount(String number, String password, String name, long balance, long minusLimit) {
		
		//BankAccount 부모클래스의 인자가 잇는 생성자를 호출
		super(number, password, name, balance);
		this.minusLimit = minusLimit;
	}
	
	//입금은 BankAccount와 동일
	//출금 매서드 overriding
	@Override
	public void withdraw(long amount) {
		if(amount <= 0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance + minusLimit < amount) {
			System.out.println("한도 초과로 출금되지 않습니다.");
			return;
		}
		balance -= amount;
		System.out.printf("%,d원이 출금되었습니다.%n", amount);
	}
	
	//printAccount 매서드 오버라이딩(재정의)
	@Override
	public void printAccount() {
		System.out.println("-----------------------------");
		System.out.println("(마이너스)계좌번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : "+ name);
		System.out.printf("계좌잔액 : %,d원%n" , balance);
		System.out.printf("마이너스 한도 : %,d원%n", minusLimit);
		System.out.println("-----------------------------");
	}
}
