package interfaceex;

public class CompleteCalc extends Calculator {
	// implements Calc, Runnable
	// interface는 구현코드가 없고 타입만 선언하기 때문에 여러 개를 상속받을 수 있다.
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERORR;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스");
	}

	@Override
	public void description() {
		//재정의
	//	super.description(); //calc의 description
	System.out.println("완벽한 계산기");
	}
	
}
