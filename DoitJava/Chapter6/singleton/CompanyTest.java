package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//singleton 패턴은 객체가 하나만 생성되도록 한다.
		// Company company = new Company();
		// Company company2 = new Company(); 이러면 여러 개의 인스턴스가 생성됨.
		
		Company c1 = Company.getInstance(); //static으로 해서 클래스 이름으로 호출 가능
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
	}

}
