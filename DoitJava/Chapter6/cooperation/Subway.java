package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) { //��� ������ ��ȣ�� ������ �����ؾ��Ѵ�. �ϸ� ���� //�ƴѰ�� ����Ʈ �����ڷ� ����� ��
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //�°��� �¿��� ���
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("����ö" + lineNumber + "���� �°��� "+ passengerCount + " ���̰�, ������" 
	+ money + " �Դϴ�.");
	}
}
