package kr.s11.object.method;

public class MethodArgMain03 {
	//Variable Arguments
	//***자료형이 일치할 때*** 전달하고자 하는 값의 개수를 다르게 지정할 수 있음
	//전달하는 데이터는 내부적으로 배열로 인식함
	
	public void argTest (int ... n) {//variable arguments로 인식 = ..., n은 배열로 인식
		for(int i=0; i<n.length; i++) {
			System.out.println("n["+i+"]:" + n[i]);
		}
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		MethodArgMain03 me = new MethodArgMain03();
		
		me.argTest();//전달하는 데이터 없음-> L12 실행
		me.argTest(10);
		me.argTest(10,20);
		me.argTest(10,20,30);
		
	}
}
