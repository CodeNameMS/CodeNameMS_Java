package array;

public class Ex02 {
	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ �ϴ� ���
		// 1. �ٷ� ���� ����
		// 2. �� �迭 ����
		// 3. �� �ڷ����� �⺻��
		// �� : false
		// ���� : 0
		// �Ǽ� : 0.0
		// ���� : \0 (= NULL)
		// ���� : null
		
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		
		int[] arr2 = new int[3];	// ������ �ְ� ���� ä������ ����
									// ����� ���� �ʱ�ȭ���� �ʾҴµ�
									// �迭�� �� �ڷ����� �⺻������ �ڵ����� �ʱ�ȭ��
		
		// int[] arr3 = new int[3] { 10, 20, 30 };
		// �ڹٴ� ũ��� �ʱ�ȭ�� �����ϸ� ����
		
		System.out.println("arr1 = ");
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("arr2 = ");
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]+ " ");
		}
		System.out.println();
	}
}






























