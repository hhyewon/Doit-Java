package interfaceex;

public class CompleteCalc extends Calculator {
	// implements Calc, Runnable
	// interface�� �����ڵ尡 ���� Ÿ�Ը� �����ϱ� ������ ���� ���� ��ӹ��� �� �ִ�.
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERORR;
	}

	public void showInfo() {
		System.out.println("Calc �������̽�");
	}

	@Override
	public void description() {
		//������
	//	super.description(); //calc�� description
	System.out.println("�Ϻ��� ����");
	}
	
}
