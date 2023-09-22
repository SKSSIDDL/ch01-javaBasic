package kr.s07.object;

public class Student01 {
	
	//객체의 구성원이 되는 멤버 변수(데이터 저장을 위해 생성)
	String name;
	int age; //main 밖에 생성된 변수, class안에 생성
	
	public static void main(String[] args) {
		//메모리에 올리기(객체 선언)
		Student01 student;
		//객체(=group) 생성
		student = new Student01(); //new-객체가 생성되라
		
		//객체의 멤버변수의 값 할당
		student.name = "홍길동";
		student.age = 20;
		
		//객체의 멤버 변수 값 출력
		System.out.println(student.name+ "," + student.age);
		
	}

}
