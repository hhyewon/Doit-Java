package stream.inputstream;

import java.io.IOException;

/*
<< ��Ʈ���� ���� >>
1) ��� ����
- �Է� ��Ʈ�� / ��� ��Ʈ��
 + �Է� ��Ʈ�� : ������� ���� �ڷḦ �о� ���̴� ��Ʈ��
 + ��� ��Ʈ�� : ������� �ڷḦ ����ϴ� ��Ʈ��

2) �ڷ��� ����
- ����Ʈ ��Ʈ�� / ���� ��Ʈ��

3) ���
- ��� ��Ʈ�� / ���� ��Ʈ��
 + ��� ��Ʈ�� : ��� ���� �ڷḦ �а� ���� ����� ��Ʈ��
 + ���� ��Ʈ�� : ���� �а� ���� ����� ���� �߰����� ����� �ϴ� ��Ʈ��
 
 << ǥ�� ����� >> 
*/
public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� �������� ���͸� ��������");
		int i=0;
		try {
			while((i = System.in.read()) !='\n') { //�ѱ��ھ� �о����(byte ������)
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
