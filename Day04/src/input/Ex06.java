package input;

import java.util.Scanner;

// nextLine()�� ���۸� ���� �뵵�� ���Ǳ⵵ ������
// �� �� ��ü�� ���� ���� ������, �� �� �Է¹޴� �뵵�� ��뵵 �ȴ�.

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.print("������ �Է� : ");
		// word = sc.next();
		word = sc.nextLine();
		
		System.out.println("word = " + word);
		sc.close();
		
	}
}













