package kr.s15.object.constructor;

class Car2{ //같은 패키지 내에서 class명이 같을 수 없다
	String color;
	String gearType;
	int door;
	
	//생성자 Overloading
	public Car2() {}
	
	//생성자 여러개
	public Car2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarMain02 {
	public static void main(String[] args) {
		Car2 c1= new Car2(); //호출 안됨 : 생성자를 넣었기 때문, Car2 생성자도 만들어줘야함.
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 2;
		System.out.println(c1.color +","+ c1.gearType+ "," +c1.door);
		
		System.out.println("===================================");
		
		Car2 c2 = new Car2("blue","manual",5);//필요한 데어터를 바로 셋팅가능
		System.out.println(c2.color +","+ c2.gearType+ "," +c2.door);
	}
}
