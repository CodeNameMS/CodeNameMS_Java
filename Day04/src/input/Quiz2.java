package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// ������ ���� �Է¹޾Ƽ� �Ʒ�ó�� ���
		String name, adress;
		int age;
		
		// �̸� : ȫ�浿
		// ���� : 25
		// �ּ� : �λ� ������ �ؿ�뱸 ���ҷ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� �Է� : ");
		adress = sc.nextLine();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + adress);
		
		
	}
}



















