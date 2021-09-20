package loop2;

public class Ex02 {
	public static void main(String[] args) {
		
		// 중첩 반복을 활용해서 구구단 2단 ~ 9단 출력
		// 단, 각 단은 x1 ~ x9까지만 출력
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
}

















