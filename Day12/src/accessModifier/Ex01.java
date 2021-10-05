package accessModifier;

// ���� ���� ������ : Ŭ������ ����� ���� ������ ������ �����ϴ� ��
// 1. private 	: ������ Ŭ���� ���ο��� ���� ����
// 2. default	: Ŭ���� ���� + ���� ��Ű������ ���ٰ���
// 3. protected	: Ŭ���� ���� + ��Ű�� + ��� ���� �ڽ� Ŭ�������� ���ٰ���
// 4. public	: ���� + ��Ű�� + ��� + �ܺ�. ��, ��𼭵� ���� ����

class Access{
	private String pri = "Java";	// private �Ӽ�
	String def = "C++";				// default �Ӽ�(= �ƹ��͵� �������� ���� ����)
	public String pub = "Python";
}

public class Ex01 {
	public static void main(String[] args) {
		Access acc = new Access();
		
		// System.out.println("private ��� : " + acc.pri);
		// private ����� Ŭ���� �ܺο��� ���� �Ұ���
		
		System.out.println("default ��� : " + acc.def);	// default�� ���� ��Ű�� �������� ��𼭵� ���� ����
		System.out.println("public ��� : " + acc.pub);	// public�� ��𼭵� ���� ����
		
		// default�� public�� �����غ����� Ŭ������ �ٸ� ��Ű������ �ۼ��غ���.
		
	}
}






















