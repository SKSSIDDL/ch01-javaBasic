package kr.s19.object.array;

import java.util.Scanner;

public class ScoreMain {
	/*
	 * [실습]
	 * 1. scanner 객체 생성
	 * 2. 배열의 길이가 4인 scoreArray 배열 생성
	 * 3. 변수 전체 과목 총점(total), 전체 과목 평균(avg)
	 * 4. Score 객체를 4개 생성해서 배열에 저장
	 *    이름, 국어, 영어, 수학 점수를 입력받아서 객체에 저장하시오.-스캐너 통해서
	 * 5. 반복문을 이용한 객체의 멤버 변수 값 출력
	 *    이름, 국어, 영어, 수학, 총점, 평균, 등급
	 * 6. 전체 과목 총점, 전체 과목 평균 출력
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Score[] scoreArray = new Score[4];
		int total =0;
		int avg = 0;
		
		for(int i=0; i<scoreArray.length; i++) {
			System.out.print("이름: ");
			String name = input.nextLine(); 
			System.out.print("국어 :");
			int korean = input.nextInt();
			System.out.print("영어 : ");
			int english = input.nextInt();
			System.out.print("수학: ");
			int math = input.nextInt();
			input.nextLine(); //enter 흡수-> ******없으면 이름 다시 입력
			
			scoreArray[i] = new Score(name, korean, english, math);
			System.out.println("======================================================");
			
		}
		//4명의 국어, 영어, 수학, 총점, 평균, 등급
		for(Score s : scoreArray) {
			System.out.printf("이름 : %s\t", s.getName());
			System.out.printf("국어 : %d\t", s.getKorean());
			System.out.printf("영어 : %d\t", s.getEnglish());
			System.out.printf("수학 : %d\t", s.getMath());
			System.out.printf("총점 : %d\t", s.makeSum());
			System.out.printf("평균 : %d\t", s.makeAverage());
			System.out.printf("등급 : %s\n", s.makeGrade());
			
			//전체 과목 총점
			total += s.makeSum();
		}
	//전체 과목 평균
		avg = total / (scoreArray.length *3);
		
		System.out.println("========================================================");
		System.out.printf("전체 과목 총점 : %d, 전체 과목 평균 : %d", total ,avg);
		
		input.close();
	}
}
