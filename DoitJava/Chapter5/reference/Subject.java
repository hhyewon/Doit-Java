package reference;

public class Subject { //과목에 대한 클레스

	String subjectName;
	int score;
	
	//getset 메서드 만들기
	public Subject(String name) {
		subjectName =name;
	}

	
	
	public void setSubjectName(String name) {
		subjectName =name;
	}

	//get set 메서드 만들기: 오른쪽 마우스 + source + Generate setter and getter
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
