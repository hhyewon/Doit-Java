package staticex;

public class Student {

	// static int serialNum = 10000; 
	
	//�̰� private���� �����Ͽ� ���ο��� ����ϸ� �ٸ� Ŭ�������� ��� �Ұ�
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	//private�� �ܺο��� ����ϱ� ����
	public static int getSerialNum() {
		
		int i = 10;  //��������
		i++;
		System.out.println(i);
		
		//studentName = "ȫ�浿"; //���⼭ ������ ����. // �ɹ�����, �ν��Ͻ� ����
		//static �Լ� �ȿ����� �ν��Ͻ� ������ ����� �� ����
		
		return serialNum; //static ����, Ŭ���� ����
	}

	
}
