package interfaceex;

public interface Calc { //�������̽��� ����� �߻�޼��尡 �ڵ����� ����ȴ�.

	
	/* 
	 * �������̽��� ��� 
	 * ���: ��� ������ ����� ��ȯ��
	 * �߻� �޼���: ��� �޼���� �߻� �޼���� ����
	 * -- JAVA 8 ���� �߰� --
	 * ����Ʈ �޼���: �⺻ ������ ������ �޼���, ���� Ŭ�������� ������ �� �� ���� //�ڵ带 ����
	 * ���� �޼���: �ν��Ͻ� ������ ������� �������̽� Ÿ������ ����� �� �ִ� �޼���
	 * Private �޼���: �������̽��� ������ Ŭ�������� ����ϰų� ������ �� �� ����. // �������̽� ���ο����� ���
	 */
	
	
	double PI = 3.14;  //public static final�� �ڵ� ����
	int ERORR = -99999999;
	
	//abstract ������ ���ص� interface��� Ű���� �ȿ� ������ �ϸ� �߻� �ż��尡 �ȴ�.
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int div(int num1, int num2);
	
	default void description() { //default�� ������ ������. // ���� �ڵ带 ���� �� ���� ����
		//����Ʈ �����ڵ�
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) { //static�� �ν��Ͻ��� �������� ������� ��� ����
		int total = 0 ;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	
}
