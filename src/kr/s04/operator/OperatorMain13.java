package kr.s04.operator;

public class OperatorMain13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [숙제]
		 * A전자 대리점에서는 그 날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 입력해서 지불 금액을 줄력하는 프로그램을 작성.
		 * (단, 출력 시에는 소수점 이하 절삭)
		 * 
		 * [입력 예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 
		 * [출력 예시]
		 * 냉장고 3대의 가격은 1,275,000원 
		 * 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("상품명 입력 : ");
		String str = input.nextLine(); //next();도 가능
		
		System.out.print("단가 입력 : ");
		int a= input.nextInt();
		
		System.out.print("판매 수량 입력 : ");
		int b = input. nextInt();
		
		System.out.printf("%s %d대 가격은 %,d원 입니다.", str,b, (int)(a*b*0.85));
		
		
//		//구매한 상품의 지불 금액 연산
//		int total = (int)(a*b*0.85); //double값이라 int로 강제 형변환
//		int total = a*b*85/100; //int값, double x
//		
		
		input.close();
	}

}
