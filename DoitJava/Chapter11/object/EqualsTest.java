package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //재정의
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(studentID == std.studentID) 
				return true;
			else
				return false;
		}
		return false;
	}
	//equals를 재정의한 맴버변수를 사용
	 public int hashCode() {
		return studentID;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");

		//주소 값이 같은 지 체크(물리)
		System.out.println(str1 == str2); // false
		
		//문자열이 같은지 체크(논리)
		System.out.println(str1.equals(str2)); // true
		
		
		Student std1 = new Student(10001,"Tomas");
		Student std2 = new Student(10001,"Tomas");
		
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //false //equals 재정의후 true
	
		
		//10진수로 표현
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode());  //값이 동일
		//힙 메모리 위치는 다르지만 해시코드라는 메서드가 재정의 되있기 때문
		
		System.out.println(std1.hashCode()); 
		System.out.println(std2.hashCode());  //값이 다름
		System.out.println(System.identityHashCode(std2)); //값이 동일
		
		//equals를 재정의하면 hashCode도 재정의 한다.
		
		
		//실제 해시코드의 값을 알기 위해
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
				
		
	}

}
