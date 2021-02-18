package singleton;

public class Company {

	//�����ϰ� ���� �ν��Ͻ�
	// �� ���ο����� ����
	private static Company instance = new Company();
	private Company() { }
	
	//�ܺο��� ����ϱ� ���� �޼��� ���� 
	public static Company getInstance() { //static���� �ؾ� Ŭ���� �̸����� ȣ�� ����
		if (instance == null)
			instance = new Company();
		
		return instance;
	}
}
