package _final;

// final : 마지막의

// 1. 변수에 적용	: 변하지 않는 상수 공간으로 지정
// 2. 메서드에 적용	: 자식클래스에서 오버라이딩이 불가능
// 3. 클래스에 적용	: 해당 클래스는 더 이상 상속을 할 수 없는 클래스가 된다.

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int FN = 10;
		
		System.out.println("n = " + n);
		System.out.println("fn = " + FN + "\n");
		
		n = 20;
		// FN = 20;		// final로 지정된 변수는 상수가 되어 더 이상 변경 불가능
		
		System.out.println("n = " + n);
		System.out.println("fn = " + FN + "\n");
		
		// 따라서, 변수에 변화를 주는 연산자는 모두 사용 불가능
		System.out.println("n + FN = " + (n + FN)+ "\n");		// 산술 연산은 값을 가져와 연산만 할 뿐, 변화를 주지 않는다.
		
		// FN +=2;
		// FN++;
		
		final int f;	// 초기화를 하지 않으면
		
		f = 100;		// 최초 한번은 값의 대입이 가능
		
		// f = 100;		// 값이 채워진 이후부터는 안됨
		System.out.println("f = " + f + "\n");
		
		
		// 대표적인 상수값 = PI
		System.out.println("PI = " + Math.PI);
	}
}

























