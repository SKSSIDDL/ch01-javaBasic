package kr.s28.lang.math;

import java.util.Arrays;
import java.util.Random;

public class RandomMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이가 6인 int형 배열 생성하고 1~45 숫자 범위로 난수를 구함
		 * 중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고 출력
		 * 난수 생성 : Math.random() 또는 Random 클래스의 nextInt() 메서드 사용
		 */
		
		int[] lotto = new int[6];		
		for(int i=0; i<lotto.length; i++) { //6->lotto.length
			lotto[i] = (int)(Math.random()*45)+1; //1~45
					
		//중복된 숫자가 있는지 검증
			for(int j=0; j<i; j++) { //자기 자신과 비교할 필요가 없어 j=i제외
				if(lotto[j]==lotto[i]) {
					System.out.println("~~~~~~"+lotto[i]);//값이 중복된 경우
					i--; //다음 루프로 넘어가지 못하고 제자리
					break;
				}
			}
			
		}
		//오름차순 정렬
		Arrays.sort(lotto);
		
		System.out.println("로또 번호 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
