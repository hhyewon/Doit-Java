package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		//�������̽��� �����ϴ� ��� >> �����Ѱ� �ٽ� ������ ����� ��
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		//���ٽ� >> �����ϰ� �����ؼ� �� ���� ����� �� //�ϳ��� �޼���
		//���ٽ��� �Լ��� ����ó�� ����Ѵ�
		StringConcat concat = (s1,s2) -> System.out.println(s1+" " +s2); //���ٽ�
		concat.makeString("hello", "java");
		
		//�͸��� Ŭ����  //�ϳ��� �������̽�, �ϳ��� �߻�Ŭ����
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ " " + s2);
			}
		};
		concat2.makeString("hello","java");
	}

}
