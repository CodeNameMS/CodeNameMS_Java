package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// ���ù� : ���� ���� �ڵ带 �б�
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("�޴� �Է�(1 ~ 3) ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1�� �޴� ����");
			break;
		case 2:
			System.out.println("2�� �޴� ����");
			break;
		case 3:
			System.out.println("3�� �޴� ����");
			break;
		default:
			System.out.println("���� �޴��Դϴ�~~");
		}
		sc.close();
	}
}




























