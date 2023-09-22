package kr.s04.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in); //입력작업 시작
		
		System.out.print("국어:"); //입력된 정수를 변수에 대입
		int korean = input.nextInt();
		
		System.out.print("영어 :");
		int english = input.nextInt();
		
		System.out.print("수학 :");
		int math = input.nextInt();
		
		//총점 구하기
		int sum = korean + english + math;
		//평균 구하기
		double avg = sum / 3.0; //**연산 하는 값 중 하나를 double 형태로 바꾼다.(3을 int에서 double로 3.0)
		
		System.out.printf("국어 = %d점%n", korean);
		System.out.printf("영어 = %d점%n", english);
		System.out.printf("수학 = %d점%n", math);
		System.out.printf("총점 = %d점%n", sum);
		System.out.printf("평균 = %.2f점%n", avg);
		
		input.close(); //입력작업 끝
	}
}

//int int => int
//int double or double double => double