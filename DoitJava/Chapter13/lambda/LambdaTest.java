package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {//람다식을 변수처럼 사용

	public static void main(String[] args) {

		//(1) 변수에 대입해서 바로 implements 하는 방법
		PrintString lambdaPrint = str ->System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		//(2)
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
		//(3) implements된 내용자체가 메개변수로 넘어가는 방법
		public static void showMyString(PrintString lambda) {
			lambda.showString("test2");
		}
	
		//(2) implements한 값 자체를 반환 값으로 넘기기 
		public static PrintString returnPrint() {
			return s->System.out.println(s + "world");
		}
}
