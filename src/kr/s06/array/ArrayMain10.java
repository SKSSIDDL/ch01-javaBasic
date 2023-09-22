package kr.s06.array;

public class ArrayMain10 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1) 10, 20, 30, 40, 50을 초기값으로 갖는 1차원 배열을 test 이름으로 선언, 생성, 초기화 하시오.
		 * 2)반복문을 이용해서 출력하시오
		 * 3)확장문 for문을 이용해서 출력하시오.
		 * 4)인덱스3의 데이터를 100으로 변경하시오.
		 * 5)마지막 요소의 값을 200으로 변경하시오.
		 * 6)반복문을 사용하여 모든 요소의 값을 0으로 초기화 하시오.
		 * 7)홀수 인덱스에 10, 짝수 인덱스에 20 저장
		 * 8)모든 요소의 총합과 평균(총합을 요소의 수로 나눔) 구하고 출력하시오. (sum, avg)
		 */
		
		//1)
		//int[] test = new int[] {10, 20, 30, 40, 50};		
		int[] test = {10, 20, 30, 40, 50};
		
		//2)
		for(int i=0; i<test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("=====================");
		
		//3)
		for(int num : test) {
			System.out.println(num);
		}
		System.out.println("=====================");
		
		//4)
		test[3]= 100;
		//5)
		test[test.length-1] =200; //마지막 인덱스 = test.length -1
		
		//6)
		for(int i=0; i<test.length; i++) {
			test[i] =0;
			System.out.println(test[i]);
		}
		System.out.println("======================");
		
		//7)
		for(int i=0; i<test.length; i++) {
			if(i%2==1) {
				test[i] = 10;
			}else {
				test[i] = 20;
			}
			System.out.println(test[i]);
		}
		System.out.println("=======================");
		
		//8)
		int sum = 0;
		float avg = 0.0f;
		
		for(int i=0; i < test.length; i++) {
			sum += test[i];
		}
		avg = sum / (float)test.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
//		int[] test;
//		test = new int[5];
//		
//		test[0] = 10;
//		test[1] = 20;
//		test[2] = 30;
//		test[3] = 40;
//		test[4] = 50;
//		
//		System.out.println(test[0]);
//		System.out.println(test[1]);
//		System.out.println(test[2]);
//		System.out.println(test[3]);
//		System.out.println(test[4]);
//		
//		System.out.println("===================");
//		
//		//int[] test = {10, 20, 30, 40, 50};
//		for(int i=0; i<test.length; i++) {
//			System.out.println("test [" + i+ "]: " + test[i]);
//			
//			test[2] = 100;
//			test[4] = 200;
//			System.out.println("test [" + i+ "]: " + test[i]);
//			
//			int sum = 0;
//			double avg = 0.0f;
//			
//			for(int i=0; i<test.length;i++) {
//				System.out.println(test[i]);
//				
//			for(int i =0; i<test.length; i++) {
//				if(i%2==0) {
//					System.out.println(test[i]==20);
//				}else {
//					System.out.println(test[i]==10);
//					sum += test[i];
//				}
//				avg = sum / (float)test.length;
//			}
//		
//			}
//			
//			System.out.printf("총점 : %d%n", sum);
//			System.out.printf("평균 : %.2f%n", avg);
			
		
	}
	

}
