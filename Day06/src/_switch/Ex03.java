package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// �ڹٴ� switch�� ������ "���ڿ�"�� �� �� �ִ�.
		
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("�޴�)");
		System.out.println("1. ¥���");
		System.out.println("2. «��");
		System.out.println("3. ������");
		System.out.println("4. ������");
		System.out.print(">>>");
		
		menu = sc.next();
		
		switch(menu) {
		case "1" :
		case "¥���" :
			System.out.println("¥��� �ֹ�~");
			break;
		case "2" :
		case "«�� " :
			System.out.println("«�� �ֹ�");
			break;
		case "3" :
		case "������" :
			System.out.println("������ �ֹ�~");
			break;
		case "4" :
		case "������" :
			System.out.println("������ �ֹ�~");
			break;
		default :
			System.out.println("���� �޴� �Դϴ�.");
		}
		sc.close();
	}
}



















