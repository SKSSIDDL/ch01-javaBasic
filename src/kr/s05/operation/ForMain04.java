package kr.s05.operation;

public class ForMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = input.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("========");
	
		for(int i=1; i <=9; i++) { //i : 곱해지는 수 
			System.out.println(dan + "*" + i + "="+ dan * i);//문자열
		}
		
		input.close();
	}

}
