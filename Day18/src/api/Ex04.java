package api;

// 제네릭(generic) : 일반화하다
// - 컴파일 시 자료형을 지정해서 실행하는 방식
// - 결론, 자료형을 가리지 않는 방식의 개발이 가능

// - 단, 일반 자료형은 사용 불가능

public class Ex04 {
	public static <T> void printArr(T[] arr) {
		for (int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] arr1 = new String[] { "Java", "C++", "Python" };
		Integer[] arr2 = new Integer[] { 10,20,30,40,50 };
		Double[] arr3 = new Double[] { 10.3, 3.14, 6.82 };
		Boolean[] arr4 = new Boolean[] { true, false, true };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		
	}
}























