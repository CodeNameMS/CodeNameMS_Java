package api;

public class Ex03 {
	public static void main(String[] args) {
		// ���� -> ���ڿ�
		int n1 = 10;
		
		// String str1 = (String)n1;
		// ��> �⺻ �ڷ����� Ŭ���� ���� ��ȯ�� �ȵ�
		
		String str1 = Integer.toString(10);
		
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		// ������, �ڵ� ����ȯ�� �̿��ϸ� �� �� �����ϰ� ��ȯ ����
		str1 = n1 + "";
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		String str2 = 10 + n1 + "";
		String str3 = "" + 10 + n1;
		
		System.out.println("str2 : " + str2 + ", str3 = " + str3);
		
	}
}

















