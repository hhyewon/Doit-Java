package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		//1. 오브젝트 클래스의 클레스 이용
		Class pClass1 = person.getClass(); //getClass는 오브젝트 메서드
		
		System.out.println(pClass1.getName());
		
		//2. 클래스 .클래스 //1,2는 이미 person이라는 클래스가 컴파일되어야 사용 가능 ( 정적static 로딩 )
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		//3. forName 이용 //있는지 없는지 모르지만 실행이 되는 순간 그 이름을 가진 클래스를 가져온다.( 동적 로딩 )
		//일단 컴파일은 된다. (없으면 오류가 생길뿐)
		Class pClass3 = Class.forName("classex.Person");
		
		System.out.println(pClass3.getName());
	}

}
