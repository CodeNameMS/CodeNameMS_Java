package api;

public class Ex02 {
	public static void main(String[] args) {
		// ���ڿ� -> ����
		String str1 = "10";
		
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		// int n1 = (int)str1;
		// ��> Ŭ������ �Ϲ��ڷ��� ������ ����ȯ�� �Ұ���
		
		int n1 = Integer.parseInt(str1);
		
		System.out.println("n1 + 20 = " +  (n1 + 20));
		
		// ����. �Ʒ� ���ڿ��� �Ǽ�, ������ ��ȯ �� �����̸� ���Ѵ�
		String str2 = "3.14";
		String r = "3";
		
		double pi = Double.parseDouble(str2);
		int n3 = Integer.parseInt(r);
		
		System.out.println("�� ���� : " + (pi*n3*n3));
				
	}
}



















