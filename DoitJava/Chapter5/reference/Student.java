package reference;

public class Student {

	int studentID;
	String studentName;
	Subject korea; //참조 자료형
	Subject math; 
	
	public Student() { //선언한다고 클래스가 생기지 않음. //생성자로 호출
		korea = new Subject("국어");
		math = new Subject("수학");
	} //각 과목에대한 인스턴스 생성
	
	public Student(int id, String name) { //생성자 오버로딩
		// 학생의 아이디와 이름을 받겠다.
		
		studentID =id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
		//국어 과목애 대한 이름과 점수
		
 //		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(int score) {
	//	math.setSubjectName(name);
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName+" 학생의 총점은 "+ total + "점 입니다.");
	}
}
