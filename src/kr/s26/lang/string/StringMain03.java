package kr.s26.lang.string;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = "  aBa  ";
		String s2 = "abc";
		int a = 100;
		String msg = null; //객체 생성하지 않아 데이터가(주소가) 아직 없음. ->초기화할 때 사용
		
		msg = s1.toUpperCase(); //문자열을 대문자로 변환
		System.out.println("msg : "+msg);
		
		msg = s1.toLowerCase();//문자열을 소문자로 변환
		System.out.println("msg : "+msg);
		
		//old문자를 new 문자로 대체
		msg = s1.replace("aB", "b"); //aB를 b로 대체
		System.out.println("msg : "+msg);
		
		//앞 뒤 공백 제거, 중간에 있는 공백은 지울 수 없음
		msg = s1.trim();
		System.out.println("msg : "+msg);
		
		boolean f = s1.contains("aB"); //s1에 aB가 포함되어 있는지 true 없는지 false
		System.out.println("f : "+f);
		
		f= s2.startsWith("ab"); //s2가 ab로 시작하느냐, 지정한 문자열로 시작할 경우 true 반환
		System.out.println("f : "+f);
		
		f = s2.endsWith("bc");//지정한 문자열로 끝나는 경우 true 반환
		System.out.println("f : "+f);
		
		//int -> String
		msg = String.valueOf(a);
		msg = a + ""; //"" : (빈 문자열 *공백없음* - 생성은 되었지만 내용이 없음)
		
	}
}
