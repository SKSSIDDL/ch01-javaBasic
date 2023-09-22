package kr.s06.array;

public class ArrayMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 및 생성
		//배열을 생성하면 배열의 요소로 기본값이 저장됨. (정수형은 0을 기본값으로 함)
		int[] array = new int[5]; //length(배열의 길이=방의 개수) = 5
		//자동으로 초기화되어 초기화 전 데이터가 없는 변수와는 달리 배열은 정수일 경우, 0으로 기본 데이터가 들어감
		//반복문을 이용한 요소의 출력
		                //배열의 길이
		for(int i= 0; i<array.length; i++) {
			System.out.println("array [" +i+ "] :" + array[i]); //0으로 데이터가 있음
		}
		
		System.out.println("=======================");
		
		//배열의 요소 변경
		array[0] =10;
		array[1] =20;
		array[2] =30;
		array[3] =40;
		array[4] =50;
		//array[5] =60; //없는 방번호 호출 => error
		
		//반복문을 이용한 배열의요소 출력
		for(int i=0; i<array.length; i++) {
			System.out.println("array [" +i+ "] :" + array[i]);
		}
	}

}
