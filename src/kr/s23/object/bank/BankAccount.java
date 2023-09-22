package kr.s23.object.bank;

public class BankAccount {
	
	//멤버 변수(minus 클래스에서도 사용하기 위해 public 대신 protected 사용, private는 해당 클래스에서만 사용 가능)
	protected String number;
	protected String password;
	protected String name;
	protected long balance;
	
	//생성자
	public BankAccount(String number, String password, String name, long balance) {
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		
		System.out.println("계좌가 개설되었습니다.");
	}

	//입금하기
	public void deposit(long amount) {
		if(amount <=0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return; //생략 가능(switch에 default break 생략하는 것과 같은 원리)
			//특정 조건일 때 void형 매서드를 빠져나감.(else 생략함)
		}
		balance += amount;
		System.out.println(amount +"원이 입금 되었습니다.");
	}
	
	//출금하기
	public void withdraw(long amount) {
		if(amount <=0) {
			System.out.println("0이하의 금액을 출금할 수 없습니다.");
			return;
		}
		if(balance <amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
		System.out.printf("%,d원이 출금되었습니다.", amount);
	}
	
	//잔고 확인
	public void printAccount() { //출력해주기에 get 매소드 사용 X
		System.out.println("---------------------");
		System.out.println("(일반)계좌번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : "+ name);
		System.out.printf("계좌잔액 : %,d원%n" , balance);
		System.out.println("---------------------");
	}
	
}
