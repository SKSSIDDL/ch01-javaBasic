package kr.s10.object.method;

class Worker{
	/*
	 * [실습]
	 * Worker
	 * 1)멤버 변수 : 직원 이름(name), 급여(money), 계좌잔고(balance)
	 * 2) 멤버 메서드 : work(실행하면 money에 1000원 누적) -void형 
	 *              deposit(실행하면 money의 돈을 balance에 누적시키고 money는 0으로 처리)
	 * WorkerMain의 main
	 * 1) Worker 객체 생성
	 * 2) 직원의 이름 지정
	 * 3) 10번 일하는데 번 돈이 3000원일 때마다 계좌에 저축(반복문)
	 * 4) 직원이름, 현재 계좌에 입금되지 않고 남아잇는 급여(money), 계좌잔고(balance)를 출력
	 */
	//멤버 변수
	String name;
	int money;
	int balance;
	
	//멤버 메서드
	public void work() { //데이터를 반환할 필요가 없어 void형태로
		money += 1000;
	}
	public void deposit() {
		balance += money;
		money =0;
	}
}

public class WorkerMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Worker worker = new Worker();
		worker.name ="홍길동";
		
		//10번 잃는데 번 돈이 3000원일 때마다 저축
		for(int work=1;work<=10; work++) {
			worker.work();
			if(worker.money%3000 == 0) { //=worker.money>=3000(3000원 일때마다 저축)
				worker.deposit();
			}
		}
		System.out.println("직원 이름 : "+ worker.name);
		System.out.printf("현재 계좌에 입금되지 않고 남아있는 급여 :%,d원%n", worker.money);
		System.out.printf("계좌 잔고 : %,d원%n", worker.balance);
	}
}
