package kr.s04.operator;

public class OperatorMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눠줄 때, 학생당 몇개를 가질 수 있고
		 * 최종적으로 몇개가 남는지 출력
		 * 
		 * (출력 예시)
		 * 학생 한 명이 가지는 연필 수 : **
		 * 남은 연필 수 : **
		 */
		
		int pencil = 534, student = 30;
//		System.out.println(pencil/student);
//		System.out.println(pencil%student);
		
		System.out.printf("학생 한 명이 가지는 연필 수 : %d자루%n", pencil/student);
		System.out.printf("남은 연필 수 : %d자루%n", pencil%student);
		
		System.out.println("=============================");
		
		System.out.println("학생 한 명이 가지는 연필 수 : " + pencil/student);
		System.out.println("남은 연필 수 : " + pencil%student);
		
	}
}
