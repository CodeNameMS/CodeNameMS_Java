package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� �Է� ���� ������ ���
		// ��, ������ �ƴ� ���� �Է�������, �ٽ� �Է¹޵��� �غ�����
		
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.print("���� �Է� : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("\n������ �Է����ּ���");
				sc.nextLine();	// ���۸� ����� ������ ���� �ݺ��ǹǷ� ����
			}
		}
		sc.close();
	}
}























