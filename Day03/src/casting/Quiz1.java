package casting;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. �̸�, �� �� �� ������ ������ ������ �����Ѵ�.
		// ��, �� �� ���� ���������� �����Ѵ�.
		
		String name = "ȫ�浿";
		int kor, mat, eng;
		
		// 2. 1���� ������ ������ ���� ä���
		kor = 70;
		mat = 98;
		eng = 80;
		// 3. ä�� ���� �Ʒ��� ���� ��µȴ�.
		// ��, �Ҽ��� ����� �� �ʿ� ����
		
		// ���)
		// �̸� : ȫ�浿
		// �� �� �� : 70 80 98
		// �հ� : 248
		// ��� : 82.66666666667
		System.out.println("�̸� : " + name);
		System.out.println("�� �� �� : " + kor + eng + mat);
		System.out.println("�հ� : "+ (kor+eng+mat));
		System.out.println("��� : "+ (double)(kor+eng+mat)/3);
	}
}









































