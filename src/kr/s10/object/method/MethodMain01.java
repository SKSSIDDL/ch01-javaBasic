package kr.s10.object.method;

public class MethodMain01 {
	//기본적인 메서드의 이해
	
	//반환하는 데이터가 있는 경우
  //접근제한 반환형 메소드명
	public int add(int a, int b) {
		return a+b;
	}
	
	//반환하는 데이터가 없는 경우(return 없음)
	   //비어있음을 의미(return 사용금지)
	public void print(String str) {
		System.out.println(str);
	}

	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		
		int result = method.add(10, 20);
		System.out.println("result = " + result);
		
		System.out.println("=============");
		
		method.print("오늘은 수요일");
	}
}


//반환형은 return했을 때 나오는 자료형