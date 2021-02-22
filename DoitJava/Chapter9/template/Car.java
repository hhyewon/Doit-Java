package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {} //추상 클래스X 구현 의무 없음 //필요에의해 재정의
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() { //템플릿 메서드 // 재정의 불가능 //시나리오
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
