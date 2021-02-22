package abstractex;

public abstract class Computer { //추상클래스 //상속을 하기위해 만든다.

	public abstract void display(); //상속 받은 클래스에서 구현
	public abstract void typing(); //(=하위 클래스에서 구현.)
	
	public void turnOn() { // 공통으로 사용
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
