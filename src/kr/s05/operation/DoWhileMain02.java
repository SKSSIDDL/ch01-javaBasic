package kr.s05.operation;

public class DoWhileMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
				
		int korean, english, math, sum;
		char grade;
		float avg;
		
		//do블럭에서 입력한 값을 조건 체크해서 0부터 100사이면 조건이 false가 되어
		//do while 블럭을 빠져나감
		do {
			System.out.print("국어 = ");
			korean = input.nextInt();
		}while(korean <0 || korean >100); //문구처리 못함 (ex)0~100사이 수를 입력하세요
				
		do {
			System.out.print("영어 = ");
			english = input.nextInt();
		}while(english <0 || english >100);
				
		do {
			System.out.print("수학 = ");
			math = input.nextInt();
		}while(math <0 || math >100);
		
		//총점 구하기
		sum = korean + english + math;
		//평균 구하기
		avg = sum / 3.0f; //f!!!!!(3.0은 double 데이터)
		
		//등급 구하기
		switch((int)avg/10) {//인자값이 int거나 문자열, avg/10 = float
		case 10 :
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade ='C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		
		System.out.println(); //단순 줄바꿈
//		=System.out.print("\n");
		
		System.out.printf("총점 : %d점%n", sum);
		System.out.printf("평균 : %.2f점%n", avg);
		System.out.printf("등급 : %c%n", grade);
		
		input.close();
	}

}
