package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����",100);
		studentLee.addSubject("����",90);
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("����",100);
		studentKim.addSubject("����",90);
		
		studentKim.showStudentInfo();
		
		/* �л� Lee ���� ���� ������ ������ 100 �� �Դϴ�.
�л� Lee ���� ���� ������ ������ 90 �� �Դϴ�.
���� : 190
�л� Kim ���� ���� ������ ������ 100 �� �Դϴ�.
�л� Kim ���� ���� ������ ������ 90 �� �Դϴ�.
���� : 190
*/
	}

}
