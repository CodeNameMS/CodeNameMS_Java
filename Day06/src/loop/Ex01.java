package loop;

// �ݺ��� : ���ǿ� ���� �ڵ带 ����
// ��> while, do ~while, for

// ���� Ƚ�� �ݺ�	: Ƚ���� ������ �ݺ�. ex) 10��, 50��
// ��Ư�� Ƚ�� �ݺ�	: Ƚ���� �������� ���� �ݺ�. ex) ���Ḧ ����������

public class Ex01 {
	public static void main(String[] args) {
		// while : ���ǽ��� ���̸� ���ӹ��� ����, �����̸� Ż��
		System.out.println("while)");
		
		int i = 1;			// �ݺ��� �ʱⰪ
		
		while(i <= 5) {		// �ݺ��� ���ǽ�
			System.out.println(i + " : Hello java");
			i++;			// �ݺ��� ������
		}
		System.out.println();
		
		// for : �ʱⰪ, ���ǽ�, �������� �� ���� ��Ƶ� ����
		// ��> Ƚ�� �ľ��� �����ϱ� ������, ���� Ƚ�� �ݺ��� ���� ����
		System.out.println("for)");
		
		for (int j = 1; j<= 5; j++) {	// for (�ʱⰪ; �ʰǽ�; ������)
			System.out.println(j + " : Hello Java");
		}
		
		// for�� ����) �ʱⰪ -> ���ǽ� -> ���ӹ��� -> ������ -> ���ǽ� -> ���ӹ��� -> ������
	}
}







































