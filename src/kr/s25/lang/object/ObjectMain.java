package kr.s25.lang.object;

public class ObjectMain {
	public static void main(String[] args) {
		ObjectMain om = new ObjectMain();
		
		//클래스 정보
		System.out.println(om.getClass());
		
		//클래스명 반환
		System.out.println(om.getClass().getName());
		
		//해시코드 반환
		System.out.println(om.hashCode());  //객체의 유니크한 코드를 반환(10진수)
		
		//해시코드를 16진수로 변환
		System.out.println(Integer.toHexString(om.hashCode())); //Integer.toHexString = 10진수 -> 16진수로 변환

		//참조값 반환(클래스 명 + 해시코드 16진수)
		System.out.println(om.toString());
		//참조변수를 호춣면 자동적으로 toString()메서드가 동작해서 참조값을 반환
		System.out.println(om);
		
	}
}
