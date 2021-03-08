package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5};
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			return; //finally까지 실행되고 수행됨. >> end가 출력되지않음.
		}finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
 /*
 << 스트림의 구분 >>
 1) 대상 기준
 - 입력 스트림 / 출력 스트림
  + 입력 스트림 : 대상으로 부터 자료를 읽어 들이는 스트림
  + 출력 스트림 : 대상으로 자료를 출력하는 스트림
 
 2) 자료의 종류
 - 바이트 스트림 / 문자 스트림
 
 3) 기능
 - 기반 스트림 / 보조 스트림
  + 기반 스트림 : 대상에 직접 자료를 읽고 쓰는 기능의 스트림
  + 보조 스트림 : 직접 읽고 쓰는 기능은 없이 추가적인 기능을 하는 스트림
  
  << 표준 입출력 >>
  - 
 */
