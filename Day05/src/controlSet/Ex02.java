package controlSet;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// else if : ���� ������ �����̸� �˻��ϴ� ����
		// ��> ���� ���ǹ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("����");
		}
		else if(age >= 17) {	// '���� ������ ����'�̸� ������ �˻�	
			System.out.print("�����л�");
		}
		else if(age >= 14) {
			System.out.print("���л�");
		}						// else�� �� �� ��Ȯ�ϰ� �����ϸ�
		else {					// ��� ������ �����̸� �����ϴ� ����
			System.out.print("�ʵ��л� ����");
		}
		
		System.out.println("�Դϴ�");
		sc.close();
	}
}




































