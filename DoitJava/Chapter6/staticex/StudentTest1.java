package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		//System.out.println(student.serialNum); �� ���� ���� ���� �� 10000�� ��� ��.
		// static �������� ��κ� Ŭ���� �̸����� �����Ѵ�.
		// �ν��Ͻ� �������� �ʾƵ� 
	
		//private�� static �Լ��� ����ϱ� ���� get�Լ��� �ҷ����ش�.
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		// System.out.println(studentJ.studentID);
		System.out.println(studentJ.getSerialNum());
		
		Student studentT = new Student();
		// System.out.println(studentT.studentID);
		System.out.println(studentT.getSerialNum());
		
		// static �������� ��κ� Ŭ���� �̸����� �����Ѵ�. (�׷��� ������� ����)
	//	System.out.println(studentJ.serialNum);
	//	System.out.println(studentT.serialNum);
		/* 10001
			10002
			10002
			10002 */
	
	}

}
