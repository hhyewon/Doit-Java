package reference;

public class StudentTest {
	
	public static void main(String[] arg) {

		Student studentJames = new Student(100,"James");
		//public Student(int id, String name)
		studentJames.setKorea(100);
		studentJames.setMath(100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setKorea(30);
		studentTomas.setMath(50);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
}

}