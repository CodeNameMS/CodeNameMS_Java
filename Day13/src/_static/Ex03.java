package _static;

public class Ex03 {
	public static void main(String[] args) {
		// ����(static) �ż���� ��ü���� �ٷ� ��� �����ϴٴ� ������ �ִ�.
		// ����, ���� ��ü�� �ʿ����� ������ ��� �޼��带 static���� ������ ���� �ִ�.
		
		// ex) Math Ŭ������ ��ü���� �ٷ� ����Ѵ�.
		
		int n = - 10;
		
		n = Math.abs(n);
		System.out.println("n = " + n);
		
		double pi = 3.141592;
		
		pi = Math.round(pi * 100) / 100.0;
		System.out.println("pi*r = " + pi);
		
		for(int i=0; i<10; i++) {
			n = (int)(Math.random() * 11) + 10 ;	// 10 ~ 20���� ������ ��
			
			System.out.print(n + " ");
		}
		
		// ���, Math�� �����ڰ� ��� ��ü�� �ƿ� ������ ���Ѵ�.
		// Math math = new Math();
	}
}



























