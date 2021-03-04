package innerclass;

/* ���� Ŭ����
 * �ν��Ͻ� ���� Ŭ����, ���� ���� Ŭ����
 */

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass(){
		inClass = new InClass();
	}
	
	private class InClass{ //�ν��Ͻ� ���� Ŭ���� //�ν��Ͻ� ���� Ŭ���������� static�� static �ż��带 ����� �� ����.
		int inNum = 200;
		
		//���� Ŭ���������� static�� ����� �� ����.
		//static�� �ν��Ͻ�(InClass) ������ ������� ȣ���Ͽ� ����� �� �ִ�.
		//������ InClass�� �ҷ����� �� ������ ����� �� �ֱ� ������ ��� �Ұ�.
		//static int sInNum = 100; //��� ����� �� ����. 
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		//��� �Ұ�
		//static void sTest() {} 
	}
	
	public void usingTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{ //���� ���� Ŭ����
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
		//	num += 10; //num�� outClass�� �ν��Ͻ� ����. 
			//InStaticClass�� outClass�� ������ ������� ��밡���ؾ��ϱ� ������ outClass�� �ν��Ͻ� ������ ����� �� ����.
		
		sNum += 10; //���� ���� ������ ���� Ŭ������ ������ ��� ������
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(sInNum);
		//num�� ���Ұ�(�ν��Ͻ� ���� ����)
		}
		static void sTest() { //���� Ŭ�������� ���� �޼��� ȣ��
			//���������� ����� �� �ִ�.
			System.out.println(sNum);
		//	System.out.println(iNum); //���� Ŭ������ ���� �޼���(sTest)�� �׳� ȣ���� �Ǿ���ϴµ� iNum�� static�� �ƴϹǷ� �׳� ȣ���� �Ұ���. >> ����
			System.out.println(sInNum);
		}
		
	}


}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		
		//������ InClass�� private�� ���� ��� 
	//	outClass.inClass.inTest();
		
		// �ƿ�Ŭ���� ���ο��ִ� ��Ŭ������ ����
	//	OutClass.InClass inClass = outClass.new InClass();
	//	inClass.inTest();
		
		//������ InClass�� private�� ���� ��� usingTest �޼��带 ���� �� �ȿ��� inClass ȣ��
		outClass.usingTest();
		
		//�ƿ�Ŭ������ ������ ������� ȣ���� �� �ִ�.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		
		OutClass.InStaticClass.sTest();
	}

}
