package method;


public class Quiz01 {
	public static void print(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static int sum(int m) {
		int sum=0;
		for (int i=1; i<=m; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int absolute(int su) {
		if(su<0) {
			su = -su;
		}
		return su;
	}
	
	public static int reverse(int n) {
		int result = 0;
		
		while (n != 0) {
			result = result * 10 + n % 10;
			n /= 10;
		}
		return result;
	}
	
	public static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1. 1부터 전달받은 값까지 일렬로 출력하는 함수 작성
		// (반환형은 없고, 매개변수는 알아서)
		int n = 10;
		print(n);
		System.out.println("\n");
		
		// 2. 1부터 전달받은 값까지의 합계를 반환하는 함수 작성
		// (반환형은 정수, 매개변수는 정수 하나)
		int m = 11, sum = 0;
		sum = sum(m);
		System.out.println("sum = " + sum);
		
		System.out.println();

		// 3. 전달받은 값을 절대값으로 반환하는 함수 작성
		// (반환형은 정수, 매개변수는 정수 하나)
		int su = -5, result;
		result = absolute(su);
		System.out.println("절대값 : " + result);
		System.out.println();
		
		// 4. 전달받은 수의 거꾸로 수를 반환하는 함수 작성
		int su1 = 4321;
		
		int rev = reverse(su1);
		
		System.out.println("결과 : " + rev);
		System.out.println();
		
		// 5. 전달받은 정수형 배열을 일렬로 모두 출력하는 함수 작성
		
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = new int[] { 11, 5, 4, 3, 22, 50};
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		
	}
}




















