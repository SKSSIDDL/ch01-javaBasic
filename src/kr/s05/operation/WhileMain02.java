package kr.s05.operation;

public class WhileMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지의 합 구하기
		
		int sum = 0, su = 1; //초기값
		    //조건식
		while(su <=100) {
			//누적
			sum += su;
			su++; //증감식 -> 없으면 무한루프
		}
		System.out.println("1부터 100까지의 합 : " +sum);
	}

}
