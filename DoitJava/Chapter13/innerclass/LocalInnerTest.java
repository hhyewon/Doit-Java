package innerclass;
/* 내부 클래스
 * 지역 내부 클래스, 익명 내부 클래스
 */

class Outer{
	
	int outNum = 100;
	static int sNum = 20;
	
	Runnable runnable = new Runnable() { //익명 내부 클래스
		// 하나의 클래스와 하나의 인터페이스만 구현할 수 있다. 
		// 가장 많이 쓰임
		@Override
		public void run() {
			System.out.println("run");
		}
		
	};
	
	
	public Runnable getRunnable(final int i) { //지역내부 클래스
		
		final int localNum = 100; //메서드가 호출될 때 생성
		
		return new Runnable(){//클래스 이름 없애기 //익명 내부 클래스
			//getRunnable을 부르면 바로 Runnable을 불러오겠다.

			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			} 
		};
		
		/*	@Override
			public void run() {
				
				//사용하는건 상관없지만 변화시킬 수 없다.
			//	localNum += 100; //지역 내부 클래스는 오류가 난다.
			//	i+=200; //메서드의 매개변수와 메서드의 로컬 변수
				//얘네는 스텍에 자리가 잡히고 메서드의 호출이 끝나면 없어진다. 
				
				//getRunable 메서드는 호출이 되면 없어질 메서드
				// run이라는 메서드는 getRunable가 호출이 된 다음 호출이 된다. 
				// 그렇기 때문에 이 변수들은 호출이 되는 시점에 스텍에서 사라질 수 있다.
				
				// >> 지역 내부 클래스는 상수화(final) 시켜야 된다.
				
				outNum += 10; //인스턴스 변수는 상관 없다.
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				
			}
			*/
			
		// return new MyRunnable(); 
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		outer.runnable.run();
	}

}
