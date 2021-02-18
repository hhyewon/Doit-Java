package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		//System.out.println(student.serialNum); 를 제일 먼저 실행 시 10000이 출력 됨.
		// static 변수들은 대부분 클래스 이름으로 참조한다.
		// 인스턴스 생성하지 않아도 
	
		//private된 static 함수를 사용하기 위해 get함수를 불러와준다.
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		// System.out.println(studentJ.studentID);
		System.out.println(studentJ.getSerialNum());
		
		Student studentT = new Student();
		// System.out.println(studentT.studentID);
		System.out.println(studentT.getSerialNum());
		
		// static 변수들은 대부분 클래스 이름으로 참조한다. (그래서 노란줄이 생김)
	//	System.out.println(studentJ.serialNum);
	//	System.out.println(studentT.serialNum);
		/* 10001
			10002
			10002
			10002 */
	
	}

}
