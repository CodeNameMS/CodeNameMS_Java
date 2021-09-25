package array;

// 배열(Array) : 같은 자료형으로 데이터를 연속적으로 생성한 공간
// 즉, 묶음 자료형

// 변수 : 단일 값
// 배열 : 복수 값

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;	// 변수
		
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60};	// 배열
		//						 0   1   2   3   4
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr);		// 참조 변수는 바로 출력시 해시코드라는 이상한 값으로 출력됨
		System.out.println();
		
		// 배열은 순서 번호가 있고, 이를 index(= 색인)이라고 부른다
		// index는 참조변수와 [] 대괄호의 조합으로 접근가능
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[4] = " + arr[4]+ "\n");
		
		// 범위를 넘어서는 참조는 에러
		// System.out.println("arr[5] = " + arr[5]);
		
		// 자바의 배열은 자체적으로 크기값(= length)라는 변수를 내부적으로 가짐
		System.out.println("배열의 크기 : " + arr.length);
		
		
		
		// 배열의 index는 0부터 ㅅ순차적으로 증가 -> 즉, 반복문을 활용해서 전체 index 참조 가능
		System.out.println("arr = ");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ※Java에서는 for-each라고 하는 향상된 for문이 있다.
		// - 배열의 요소를 하나씩 :(콜론) 좌측의 변수에 순차적으로 대입하며 반복
		for (int num : arr) {
			System.out.println("num = " + num);
		}
	}
}
































