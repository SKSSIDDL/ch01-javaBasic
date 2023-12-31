package kr.s06.array;

public class ArrayMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		//과목명
		String[] course = {"국어", "영어", "수학"};
		//성적 저장
		int[] score = new int[course.length];
		//총점
		int sum = 0;
		//평균
		float avg = 0.0f;
		
		//반복문을 이용해서 입력처리
		for(int i=0; i<score.length; i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] =input.nextInt(); //성적 입력
			}while(score[i]<0 || score[i]>100);
			//총점 구하기
			sum += score[i];
		}
		//평균 구하기
		avg = sum / (float)course.length;//=score.length;
		
		System.out.println();//단순 줄바꿈
		
		//과목 점수 출력
		for(int i=0; i<score.length; i++) {
			System.out.printf("%s = %d%n", course[i], score[i]);
		}
		
		//총점과 평균 출력
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n", avg);
		
		input.close();
	}

}
