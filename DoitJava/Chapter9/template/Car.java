package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {} //�߻� Ŭ����X ���� �ǹ� ���� //�ʿ信���� ������
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public final void run() { //���ø� �޼��� // ������ �Ұ��� //�ó�����
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
