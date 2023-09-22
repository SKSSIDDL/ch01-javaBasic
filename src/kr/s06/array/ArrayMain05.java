package kr.s06.array;

public class ArrayMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 및 생성, 초기화
		int[] array = {10, 20, 30, 40, 50};
		              //1   2   3   4   5, length= 5, index= 0~4
		//반복문을 이용한 배열의 요소 출력
				    	//배열의 길이 
		for(int i=0; i < array.length; i++) {
			System.out.println("array [" +i+ "] :" + array[i]);
		}
		System.out.println("========================");
		
		//확장 for문 = 개선된 루프
		    //변수명 : 배열명
		for(int num : array) {
			System.out.println(num); //index 없이 값만 출력
		}
	}

}
