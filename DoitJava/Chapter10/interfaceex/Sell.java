package interfaceex;

public interface Sell {
	void sell();
	
	default void order() { //buy�� sell�� ������ ����Ʈ �޼���
		System.out.println("���� �ֹ�");
	}
}
