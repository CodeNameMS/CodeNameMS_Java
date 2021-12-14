package api;

// ���׸�(generic) : �Ϲ�ȭ�ϴ�
// - ������ �� �ڷ����� �����ؼ� �����ϴ� ���
// - ���, �ڷ����� ������ �ʴ� ����� ������ ����

// - ��, �Ϲ� �ڷ����� ��� �Ұ���

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























