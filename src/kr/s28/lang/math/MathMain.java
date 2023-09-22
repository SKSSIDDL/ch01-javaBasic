package kr.s28.lang.math;

public class MathMain {
	public static void main(String[] args) {
		int a = Math.abs(-10); 
		System.out.println("절대값 : " +a);
		
		double b= Math.ceil(3.3);
		System.out.println("올림 : "+b);
		
		double c= Math.floor(3.7);
		System.out.println("내림 : "+c);
		
		int d= Math.round(3.7f); //float형이라 f는 필수
		System.out.println("반올림 : "+d);
		
		int e = Math.max(3, 5); //둘 중 최대값 반환
		System.out.println("최대값 : "+e);
		
		int f = Math.min(4, 7); //둘 중 최소값 반환
		System.out.println("최소값 : "+f);
		
	}
}
