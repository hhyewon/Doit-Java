package interfaceex;

public interface Calc { //인터페이스는 상수와 추상메서드가 자동으로 선언된다.

	
	/* 
	 * 인터페이스의 요소 
	 * 상수: 모든 변수는 상수로 변환됨
	 * 추상 메서드: 모든 메서드는 추상 메서드로 구현
	 * -- JAVA 8 부터 추가 --
	 * 디폴트 메서드: 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음 //코드를 재사용
	 * 정적 메서드: 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드
	 * Private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음. // 인터페이스 내부에서만 사용
	 */
	
	
	double PI = 3.14;  //public static final로 자동 선언
	int ERORR = -99999999;
	
	//abstract 선언을 안해도 interface라는 키워드 안에 선언을 하면 추상 매서드가 된다.
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int div(int num1, int num2);
	
	default void description() { //default가 없으면 오류남. // 구현 코드를 가질 수 없기 때문
		//디폴트 구현코드
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) { //static은 인스턴스의 생성과는 상관없이 사용 가능
		int total = 0 ;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	
}
