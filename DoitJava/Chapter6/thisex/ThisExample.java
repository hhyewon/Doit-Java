package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year =year;
		//�ڽ��� �޸𸮸� ����Ű�� this
	//this�� �� ���� �� �� year�� ���� �Ű������� year�� ����
		//�� �̸��� �ٸ� �ô� ������ ex) year= y
		//������ �ڹٿ����� set�̳� get �޼��带 �� �� ���� �̸����� ���� ����.
	}
	public void printThis() {
		//this�� �� ����Ű���� Ȯ���ϱ�
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		//���� this���� �ٸ� �ν��Ͻ� ���� ������ !
		System.out.println(b1);
		b1.printThis();  //�� ���� ����
		
		System.out.println(b2);
		b2.printThis(); // b1�� ���� this�ε� ���� �ٸ�
		
	}
}
