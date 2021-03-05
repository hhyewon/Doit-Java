package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		//인터페이스를 구현하는 방식 >> 구현한걸 다시 재사용을 계속할 시
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		//람다식 >> 간단하게 구현해서 한 번만 사용할 때 //하나의 메서드
		//람다식은 함수를 변수처럼 사용한다
		StringConcat concat = (s1,s2) -> System.out.println(s1+" " +s2); //람다식
		concat.makeString("hello", "java");
		
		//익명내부 클래스  //하나의 인터페이스, 하나의 추상클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ " " + s2);
			}
		};
		concat2.makeString("hello","java");
	}

}
