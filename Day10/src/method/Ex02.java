package method;

// method overloading : 메서드 오버로딩
// - 메서드를 같은 이름으로 여러개 작성하는 방식
// - 이름은 하나이지만, 기능이 여러개가 된다. 즉, 한 메서드가 일을 많이하게 됨(=과적, 과부화)

// 오버로딩 규칙)
// 1. 메서드의 이름이 정확히 일치해야 한다.
// 2. 매개변수의 형태가 달라야한다. ex) 갯수가 다르던지, 자료형이 달라야한다.
// 3. 주의. 반환형은 오버로딩에 성립하지 않는다.(영향을 주지 못한다)

public class Ex02 {
	public static int adder() {
		return 10 + 20;
	}
	public static int adder(int n) {
		return 10 + n;
	}
	
	public static double adder(double n) {		// 반환형은 오버로딩에 성립 x
		return 10.5 + n;						// 자료형이 달라도 성립
	}
	
	public static int adder(int n1, int n2) {	// 매개변수는 갯수가 다르면 성립
		return n1 + n2;							
	}
	
	public static void main(String[] args) {
		
		System.out.println("adder() = " + adder());
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(3.1) = " + adder(3.1));
		
		System.out.println("adder(3, 6) = " + adder(3, 6));
	}
}































