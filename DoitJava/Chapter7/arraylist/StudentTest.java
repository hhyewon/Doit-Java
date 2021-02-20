package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학",90);
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("국어",100);
		studentKim.addSubject("수학",90);
		
		studentKim.showStudentInfo();
		
		/* 학생 Lee 님의 국어 과목의 성적은 100 점 입니다.
학생 Lee 님의 수학 과목의 성적은 90 점 입니다.
총점 : 190
학생 Kim 님의 국어 과목의 성적은 100 점 입니다.
학생 Kim 님의 수학 과목의 성적은 90 점 입니다.
총점 : 190
*/
	}

}
