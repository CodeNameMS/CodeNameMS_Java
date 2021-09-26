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
		// 1. 1���� ���޹��� ������ �Ϸķ� ����ϴ� �Լ� �ۼ�
		// (��ȯ���� ����, �Ű������� �˾Ƽ�)
		int n = 10;
		print(n);
		System.out.println("\n");
		
		// 2. 1���� ���޹��� �������� �հ踦 ��ȯ�ϴ� �Լ� �ۼ�
		// (��ȯ���� ����, �Ű������� ���� �ϳ�)
		int m = 11, sum = 0;
		sum = sum(m);
		System.out.println("sum = " + sum);
		
		System.out.println();

		// 3. ���޹��� ���� ���밪���� ��ȯ�ϴ� �Լ� �ۼ�
		// (��ȯ���� ����, �Ű������� ���� �ϳ�)
		int su = -5, result;
		result = absolute(su);
		System.out.println("���밪 : " + result);
		System.out.println();
		
		// 4. ���޹��� ���� �Ųٷ� ���� ��ȯ�ϴ� �Լ� �ۼ�
		int su1 = 4321;
		
		int rev = reverse(su1);
		
		System.out.println("��� : " + rev);
		System.out.println();
		
		// 5. ���޹��� ������ �迭�� �Ϸķ� ��� ����ϴ� �Լ� �ۼ�
		
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = new int[] { 11, 5, 4, 3, 22, 50};
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		
	}
}




















