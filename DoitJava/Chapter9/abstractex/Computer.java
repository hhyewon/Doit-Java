package abstractex;

public abstract class Computer { //�߻�Ŭ���� //����� �ϱ����� �����.

	public abstract void display(); //��� ���� Ŭ�������� ����
	public abstract void typing(); //(=���� Ŭ�������� ����.)
	
	public void turnOn() { // �������� ���
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
