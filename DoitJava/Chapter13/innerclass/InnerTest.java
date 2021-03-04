package innerclass;

/* 내부 클래스
 * 인스턴스 내부 클래스, 정적 내부 클래스
 */

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass(){
		inClass = new InClass();
	}
	
	private class InClass{ //인스턴스 내부 클래스 //인스턴스 내부 클래스에서는 static과 static 매서드를 사용할 수 없다.
		int inNum = 200;
		
		//내부 클래스에서는 static을 사용할 수 없다.
		//static은 인스턴스(InClass) 생성과 상관없이 호출하여 사용할 수 있다.
		//하지만 InClass가 불려야지 이 변수를 사용할 수 있기 때문에 사용 불가.
		//static int sInNum = 100; //얘는 사용할 수 없다. 
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		//사용 불가
		//static void sTest() {} 
	}
	
	public void usingTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{ //정적 내부 클래스
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
		//	num += 10; //num은 outClass의 인스턴스 변수. 
			//InStaticClass는 outClass의 생성과 상관없이 사용가능해야하기 때문에 outClass의 인스턴스 변수를 사용할 수 없다.
		
		sNum += 10; //같은 정적 변수와 정적 클래스기 때문에 사용 가능함
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(sInNum);
		//num만 사용불가(인스턴스 내부 변수)
		}
		static void sTest() { //정적 클래스에서 정적 메서드 호출
			//정적변수만 사용할 수 있다.
			System.out.println(sNum);
		//	System.out.println(iNum); //정적 클래스에 정적 메서드(sTest)는 그냥 호출이 되어야하는데 iNum은 static이 아니므로 그냥 호출이 불가능. >> 에러
			System.out.println(sInNum);
		}
		
	}


}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		
		//변수와 InClass에 private가 없을 경우 
	//	outClass.inClass.inTest();
		
		// 아웃클래스 내부에있는 인클래스를 생성
	//	OutClass.InClass inClass = outClass.new InClass();
	//	inClass.inTest();
		
		//변수와 InClass에 private가 있을 경우 usingTest 메서드를 만든 후 안에서 inClass 호출
		outClass.usingTest();
		
		//아웃클래스의 생성과 상관없이 호출할 수 있다.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		
		OutClass.InStaticClass.sTest();
	}

}
