package array2;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 8 x 8 ������ �迭�� 1 ~ 64���� ä��� for-each������ ����غ�����
		
		int[][] arr1 = new int[8][8];
		int count = 1;
		
		// 1) ä���
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length;j++) {
				arr1[i][j] = count++;		// ��ġ : �ٸ� ���� �� ����
			}
		}
		
		// 2) �״�� ����Ѵ�.
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.printf("%2d ", arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2. 8 x 8 ������ �迭�� 1 ~ 64 ���� ä��� for-each������ ����� ������\
		
		// 1) index�� �ڸ��� �����Ѵ�.
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.printf("%2d ", arr1[j][i]);
			}
			System.out.println();
		}
	}
}























