package kr.s05.operation;

public class WhileMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While문은 조건 비교에 만족할 때만 수행문을 수행하는 반복문
		
		int i=1; //초기값
		
		      //조건식
		while(i <= 10) {
			System.out.println(i++); //증감식
		} //조건식이 만족하지 않으면(false) {} 실행 안함 
		
		System.out.println("===================");
		
		
		int j = 10;//초기값
		while(j >= 0) { //조건식
			System.out.println(j--); //증감식
		}
		
	}

}
