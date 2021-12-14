package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
		} catch(InputMismatchException e) {
			System.err.println("������ �ƴ� ���� �Է� !!");
			return;
		} finally {
			// ���� �߻� ���ο� ������� ������ ����Ǵ� ���� !!!
			// �ַ�, �Ҵ���� �ڿ��� �ݳ��� �ؾ��ϴ� ��� ���� ���Ե�
			System.out.println("���� ���� - 1");
			sc.close();
		}
		
		System.out.println("���� ���� - 2");
		
	}
}































