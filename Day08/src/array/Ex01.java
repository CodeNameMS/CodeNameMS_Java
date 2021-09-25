package array;

// �迭(Array) : ���� �ڷ������� �����͸� ���������� ������ ����
// ��, ���� �ڷ���

// ���� : ���� ��
// �迭 : ���� ��

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;	// ����
		
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60};	// �迭
		//						 0   1   2   3   4
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr);		// ���� ������ �ٷ� ��½� �ؽ��ڵ��� �̻��� ������ ��µ�
		System.out.println();
		
		// �迭�� ���� ��ȣ�� �ְ�, �̸� index(= ����)�̶�� �θ���
		// index�� ���������� [] ���ȣ�� �������� ���ٰ���
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[4] = " + arr[4]+ "\n");
		
		// ������ �Ѿ�� ������ ����
		// System.out.println("arr[5] = " + arr[5]);
		
		// �ڹ��� �迭�� ��ü������ ũ�Ⱚ(= length)��� ������ ���������� ����
		System.out.println("�迭�� ũ�� : " + arr.length);
		
		
		
		// �迭�� index�� 0���� ������������ ���� -> ��, �ݺ����� Ȱ���ؼ� ��ü index ���� ����
		System.out.println("arr = ");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ��Java������ for-each��� �ϴ� ���� for���� �ִ�.
		// - �迭�� ��Ҹ� �ϳ��� :(�ݷ�) ������ ������ ���������� �����ϸ� �ݺ�
		for (int num : arr) {
			System.out.println("num = " + num);
		}
	}
}
































