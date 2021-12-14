package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			
			System.out.println("10 / n = " + 10 / n);
			
		} catch(InputMismatchException e) {
			System.err.println("������ �ƴ� ���� �Է��߽��ϴ�");
			// e.printStackTrace();
			
		} catch(ArithmeticException e) {
			System.err.println("0���� ���������ϴ�!!!");
			
		} catch(Exception e) {
			
			// Exception Ŭ���� : ������ �ֻ��� Ŭ������, ��� ���ܰ� ó������
			// ���� �������� �ۼ��ؼ� �𸣴� ���ܸ� ó���ϱ� ���� �뵵
			System.out.println("��Ÿ ���� �߻� : " + e.getMessage());
		}
		
		
		sc.close();
	}
}













