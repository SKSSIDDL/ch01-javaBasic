package kr.s26.lang.string;

public class StringMain05 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * str 변수에 저장된 값을 대문자 -> 소문자로, 소문자는 대문자로 변환
		 * 
		 * [출력 예시]
		 * ABCmdYE=4w?ewZZ
		 */
		String str = "abcMDye-4W?EWzz";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c>=65 && c<=90) { //대문자
				result += String.valueOf(c).toLowerCase();
				         //char -> String   대문자 -> 소문자
			}else if (c>= 97 && c<=122) { //소문자
				result += String.valueOf(c).toUpperCase();
			}else { //대,소문자 둘다 아님
				result += c;
			}
		}
		System.out.println(result);
	}
}
