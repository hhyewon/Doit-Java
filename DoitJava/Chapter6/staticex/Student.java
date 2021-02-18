package staticex;

public class Student {

	// static int serialNum = 10000; 
	
	//이걸 private으로 생성하여 내부에서 사용하면 다른 클래스에서 사용 불가
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	//private를 외부에서 사용하기 위해
	public static int getSerialNum() {
		
		int i = 10;  //지역변수
		i++;
		System.out.println(i);
		
		//studentName = "홍길동"; //여기서 에러가 난다. // 맴버변수, 인스턴스 변수
		//static 함수 안에서는 인스턴스 변수를 사용할 수 없다
		
		return serialNum; //static 변수, 클래스 변수
	}

	
}
