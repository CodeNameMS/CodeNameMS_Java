package method;

// method : 특정 길이의 코드(=기능)를 이름으로 묶어두고 사용하는 방식

public class Ex01 {
	public static void hello(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i + ": Hello World!!!");
		}
		System.out.println();
	}
	
	public static double circle(double r) {
		return 3.141592 * r * r;
	}
	
	public static void main(String[] args) {
		// 반환형이 없는 메서드(=함수)는 그냥 이름만 호출하면 됨
		hello(5, 10);
		
		hello(2, 4);
		
		// 반환형이 있는 메서드는 값이 돌려져 오기때문에, 저장 혹은 바로 사용한다.
		double result = circle(3);	// 결과를 변수에 저장
		System.out.println("result = " + result);
		
		// 결과를 바로 출력(=사용)
		System.out.println("반지름 5의 원넓이 : " + circle(5));
	}
}





























