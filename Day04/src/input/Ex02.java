package input;

import java.lang.System;	// lang ��Ű���� �ִ� System Ŭ������ �ҷ���
import java.util.Scanner;	// util ��Ű���� �ִ� System Ŭ������ �ҷ���

public class Ex02 {
	public static void main(String[] args) {
		// �ڹٿ��� �Է��� ������ �� �ִ� Ŭ������ �ִµ� Scanner��� �Ѵ�.
		
		// ���ǻ��� : Scanner�� �Է¹��� �ƴϴ�. �����͸� �о���� ����
		
		Scanner sc;		// ������ ������ �����͸� ����Ű�� ����
						// ��, �ڽ��� ������ ���� ���� -> �� ���ٴ� ��
		
		sc = new Scanner(System.in); 	//new�� ���� ������ �����ϴ� Ű����
		
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();		// next�ڷ���();
		System.out.println("n = " + n);
		
		String str;
		
		System.out.print("���ڿ� �Է� : ");
		str = sc.next();		// ���ڿ��� next()�� �Է� �޴´�.
		System.out.println("str = " + str);
		
		sc.close();		// Scanner �� ���� �ݳ��� ������
	}
}


























