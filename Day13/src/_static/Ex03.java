package _static;

public class Ex03 {
	public static void main(String[] args) {
		// 정적(static) 매서드는 객체없이 바로 사용 가능하다는 장점이 있다.
		// 따라서, 따로 객체가 필요하지 않으면 모든 메서드를 static으로 구성할 수도 있다.
		
		// ex) Math 클래스는 객체없이 바로 사용한다.
		
		int n = - 10;
		
		n = Math.abs(n);
		System.out.println("n = " + n);
		
		double pi = 3.141592;
		
		pi = Math.round(pi * 100) / 100.0;
		System.out.println("pi*r = " + pi);
		
		for(int i=0; i<10; i++) {
			n = (int)(Math.random() * 11) + 10 ;	// 10 ~ 20까지 무작위 수
			
			System.out.print(n + " ");
		}
		
		// 사실, Math는 생성자가 없어서 객체를 아예 만들지 못한다.
		// Math math = new Math();
	}
}



























