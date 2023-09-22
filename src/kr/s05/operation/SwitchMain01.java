package kr.s05.operation;

public class SwitchMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수형 숫자 입력 >");
		int a = input.nextInt();
		
		//switch 의 인자값은 long을 제외한 정수형(byte, short, int) + char, 문자열 사용 가능
		switch(a) {
		case 1 :
			System.out.println("1 입력");
			break; //switch 블럭을 빠져나감
		case 2 :
			System.out.println("2 입력");
			break;
		case 3 :
			System.out.println("3 입력");
			break;
		default :
			System.out.println("1,2,3이 아닌 숫자 입력");
		}
		
		//case마다 {}이 있다면 break 안써도됨
		
		input.close();
	}

}
