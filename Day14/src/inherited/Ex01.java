package inherited;

// ��� : �̹� �ۼ��Ǿ� �ִ� Ŭ������ ������ �״�� �����޾Ƽ� ���ο� Ŭ������ �ۼ��ϴ� ��
// - ���� Ŭ������ ����� ���� �ް�, ����� 'Ȯ��' ��Ű�� ���� ���

// ����� ���ִ� Ŭ���� 	: ����, �θ�, ����, ��� Ŭ����
// ����� �޴� Ŭ����		: ����, �ڽ�, ����, �Ļ� Ŭ����

class Super{
	int a = 10;
	
	void supFunc() {
		System.out.println("�θ� Ŭ���� �޼���");
	}
}

class Sub extends Super{	// ���� Ŭ���� extends �θ� Ŭ����
	int b = 20;
	
	void subFunc() {
		System.out.println("�ڽ� Ŭ���� �޼���");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		sup.supFunc();
		
		//sup.subFunc();
		//��> �θ�� �ڽ��� ����� ������ �� ����.(= ��ȿ��)
		
		Sub sub = new Sub();
		
		System.out.println("\na = " + sub.a);
		sub.supFunc();
		// ��> �ڽ��� �θ𿡰� ���� �޾ұ� ������ �θ��� ��� ���� ����
		
		
		System.out.println("b = " + sub.b);
		sub.subFunc();
		
	}
}
























