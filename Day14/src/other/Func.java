
package other;

public class Func{
	public static int compare(int n1, int n2) {
		if (n1 > n2) return n1;
		else		 return n2;
	}
	
	public static int total(int n) {
		int result = 0;
		
		for (int i = 1; i<= n; i++) {
			result += i;
		}
		return result;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i< n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int reverse(int n) {
		int result = 0;
		
		while (n != 0) {
			result = result * 10 + n %10;
			n /= 10;
		}
		return result;
	}
}


















