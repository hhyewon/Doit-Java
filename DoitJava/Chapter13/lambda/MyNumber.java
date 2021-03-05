package lambda;

@FunctionalInterface
public interface MyNumber { //함수형 인터페이스(람다식을 선언하기 위한 인터페이스)
	
	int getMaxNumber(int num1, int num2); //람다식을 위한 함수형 인터페이스은 메서드를 하나만 선언해야함
	//int testNumber(int x, int y);   //어느 메서드를 호출했는지 모호해지기 때문에. >>@FunctionalInterface을 입력하면 방지가능(에러가 남)
	//void add(); >>하면 이 인터페이스에서 오류가 난다.
}
