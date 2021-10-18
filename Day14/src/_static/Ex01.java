package _static;

public class Ex01 {
	public static void main(String[] args) {
		// static 멤버는 객체없이 바로 클래스명 가지고 실행가능
		
		// Math math = new math();
		// Math클래스는 생성자가 없다. -> 그냥 전부 static 멤버로만 이루어짐
		
		System.out.println("PI = " + Math.PI);
		
		System.out.println("E = " + Math.E);
		
		int n = -10;
		
		n = Math.abs(n);
		System.out.println("n = " + n);
		
		double pi = Math.PI;
		
		pi = Math.round(pi * 100) / 100.0;
		System.out.println("pi = " + pi);
	}
}

















