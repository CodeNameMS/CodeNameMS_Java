package operator;

// ���� ������ : ���� �Ҵ��ϴ� ������
// ���� : =

public class Ex02 {
	public static void main(String[] args) {
		// 1. ���� �������� �º��� '����', �캯�� '�����'�� �ǹ��Ѵ�.
		// 2. ���� �����ڴ� �׻� �캯���� ó���Ѵ�.
		// 3. ���� �������� �纯�� �ڷ����� ��ġ��Ų��.��
		
		int n = 10;
		System.out.println("n = " + n);
		
		n = 10 + 30;
		System.out.println("n = " + n);
		
		n = n + 10;
		System.out.println("n = " + n + "\n");
		
		int n1, n2, n3;
		
		n1 = n2 = n3 = 30; // ���� �캯���� ó���Ѵ�.
		System.out.println("n1 = " + n1 + ", n2 = "+ n2 + ", n3 = " + n3 + "\n");
	
		// ���� ���� ������ : ��� + ���� ������
		// ���� : +=, -=, *=, /=, %=
		int num = 10;
		
		System.out.println("num + 10 = " + (num + 10));
		System.out.println("num = " + num + "\n");		// ��� �����ڴ� ������ ��ȭ�� ���� �ʴ´�.
		
		num += 10;		// num = num + 10
		System.out.println("num = " + num);
		
		num -= 2;
		System.out.println("num = " + num);
		
		num *= 3;
		System.out.println("num = " + num);
		
		num /= 6;
		System.out.println("num = " + num);
		
		num %= 4;
		System.out.println("num = " + num + "\n");
		
		int a = 10, b = 3, c = 7;
		a +=b *= c -= 2;
		
		System.out.println("a = " + a); // 25
		System.out.println("b = " + b); // 15
		System.out.println("c = " + c); // 5
	}
}





















