package input;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. �̸�, ����, Ű, �ּ�, ������ ������ ���� ����
		String name;
		int age;
		float height;
		String adress;
		char gender;
		
		// 2. 1���� ������ ������ ���� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("Ű �Է� : ");
		height = sc.nextFloat();
		System.out.print("�ּ� �Է� : ");
		adress = sc.nextLine();
		System.out.print("���� �Է� : ");
		gender = sc.next().charAt(0);
		
		// 3. �Է¹��� ���� �Ʒ��� ���� ��µȴ�.
		
		// ��� )
		// �̸� : ȫ�浿 (17��, 176.1cm)
		// �ּ� : �λ� ������ �ؿ�뱸 ���ҷ�
		// ���� : ��
		System.out.println("�̸� : "+ name + "("+age+"��, " + height + "cm)");
		System.out.println("�ּ� : " + adress);
		System.out.println("���� : " + gender);
		
		sc.close();
	}

}

















