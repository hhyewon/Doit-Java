package lambda;

@FunctionalInterface
public interface MyNumber { //�Լ��� �������̽�(���ٽ��� �����ϱ� ���� �������̽�)
	
	int getMaxNumber(int num1, int num2); //���ٽ��� ���� �Լ��� �������̽��� �޼��带 �ϳ��� �����ؾ���
	//int testNumber(int x, int y);   //��� �޼��带 ȣ���ߴ��� ��ȣ������ ������. >>@FunctionalInterface�� �Է��ϸ� ��������(������ ��)
	//void add(); >>�ϸ� �� �������̽����� ������ ����.
}
