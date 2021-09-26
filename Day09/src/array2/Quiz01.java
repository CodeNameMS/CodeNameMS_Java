package array2;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 8 x 8 이차원 배열에 1 ~ 64까지 채우고 for-each문으로 출력해보세요
		
		int[][] arr1 = new int[8][8];
		int count = 1;
		
		// 1) 채운다
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length;j++) {
				arr1[i][j] = count++;		// 후치 : 다른 연산 후 증감
			}
		}
		
		// 2) 그대로 출력한다.
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.printf("%2d ", arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2. 8 x 8 이차원 배열에 1 ~ 64 까지 채우고 for-each문으로 출력해 보세요\
		
		// 1) index의 자리를 변경한다.
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.printf("%2d ", arr1[j][i]);
			}
			System.out.println();
		}
	}
}























