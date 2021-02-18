package singleton;

public class Company {

	//유일하게 사용될 인스턴스
	// 이 내부에서만 사용됨
	private static Company instance = new Company();
	private Company() { }
	
	//외부에서 사용하기 위해 메서드 생성 
	public static Company getInstance() { //static으로 해야 클래스 이름으로 호출 가능
		if (instance == null)
			instance = new Company();
		
		return instance;
	}
}
