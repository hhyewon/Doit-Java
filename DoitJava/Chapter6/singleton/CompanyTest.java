package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//singleton ������ ��ü�� �ϳ��� �����ǵ��� �Ѵ�.
		// Company company = new Company();
		// Company company2 = new Company(); �̷��� ���� ���� �ν��Ͻ��� ������.
		
		Company c1 = Company.getInstance(); //static���� �ؼ� Ŭ���� �̸����� ȣ�� ����
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
	}

}
