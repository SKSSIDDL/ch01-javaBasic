package kr.s05.operation;

public class DoWhileMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su= 0;
		String str = "Hello World";
		
		//선 처리 후 비교(do while)-무조건 1회 시행이라 6번으로
		do {//수행문
			System.out.println(str);
		}while(su++ <5);
		System.out.println("=============");

		
		//while - 5번
		int su2 =0;
		//선 비교 후 처리
		while(su2++ <5) {
			System.out.println(str);
		}
	}
}
