package kr.s05.operation;

public class IfMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====단일 if문====");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int a = input.nextInt(); //선언 후 대입, 대입하며 선언도 가능
		
		if(a <0) {
			a = -a;
		} //{}생략 가능
		
		System.out.println("절대값은 : "+ a +"이다");
		
		input.close();
		
	}

}
