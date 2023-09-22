package kr.s24.object.supertest;

//부모 클래스
class Point{
	int x;
	int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : " + x + ",y : "+ y;
	}
}

//자식 클래스
class Point3D extends Point{
	int z;
	
	public Point3D (int x, int y, int z) {
		super(x,y);
		
		this.z =z; //***********************
	}
	
	//매서드 오버라이딩
	@Override
	public String getLocation() {
		return "x:"+x +", y:"+y+", z:"+z;
	}
}

public class SuperMain06 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
		
		//getLocation 매서드 호출
		System.out.println(p.getLocation());
	}
}
