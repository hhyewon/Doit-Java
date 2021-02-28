package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); // 위 버퍼와 값이 동일(문자열은 추가됐지만 위치는 동일하다)
		
		String str2 = buffer.toString();
		System.out.println(str2);
	}

}
