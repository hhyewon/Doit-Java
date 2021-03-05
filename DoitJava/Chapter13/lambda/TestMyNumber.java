package lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		//람다식은 최대한 생략하는게 원칙 
		MyNumber maxNum = (x,y) -> (x >=y)? x:y; //x가 y보다 큰가? 맞으면 x 아니면 y
		int max = maxNum.getMaxNumber(10, 20);
		
		System.out.println(max);
	
		
		int i =100;
		//익명 클래스가 생성됨
		MyNumber aaa = new MyNumber() {

			@Override
			public int getMaxNumber(int num1, int num2) {
				System.out.println(i);
				return 0;
			}
			
			
		};
	}

}
