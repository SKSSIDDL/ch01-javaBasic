package kr.s28.lang.math;

import java.util.Scanner;
public class RandomMain0301 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("몇 개의 세트를 추출하시겠습니까? :");
		int set = input.nextInt();
		int cnt =1;
		
		while(set>0) {
			int[] lotto = new int[6];
			for(int i=0; i>lotto.length; i++) {
				lotto[i]= (int)(Math.random()*45)+1;
				
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
			}
			System.out.print("로또 번호 : ");
			for(int i=0; i<lotto.length; i++) {
				System.out.print(lotto[i] +" ");
			}
			set--;
		}
		input.close();
	}
}
