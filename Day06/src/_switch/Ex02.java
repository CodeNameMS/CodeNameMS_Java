package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// switch -> if������ ���� ���� ����
		// ������ �ݴ�� �Ұ���
		// �ֳ��ϸ�, switch���� ���� ���� ó���ϴ� �б⹮�̱� ������
		
		Scanner sc = new Scanner(System.in);
		int num;
	
		System.out.println("���� �Է�(1 ~ 10) : ");
		num = sc.nextInt();
	
		switch(num) {
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("¦��");
			break;
			
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("Ȧ��");
		}
		
		sc.close();
		
		// ���� ���� ���� ������� ���� ó���� �����ϱ�� �ϴ� -> ������ ��
	}
}















