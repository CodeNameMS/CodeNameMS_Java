package variable;

public class Ex06 {
	public static void main(String[] args) {
		
		byte by = 127;
		//Type mismatch: cannot convert from int to byte
		System.out.println("by = " + by);
	
		short sh = 32767;
		System.out.println("sh = " + sh);
		
		int it = 2100000000;
		System.out.println("it = "+ it);
		
		// long lo = 3000000000;
		// The literal 3000000000 of type int is out of range 
	
		// ���ͷ�  : ������ ������� �ʰ� �Ͻ������� �ٷ� ���Ǵ� �����͸� �ǹ�
		// ��, 10�̳� 3.14 ���� �ٷ� ���̴� �����͸� �ǹ�
		
		// �̷��� ���ͷ��� �޸� ������ ���Ǯ�̶�� ������ �Ͻ������� �����µ�
		// �̶�, �⺻ �߷������� ������ ������.
		
		// ��, 10 -> ���� -> ������ �⺻ -> int(= 4byte)
		
		long lo = 3000000000L;  // L : ���ͷ� ������ long���� �����~
								// ��ҹ��ڸ� ������ �ʱ� ������ �ҹ��ڷ� l�� �ۼ��ص� ��
		System.out.println("lo = " + lo);
	
		float fl = 3.14F; // F = ���ͷ� ������ float���� �����~
		System.out.println("fl = " + fl);
		
		double db = 3.14;
		System.out.println("db = " + db);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
