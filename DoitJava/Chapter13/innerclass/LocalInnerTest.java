package innerclass;
/* ���� Ŭ����
 * ���� ���� Ŭ����, �͸� ���� Ŭ����
 */

class Outer{
	
	int outNum = 100;
	static int sNum = 20;
	
	Runnable runnable = new Runnable() { //�͸� ���� Ŭ����
		// �ϳ��� Ŭ������ �ϳ��� �������̽��� ������ �� �ִ�. 
		// ���� ���� ����
		@Override
		public void run() {
			System.out.println("run");
		}
		
	};
	
	
	public Runnable getRunnable(final int i) { //�������� Ŭ����
		
		final int localNum = 100; //�޼��尡 ȣ��� �� ����
		
		return new Runnable(){//Ŭ���� �̸� ���ֱ� //�͸� ���� Ŭ����
			//getRunnable�� �θ��� �ٷ� Runnable�� �ҷ����ڴ�.

			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			} 
		};
		
		/*	@Override
			public void run() {
				
				//����ϴ°� ��������� ��ȭ��ų �� ����.
			//	localNum += 100; //���� ���� Ŭ������ ������ ����.
			//	i+=200; //�޼����� �Ű������� �޼����� ���� ����
				//��״� ���ؿ� �ڸ��� ������ �޼����� ȣ���� ������ ��������. 
				
				//getRunable �޼���� ȣ���� �Ǹ� ������ �޼���
				// run�̶�� �޼���� getRunable�� ȣ���� �� ���� ȣ���� �ȴ�. 
				// �׷��� ������ �� �������� ȣ���� �Ǵ� ������ ���ؿ��� ����� �� �ִ�.
				
				// >> ���� ���� Ŭ������ ���ȭ(final) ���Ѿ� �ȴ�.
				
				outNum += 10; //�ν��Ͻ� ������ ��� ����.
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				
			}
			*/
			
		// return new MyRunnable(); 
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		outer.runnable.run();
	}

}
