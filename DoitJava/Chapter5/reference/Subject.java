package reference;

public class Subject { //���� ���� Ŭ����

	String subjectName;
	int score;
	
	//getset �޼��� �����
	public Subject(String name) {
		subjectName =name;
	}

	
	
	public void setSubjectName(String name) {
		subjectName =name;
	}

	//get set �޼��� �����: ������ ���콺 + source + Generate setter and getter
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	
	
}
