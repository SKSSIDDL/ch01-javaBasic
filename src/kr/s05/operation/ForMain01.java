package kr.s05.operation;

public class ForMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====for문====");
		
		        //초기식;조건식;증감식
		for(int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		System.out.println("=============");
		
		//수행문이 한 줄일 경우 {} 생략 가능
		for(int i =1; i <=5; i++)  //조건이 true 일 때만 반복
			System.out.println(i);
		
		System.out.println("프로그램 끝");
	}

}

//너무 많이 반복하면 프로그램이 느려짐





