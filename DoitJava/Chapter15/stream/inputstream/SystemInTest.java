package stream.inputstream;

import java.io.IOException;

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
*/
public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를쓰고 엔터를 누르세요");
		int i=0;
		try {
			while((i = System.in.read()) !='\n') { //한글자씩 읽어들임(byte 단위로)
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
