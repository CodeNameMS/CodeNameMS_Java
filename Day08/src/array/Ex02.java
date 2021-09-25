package array;

public class Ex02 {
	public static void main(String[] args) {
		// 배열을 초기화 하는 방법
		// 1. 바로 값을 지정
		// 2. 빈 배열 선언
		// 3. 각 자료형의 기본값
		// 논리 : false
		// 정수 : 0
		// 실수 : 0.0
		// 문자 : \0 (= NULL)
		// 참조 : null
		
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		
		int[] arr2 = new int[3];	// 공간만 있고 값이 채워지지 않음
									// 참고로 값을 초기화하지 않았는데
									// 배열은 각 자료형의 기본값으로 자동으로 초기화됨
		
		// int[] arr3 = new int[3] { 10, 20, 30 };
		// 자바는 크기와 초기화를 같이하면 에러
		
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






























