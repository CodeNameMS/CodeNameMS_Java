package variable;

// ctrl + space : ��Ŭ������ �ڵ��ϼ�
// ��) main + ctrl + space : ���� �Լ� �ڵ��ϼ�
// ��) syso + ctrl + space : println() ��ɾ� �ڵ��ϼ�

public class Ex01 {
	public static void main(String[] args) {
		// Data Type : �ڷ���, �ڵ� ������ ��Ÿ�� ���� �ִ� �������� ������ �ǹ�
		
		// ���� 	: ���� �� �ϳ��� �ǹ�.
		// ���ڿ� : �ܾ, ������ ǥ���ϱ� ���� ������
		// ���� 	: ����, ���� ���� ������ ���� ������
		// �Ǽ� 	: ���� �߿����� �Ҽ���(.)�� �� ������
		// �� 	: ��/������ �Ǻ��ϱ� ���� ������
		
		System.out.println('a'); 		// ' ' : ���ڸ� �ǹ�
		System.out.println("apple\n");	// " " : ���ڿ��� �ǹ�
		
		System.out.println("10");		// " " -> ���ڿ� -> ǥ�⸸�� ���� ������
		System.out.println(10);			// ����ǥ ���� -> ���� -> ����(=���)�� ���� ������
		System.out.println(10.0);		// .�� �ִ� ���� -> �Ǽ� -> �Ҽ����� ������
		
		System.out.println("10" + "12");; 	// ���ڿ� ���ϱ� -> �̾���̱�
		System.out.println(10 + 12);		// ���� ���ϱ� -> ����
		System.out.println(10 + 3.14);		// �Ǽ� ���ϱ� -> ����
		
		System.out.println(true);			// ��(true)
		System.out.println(false);			// ����(false)
		
		System.out.println("true");			// "" -> ���ڿ� -> �׳� ������
	}
}

















































