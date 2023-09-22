package kr.s06.array;

public class ArrayMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //총점을 저장할 변수
		float average = 0.0f; //평균을 저장할 변수
		
		//배열을 선언, 생성(암시적으로 배열 생성), 초기화
		int[] score = {100, 88, 88, 100, 90}; // -> 방 개수 5개로 설정, length = 5, index = 0~4
		              //0   1    2   3   4
		//총점 구하기
		for(int i = 0; i <score.length; i++) {
			//누적
			sum += score[i];//i: 0~4
		}
		
		//평균 구하기
		average = sum / (float)score.length;
		System.out.printf("총점 : %d%n", sum);
		System.out.printf("평균 : %.2f%n", average);
	}

}

//배열은 생성한 이후에 배열의 길이를 늘리거나 줄일 수 없음. ->고정되어있다.
//배열은 고정 길이다.