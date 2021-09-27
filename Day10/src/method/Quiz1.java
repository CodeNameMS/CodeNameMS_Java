package method;

public class Quiz1 {
	public static double circle(int r) {
		return 3.141592*r*r;
	}
	public static double circle(double r) {
		return 3.141592*r*r;
	}
	public static int circle() {
		return 0;
	}
	public static void printArr(String[] arr) {
		for (int i=0; i<arr.length;i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.println();
	}
	public static void printArr(int[] arr) {
		for (int i=0; i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
	}
	public static void printArr(double[] arr) {
		System.out.printf("%.1f %.1f %.1f",arr[0],arr[1],arr[2]);
	}
	
	public static void main(String[] args) {
		// 아래 메서드 호출을 보고 메서드가 실행되도록 작성해 보세요
		
		System.out.println("반지름 3 : " + circle(3));
		System.out.println("반지름 6.8 : "+ circle(6.8));
		System.out.println("반지름 전달 x : " + circle());		// 0이 되게 출력한다
		System.out.println();
		
		String[] arr1 = new String[] { "Java", "Python", "C++", "C" };
		int[] arr2 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		double[] arr3 = new double[] { 10.3, 3.14, 5.8 };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}


















