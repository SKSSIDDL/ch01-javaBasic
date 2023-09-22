package kr.s05.operation;

public class ForMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5; i>=1; i--) {
			System.out.print(i+ "\t");
		}
		System.out.println("\n================================="); //위에서 띄어쓰기 안되어잇어 \n
		
		
		                   //대입연산자
		for(int i=0; i <=10; i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println("\n==========================================");
		
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i + "\t");
			}
			
		}
		System.out.println("\n==========================================");
	}

}
