package kr.s05.operation;

public class WhileMain09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [실습]
		 * 동전을 넣고 커피를 주문하면 커피를 판매하는 자판기 프로그램
		 * 자판기는 자판기 보유 동전(1000), 커피(10), 프림(10), 설탕(10)을 보유하고 있고
		 * 커피를 주문할 대 마다 (자판기 보유 동전-거스름돈)
		 * 커피는 5차감, 프림은 3차람, 섦탕은 1 차감
		 * 0이되면 판매를 중단.
		 * 
		 * [입력 예시 및 출력]
		 * 동전을 넣으세요(커피값: 400) : 500
		 * 
		 * 거스름돈 :100원
		 * 맛 좋은 커피가 준비되었습니다.
		 * =======현재 자판기 정보=======
		 * 커피양 : 5
		 * 프림약 : 7
		 * 설탕양 : 1
		 * 자판기 보유 동전 금액 : 900원
		 * 투입한 동전 금액 : 500원
		 * ==========================
		 * 
		 * or
		 *  동전을 넣으세요(커피값 : 400) : 300
		 *  (고객기 투입한 동전이 커피값보다 작으면) 투입한 동전이 부족합니다.
		 *  
		 * or
		 * 동전을 넣으세요(커피값 : 400) : 1000
		 * (커피가 부족하면) 커피가 부족합니다.
		 * (프림이 부족하면) 프림이 부족합니다.
		 * (설탕이 부족하면) 설탕이 부족합니다.
		 * (자판기 보유 동전이 부족하면) 거스름돈이 부족합닏.
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//커피 정보
		int price = 400;
		//커피 한 잔의 들어갈 양
		int content_coffee =5;
		int content_cream = 3;
		int content_sugar = 1;
		//커피에 들어갈 재료의 현재 보유량
		int coffee= 10;
		int cream = 10;
		int sugar = 10;
		
		//투입한 금액 누적
		int amount = 0;
		//자판기 보유 동전
		int coin = 1000;
		
		while(true) {
			System.out.print("1:커피마시기 ||| 2:종료>");
			int num = input.nextInt();
			
			if (num ==1) {
				System.out.print("동전을 넣으세요(커피값 : 400) >");
				amount = input.nextInt();
				if(amount >= price) {
					System.out.println("거스름돈 : "+(amount - price));
					System.out.println("맛 좋은 커피가 준비되었습니다."); 
					System.out.println("=========현재 자판기 정보==========");
					System.out.println("커피양 : " +(coffee -= content_coffee));	
						if(coffee==0)
							System.out.println("커피양이 부족합니다.");
							
					System.out.println("프림양 : " +(cream -= content_cream)); 
						if(cream==0)
							System.out.println("프림양이 부족합니다.");
							
					System.out.println("설탕양 : "+(sugar -= content_sugar));
						if(sugar==0)
							System.out.println("설탕양이 부족합니다.");
							
					System.out.println("자판기 보유 동전 금액 : "+(coin -= (amount-price)));
						if(coin==0)
							System.out.println("거스름돈이 부족합니다."); 
							
					System.out.println("투입한 동전 금액 : " +amount);
					System.out.println("===============================");

				}else {
					System.out.println("투입한 동전이 부족합니다."); 
				}
			}else if(num ==2) {
				System.out.println("자판기 프로그램 종료"); 
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			

		
		}
		
		input.close();
	}

}
