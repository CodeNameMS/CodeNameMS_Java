package array2;

public class Ex01 {
	public static void main(String[] args) {
		// 1���� �迭 : �����͸� �Ϸķ� �����ϴ� ���
		int[] arr1 = new int[] { 10, 20, 30, 40, 50};
		
		// 2���� �迭 : 1���� �迭�� ��ҷ� �����ϴ� ���
		int[][] arr2 = new int[][] {
			{10, 20, 30, 40},		// 0��(= ��)
			{11, 21, 31, 41},		// 1��
			{12, 22, 32, 42}		// 2��
		//	  0   1   2   3��(= ������)
		};
			
		System.out.println("arr[0][2] = " + arr2[0][2]);
		System.out.println("arr2[2][2] = " + arr2[2][2]);		// [��][��]
		
		System.out.println("12 = " + arr2[2][0]);
		System.out.println("40 = " + arr2[0][3] + "\n");
		
		// 1���� �迭�� ��ü ��� => ���� �ݺ���
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("arr2�� ���� : " + arr2.length);
		System.out.println("arr[0]�� ���� : " + arr2[0].length + "\n");
		
		// 2���� �迭�� ��ü ��� => ��ø �ݺ���
		for (int i=0; i<arr2.length; i++) {		// �ٱ� for : �� �ݺ�
			for (int j=0; j<arr2[i].length; j++) {	// ���� for : �� �ݺ�
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2_3 = new int[8][8];	// �� 2���� �迭
	}
}














