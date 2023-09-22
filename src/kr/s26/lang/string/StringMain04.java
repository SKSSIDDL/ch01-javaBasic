package kr.s26.lang.string;

import java.util.Scanner;
public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력받은 묹열을 한 문자씩 읽어서 역순으로 표시하시오
		 * 
		 * [입력 예시]
		 * 문자열 : hello 한문자씩 charAt
		 * 
		 * [출력 예시]
		 * olleh 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = input.nextLine();
		
//		for(int i=0; i<str.length(); i++) {
//			System.out.print(str.charAt(i)); //입력한대로 출력
//		}
		
		for(int i= str.length()-1; i>=0; i--) { //마지막 인덱스 length() -1
			System.out.print(str.charAt(i)); //반대로 출력
		}
		
		input.close();
	}
}
