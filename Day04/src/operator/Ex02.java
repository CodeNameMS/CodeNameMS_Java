package operator;

public class Ex02 {
	public static void main(String[] args) {
		// �� ������ : �� �̻��� ��/������ �����ϴ� ������
		// ���� : AND(&&), OR(||), NOT(!)
		
		// 1. AND : ��� ������ ���̸� ����� ��.
		// ��> �ٸ� ����, �������̶�� �Ѵ�.
		System.out.println("true  AND true  ��� : " + (true && true));
		System.out.println("true  AND false ��� : " + (true && false));
		System.out.println("false AND true  ��� : " + (false && true));
		System.out.println("false AND false ��� : " + (false && false));
		System.out.println();
		
		// 1. OR : �� �ʸ� ���̸� ����� ��
		// ��> �ٸ� ����, �տ����̶�� �Ѵ�.
		System.out.println("true  OR true  ��� : " + (true || true));
		System.out.println("true  OR false ��� : " + (true || false));
		System.out.println("false OR true  ��� : " + (false || true));
		System.out.println("false OR false ��� : " + (false || false));
		System.out.println();
		
		// 1. NOT : �� -> ��������, ���� -> ������ �ٲٴ� ����
		// ��> �ٸ� ����, ���� �����̶�� �Ѵ�.
		System.out.println("NOT true ��� : " + !true);
		System.out.println("NOT false ��� : " + !false);
		System.out.println();
		
	}
}
































