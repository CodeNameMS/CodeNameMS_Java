package input;

import java.io.IOException;

// ǥ�� ����� : consoleâ�� �Է°� ����� �߻�

// ǥ�� ��� ��Ʈ�� : System.out
// ǥ�� �Է� ��Ʈ�� : System.in

// ��Ʈ��(Stream) : �����Ͱ� ������ �� �ִ� ����� ����


public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		int n = System.in.read();
		
		System.out.println("n = " + (char)n);
		
		// read()��� �Լ��� ������
		// 1. ���ܶ�� ���� ó������ ������ ���� -> ���� ���������� �̸���.
		// 2. �Է¹��� ���� UNICOD ������ �����´�. ��, ����ȯ�� �ʿ��ϴ�.
		// 3. ���ڿ��� �Ԥ��¹ޱ� ���ؼ� ��Ÿ �ٸ� Ŭ������ ������ �ʿ��ϴ� -> ���� �������� �̸���.
		
	}
}
























