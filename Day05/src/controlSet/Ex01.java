package controlSet;

import java.util.Scanner;

// ��� : �ڵ��� �帧�� �����ϴ� ����
// 1. ���ǹ� : ���ǿ� ���� �ڵ��� �帧�� �б�
// 2. �ݺ��� : ���ǿ� ���� �ڵ带 ����
// 3. ���� ��� : ���� �� ������ �����ϴ� ����

// ����
// 1. ���ǹ� : if ~ / else if ~ / else, switch ~ case
// 2. while, do ~ while, for
// 3. ���� ��� : break;, continue, return

public class Ex01 {
	public static void main(String[] args) {
		// ���ǹ� if : ���ǽ��� ���̸� ���ӹ��� ����, �����̸� �׳� ���� ��������
		// else : if���� �� ���� �Ǹ�, ���� ������ �����̸� �����ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if (age >= 20) {	// (���ǽ�) { ���ӹ��� }
			System.out.print("���� ");
		}
		else {				// else { ���ӹ��� }
			System.out.print("�̼�����");
		}
		
		System.out.println("�Դϴ�.");	// ���� ����
		sc.close();
	}
}

























