package kr.s07.object;

public class Student04 {
	
	//멤버 변수(객체는 배열과 달리 모든 자료형을 사용할 수 있음)
	String name;
	int korean;
	int math;
	int english;
	int sum;
	double average;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student04 student = new Student04();
		student.name ="김유신";
		student.korean = 98;
		student.math = 95;
		student.english = 97;
		student.sum = student.korean + student.math + student.english;
		student.average = student.sum / 3.0;
		
		//객체의 멤버 변수의 값 출력
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.korean);
		System.out.println("수학 : " + student.math);
		System.out.println("영어 : " + student.english);
		System.out.println("총점 : " + student.sum);
		System.out.printf("평균 : %.2f%n", student.average);
	}

}
