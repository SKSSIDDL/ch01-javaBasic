package kr.s17.trainning;

public class Animal {
	/*
	 * [실습]
	 * 1. 멤버변수 : 이름(name), 나이(age), 비행여부(fly-boolean) 접근자 private
	 * 2. 생성자 지정 : 인자가 없는 생성자, 인자가 있는 생성자(name, age, fly)
	 * 3. set/get 메서드 지정 : 멤버 변수를 private로 지정하고 public한 set/get메서드 정의
	 */
	
	private String name;
	private int age;
	private boolean fly;
	
	//인자가 없는 생성자
	public Animal () {}
	
	//인자가 있는 생성자(오버로딩)
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	public boolean isFly() { //boolean 데이터 반환할 때 is사용
		return fly;
	}
	

	
	public static void main(String[] args) {
		
	}
}
