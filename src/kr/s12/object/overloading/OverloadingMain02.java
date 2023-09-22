package kr.s12.object.overloading;

public class OverloadingMain02 {
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이를 구하는 메서드
	public void getLength(int n) {
		String s = String.valueOf(n); //int를 string으로 변환
		//길이 출력
		getLength(s); //=3번재 public을 의미(재활용성을 높이기 위해)
	}
	public void getLength(float n) {
		String s = String.valueOf(n); //float을 string으로 변환
		getLength(s);
	}
	public void getLength(String s) {
		System.out.println(s+"의 길이 : "+s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000);
		om.getLength(3.14f); //f 까먹지 마세요
		om.getLength("Hello");
	}
}


//매서드마다 동일한 코드 반복 System.out.println(s+"의 길이 : "+s.length()); = 재활용성이 떨어짐
