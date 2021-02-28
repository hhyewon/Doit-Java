package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		//1. ������Ʈ Ŭ������ Ŭ���� �̿�
		Class pClass1 = person.getClass(); //getClass�� ������Ʈ �޼���
		
		System.out.println(pClass1.getName());
		
		//2. Ŭ���� .Ŭ���� //1,2�� �̹� person�̶�� Ŭ������ �����ϵǾ�� ��� ���� ( ����static �ε� )
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		//3. forName �̿� //�ִ��� ������ ������ ������ �Ǵ� ���� �� �̸��� ���� Ŭ������ �����´�.( ���� �ε� )
		//�ϴ� �������� �ȴ�. (������ ������ �����)
		Class pClass3 = Class.forName("classex.Person");
		
		System.out.println(pClass3.getName());
	}

}
