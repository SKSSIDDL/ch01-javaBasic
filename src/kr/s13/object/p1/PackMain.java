package kr.s13.object.p1;

//호출하고자 하는 클래스의 패키지 등록
import kr.s13.object.p2.PackTwo;//*은 모든 클래스에 import

public class PackMain {
	public static void main(String[] args) {
		//같은 package에 있는 class호출(PackOne)
//		kr.s13.object.p1.PackOne p1 = new kr.s13.object.p1.PackOne(); //원칙
		
		//같은 package의 클래스 호출해서 객체 생성을 할 때는 package 생략
		PackOne p1 = new PackOne();
		
		//다른 package의 클래스 호출할 때는 package 반드시 명시
//		kr.s13.object.p2.PackTwo p2 = new kr.s13.object.p2.PackTwo();
		
		//import문을 이용해서 호출하고자 하는 클래스의 패키지를 등록하면 클래스명만 기재할 수 있음(맨 위 import 참고)
		PackTwo p2 = new PackTwo();
		
	}
}
