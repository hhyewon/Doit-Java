package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		//클라이언트 코드
		Calc calc = new CompleteCalc(); //인터페이스와 인터페이스를 구현한 클래스
		
		System.out.println(calc.add(num1,num2));
		// calc.showInfo() => 불가능 // Calc에 없음
		
		calc.description();
		
		int[] arr = { 1,2,3,4,5};
		int sum= Calc.total(arr);
		System.out.println(sum);
	}

}
