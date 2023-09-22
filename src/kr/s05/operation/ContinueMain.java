package kr.s05.operation;

public class ContinueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <=10; i++) {
			//특정 조건일 때 수행문의 실행을 멈추고 다음 반복 회차로 건너뒴
			if(i%3==0) {//3의 배수
				continue; //0 3 6 9 출력하지 말고 다음회차로 넘어가세요
			}
			System.out.println(i);
		}
	}

}
