package kr.s05.operation;

public class WhileMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = input.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("==============");
		
		int i = 1; //초기값
		
		while(i<=9) { //조건식 i: 1~9까지 곱해지는 수
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++; //증감식 -> 없으면 무한루프
		}
		
		input.close();
	}

}
  //for문, while 둘 다 가능