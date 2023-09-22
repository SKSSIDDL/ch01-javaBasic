package kr.s06.array;

public class ArrayMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch; //배열 선언
	//배열의 자료형
		ch = new char[4]; //배열 생성
		
		//배열의 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("====================");
		
		//반복문을 이용한 배열의 요소 출력
		                //배열의 길이
		for(int i = 0; i <ch.length; i++) { //시작이 0부터 출발하기 때문에 <= 대신 <, 꼭 0부터 출발!!!
			System.out.println("ch["+ i + "]:" +ch[i]); //i: 0~3
		}
		
		System.out.println("=====================");
		//배열 선언 + 생성
		int[] it = new int[6]; //int[]는 배열의 자료형
//		=int it [] = new int[6]; 둘다 가능, 자료형 뒤에다 [] 가능
		
		//배열의 선언, 생성(명시적 배열 생성, 초기화
		char[] ch2 = new char[] {'자', '바'}; //new char[] = 명시적 배열생성, 배열의 길이를 넣지 않는다. ex) new char[2] X
		//배열의 선언, 생성(암시적 배열 생성, 초기화
		char[] ch3 = {'강', '남', '구'};
	}

}


//용도가 같은 것 끼리 배열로 묶는다.