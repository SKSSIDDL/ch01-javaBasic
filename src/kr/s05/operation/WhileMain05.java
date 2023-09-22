package kr.s05.operation;

public class WhileMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total = 0; //a 초기화 아직
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		System.out.print("누적할 정수 데이터 입력: ");
		     //입력값이 0이 아니면 true
		while((a = input.nextInt()) != 0) { //a 초기화 겸 값 넣기
			total+=a; //누적
			System.out.print("누적할 정수 데이터 입력 : ");
		}
		//total 누적데이터 출력
		System.out.println("total = " + total);
		
		input.close();
	}

}

//루프를 돌지말지 입력값에 따라 달라진다. but, 효율성이 떨어짐(동일문구 중복)