package operator;

public class Ex04 {
	public static void main(String[] args) {
		// ��(����) ������ : ������ ���� ��� ���踦 ���ϴ� ������
		// ���� : <, >, <=, >=, ==, !=
		
		// �� ����� boolean. ��, ��/�������� ����ȴ�.
		System.out.println("3 < 10 ��� ) " + (3 < 10));
		System.out.println("10 < 10 ���) " + (10 < 10));
		System.out.println("10 <= 10 ���) " + (10 <= 10) + "\n");
		
		System.out.println("10 == 10���) " + (10 == 10));
		System.out.println("10 == 10���) " + (10 != 10));
		
		// ���� ���. ��, ��/������ boolean �ڷ��� ������ ���� �����ϴ�~
		// �������� ���� 0�� 1�� ǥ���� �����ϳ� �ٸ� ���� �޸� Java�� ��Ȯ�� true / false�� ǥ���Ѵ�.
		// boolean�̶�� �ڷ������� ���� ������ �� �ִ�.
		boolean bo = 3 < 10;
		System.out.println("bo = " + bo);
	}
}

































