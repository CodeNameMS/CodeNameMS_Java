package array;

public class Ex03 {
	public static void main(String[] args) {
		// �ٸ� ���� �ڷ������� �迭�� �����غ���
		
		char[] chs = new char[3];
		int[] its = new int[3];
		double[] dbs = new double[3];
		boolean[] bos = new boolean[3];
		
		String[] strs = new String[3];	// ��� ���� �ڷ���
		
		for (int i = 0; i< chs.length; i++) {
			System.out.print(chs[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i< its.length; i++) {
			System.out.print(its[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i< dbs.length; i++) {
			System.out.print(dbs[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i< bos.length; i++) {
			System.out.print(bos[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i< strs.length; i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println();
	}
}





























