package print;

// 1. ��Ű�� ���� �ҹ��ڷ� ����
// 2. Ŭ������(=.java)�� �빮�ڷ� ����
// 3. public class �̸��� .java �����ϰ� �����
// 4. �ʼ� !!!
//	   ��Ŭ���� ȭ�� ���̾ƿ� �ʱ�ȭ
//	  window -> perspective -> reset perspective

// �� ���콺 �巡�� �� ctrl + shift + f : �巡���� ��ŭ �ּ�/����
public class Ex01 {
	public static void main(String[] args) {
		// println("���ڿ�") : ���ڿ��� ���, �ڵ����� ���� �ٹٲ� ����
		// ���ڿ� : " "(�ֵ���ǥ)�� ���� �����͸� �ǹ�. �����̳� �ܾ ǥ���ϱ� ���� ������
		System.out.println("Hello World!!!");
		System.out.println("�ȳ� �����!!!");
		System.out.println();				// �� println()���� �� �� �������� Ȱ��ȴ�.
		
		
		// print("���ڿ�") : ���ڿ��� ���. ��, �ٹٲ��� ����
		System.out.print("Hello World!!!");		// ����, \n�� ���� �̽����������ڸ� Ȱ�� ����
		System.out.print("�ȳ� �����!!!");
		
		
		// printf("���ڿ�") : ����(=����)�� Ȱ���� ���ڿ�. �ٹٲ� ����
		System.out.printf("Hello %s\n", "World!!!");
		System.out.printf("JDK %.1f, eclipse %d\n", 1.8, 2020);
		
		// %s : String, ���ڿ��� �� �ڸ�
		// %f : float, �Ҽ����� �� �ڸ�. �⺻ 6�ڸ����� ���. lf����.
		// %.nf : �Ҽ����� n�ڸ���ŭ ����
		// %d : decimal, ������ �� �ڸ�
		
	}
}





























