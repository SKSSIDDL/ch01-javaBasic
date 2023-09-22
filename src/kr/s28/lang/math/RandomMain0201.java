package kr.s28.lang.math;

import java.util.Random;
import java.util.Scanner;

public class RandomMain0201 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 가위바위보 게임
		 * 
		 * [입력 예시]
		 * ----------------------
		 * 메뉴>1. 게임하기 2. 종료
		 * ----------------------
		 * 메뉴 >1
		 * 가위바위보 입력(0.가위, 1.바위, 2.보)
		 * 
		 * [출력 예시]
		 * -> 컴퓨터 : 가위, 사람 : 바위
		 * 결과 : 사람 승 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
//		int[] game = {0,1,2};
//		double ran = Math.random(); //0.0 ~ 1.0 미만의 난수 발생
//		//System.out.println("발생한 난수 : "+ran);
//		int index = (int)(ran*3);
//		
//		Random r1 = new Random();
//		index = r1.nextInt(3);
		
		while(true) {
			System.out.println("=========================");
			System.out.println("메뉴> 1.게임하기  | 2. 종료");
			System.out.println("=========================");
			
			System.out.print("메뉴 선택> ");
			int num = input.nextInt();
			
			int[] game = {0,1,2};
			double ran = Math.random(); //0.0 ~ 1.0 미만의 난수 발생
			//System.out.println("발생한 난수 : "+ran);
			int index = (int)(ran*3);
			
			Random r1 = new Random();
			index = r1.nextInt(3);
			
			if(num==1) {
				while(true) {
					System.out.print("가위바위보 입력(0.가위, 1.바위, 2.보) :");
					int a = input.nextInt();
					if(a==0) {
						if(index==1) {
							System.out.println("결과 : 기계 승");
						}else if(index==2) {
							System.out.println("결과 : 사람 승");
						}else {
							System.out.println("무승부");
						}
						break;
					}
					if(a==1) {
						if(index==0) {
							System.out.println("결과 : 사람 승");
						}else if(index==2) {
							System.out.println("결과 : 기계 승");
						}else {
							System.out.println("무승부");
							
						}
						break;
					}
					if(a==2) {
						if(index==0) {
							System.out.println("결과 : 사람 승");
						}else if(index==1) {
							System.out.println("결과 : 기계 승");
						}else {
							System.out.println("무승부");
						}
						break;
					}
				}
			}else if(num==2) {
				System.out.println("시스템 종료");
				System.exit(0);
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			
		
		input.close();
	}
	}
}
