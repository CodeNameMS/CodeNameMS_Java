package casting;

// 강제 형 변환 : 개발자가 직접 자료형을 바꾸는 방식

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("10 + 2 = " + (10 + 2));
		System.out.println("10 - 2 = " + (10 - 2));
		System.out.println("10 + 2 = " + 10 * 2);
		System.out.println("10 + 2 = " + 10 / 2);
		System.out.println("10 + 2 = " + 10 % 2);
		
		// 여기서 나누기를 살펴보자
		System.out.println("15 / 4 = " + 15/4);
		System.out.println("15 / 4.0  = " + 15 / 4.0 + "\n");
		
		int n1 = 15, n2 = 4;
		System.out.println("n1 = " + n1 + ",n 2 = " + n2);
		
		System.out.println("n1 / n2 = " + n1 / n2 );
		System.out.println("n1 / n2 = " + n1 /(double)n2);
		
		System.out.println("n1 / n2 = " + (double)n1 / n2 + "\n");
		
		System.out.println("형변환 전    ) n2 = " + n2);
		System.out.println("형변환 적용 ) n2 = " + (double)n2);
		System.out.println("형변환 후    ) n2 = " + n2);
	}
}