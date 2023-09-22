package kr.s24.object5.abs;
//부모클래스(추상)
abstract class Animal {
	public void breathe() {
		System.out.println("숨쉬다");
	}
	//추상메서드 - 자식클래스에 의무만 상속
	public abstract void sound();
}

//자식클래스
class Dog extends Animal{
	//추상메서드 구현
	@Override
	public void sound() {
		System.out.println("개는 멍멍멍~");
	}
}
class Cat extends Animal{
	//추상메서드 구현
	@Override
	public void sound() {
		System.out.println("고양이는 냥~");
	}
}

public class AbstractMain03 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breathe();
		d.sound();
		
		System.out.println("============");
		
		Cat c = new Cat();
		c.breathe();
		c.sound();
	}
}
