package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {//���ٽ��� ����ó�� ���

	public static void main(String[] args) {

		//(1) ������ �����ؼ� �ٷ� implements �ϴ� ���
		PrintString lambdaPrint = str ->System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		//(2)
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
		//(3) implements�� ������ü�� �ް������� �Ѿ�� ���
		public static void showMyString(PrintString lambda) {
			lambda.showString("test2");
		}
	
		//(2) implements�� �� ��ü�� ��ȯ ������ �ѱ�� 
		public static PrintString returnPrint() {
			return s->System.out.println(s + "world");
		}
}
