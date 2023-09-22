package kr.s05.operation;

public class WhileMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whilemain05 반복문구 없게 작성
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total = 0;
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true) { //무한루프
			System.out.print("누적할 정수 입력> ");
			a = input.nextInt();
			if(a==0) {
				break;//반복문을 빠져나옴
			}
			//누적
			total += a;
		}
		
		System.out.println("total : " + total);
		
		input.close();
	}

}

//가이드 문자열 한번만 명시하면 ok
//무한루프 중 0을 만나면 break로 빠져나감 -> total 연산