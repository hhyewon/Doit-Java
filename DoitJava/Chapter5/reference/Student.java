package reference;

public class Student {

	int studentID;
	String studentName;
	Subject korea; //���� �ڷ���
	Subject math; 
	
	public Student() { //�����Ѵٰ� Ŭ������ ������ ����. //�����ڷ� ȣ��
		korea = new Subject("����");
		math = new Subject("����");
	} //�� ���񿡴��� �ν��Ͻ� ����
	
	public Student(int id, String name) { //������ �����ε�
		// �л��� ���̵�� �̸��� �ްڴ�.
		
		studentID =id;
		studentName = name;
		
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public void setKorea(int score) {
		//���� ����� ���� �̸��� ����
		
 //		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(int score) {
	//	math.setSubjectName(name);
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName+" �л��� ������ "+ total + "�� �Դϴ�.");
	}
}
