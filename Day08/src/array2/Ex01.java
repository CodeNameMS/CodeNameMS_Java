package array2;

public class Ex01 {
	public static void main(String[] args) {
		// 1차원 배열 : 데이터를 일렬로 저장하는 방식
		int[] arr1 = new int[] { 10, 20, 30, 40, 50};
		
		// 2차원 배열 : 1차원 배열을 요소로 저장하는 방식
		int[][] arr2 = new int[][] {
			{10, 20, 30, 40},		// 0행(= 줄)
			{11, 21, 31, 41},		// 1행
			{12, 22, 32, 42}		// 2행
		//	  0   1   2   3열(= 데이터)
		};
			
		System.out.println("arr[0][2] = " + arr2[0][2]);
		System.out.println("arr2[2][2] = " + arr2[2][2]);		// [행][열]
		
		System.out.println("12 = " + arr2[2][0]);
		System.out.println("40 = " + arr2[0][3] + "\n");
		
		// 1차원 배열의 전체 출력 => 단일 반복문
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("arr2의 길이 : " + arr2.length);
		System.out.println("arr[0]의 길이 : " + arr2[0].length + "\n");
		
		// 2차원 배열의 전체 출력 => 중첩 반복문
		for (int i=0; i<arr2.length; i++) {		// 바깥 for : 행 반복
			for (int j=0; j<arr2[i].length; j++) {	// 안쪽 for : 열 반복
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2_3 = new int[8][8];	// 빈 2차원 배열
	}
}














