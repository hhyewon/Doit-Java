package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() { //defalut ���� �־��ְ� �ʹٸ�
		//���� ���� !
		//�����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ������ �� �� ������ ����. (this)
		//���� ���� �� �ȿ� int i=0; ���� �ڵ带 �־��ٸ� this���� ������ ��
		// this�� �� ���� �� � ���嵵 �� �� ����.
		
		this("�̸�����",1);
	} //�̹� �ؿ� �̸��� ���̸� �ʱ�ȭ���ִ� �Լ��� �����ϱ� ȣ��
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	
	// �ڱ� �ڽ��� �ν��Ͻ� �ּҸ� ��ȯ �ϱ�
	public Person returnSelf() { //�ڱ��ڽ� Ŭ�������� Person�� �־��ش�.
		return this; //���� �ν��Ͻ��� �ּ� ���� ��ȯ����.
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name); //�̸������� ȣ�� ��
	
		System.out.println(p1.returnSelf());
	}
}
