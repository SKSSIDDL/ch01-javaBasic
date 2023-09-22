package kr.s22.object.extention;

//부모 클래스
class GrandParent{
	public String getCar() {
		return "구형 자동차"; //다른 class에 상속되어 있는 경우도 있기에 바꾸면 x, 부모는 단 1명(개)
	}
}

//자식 클래스
class Father extends GrandParent { //리모델링
	/*
	 * Method Overriding(매서드 재정의)
	 * 상속관계에서 자식 클래스에 매서드 재정의를 하면 부모 클래스의 매서드가 호출되는 것이 아니라
	 * 자식 클래스의 매서드가 호출됨
	 */
	public String getCar() { //뼈대는 그대로, 내용만 바꿈
		return "신형 자동차";
	}
}

class Uncle extends GrandParent {
	
}

public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		
		Uncle uc = new Uncle();
		System.out.println(uc.getCar());
	}
}
