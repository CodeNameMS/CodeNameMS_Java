package operator;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ������ : �ǿ����ڸ� 1 ���� Ȥ�� 1 ���� ��Ű�� ������
		
		int n = 10;
		
		n++;	// ��ġ : �����ڰ� �ڿ� ��ġ
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;	// ��ġ : �����ڰ� �տ� ��ġ
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		// ��ġ�� ��ġ�� �Ϲ������� ���� ����, �ǿ����ڸ� ���� ��Ų��.
		// ��, �ٸ� ����� ������ ���Ǹ� ����� �޶�����.
		
		int n1 = 10;
		int n2, n3;
		
		n2 = ++n1;		// ��ġ : ���� ���� �� �ٸ� ���� ����
		System.out.println("n2 = " + n2 + ", n1 = " + n1);
		
		n1 = 10;
		
		n3 = n1++;		// ��ġ : �ٸ� ���� ���� �� ����
		System.out.println("n3 = " + n3 + ", n1 = " + n1);
		
		int result;
		int a = 3, b = 7, c = 5, d = 2;
		
		result = a++ + --b + c-- + ++d;
		
		System.out.println("result = " + result);	// ? 17
		System.out.println("a = " + a);				// ? 4
		System.out.println("b = " + b);				// ? 6
		System.out.println("c = " + c);				// ? 4
		System.out.println("d = " + d);				// ? 3
		
		
	}
}






































