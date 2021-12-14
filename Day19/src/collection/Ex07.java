package collection;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		// TreeSet : Tree��� �ڷᱸ�� ���·� �����Ѵ�
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		// TreeSet<Integer> ts = new TreeSet<Integer>();		// �⺻���� ��� (Integer�� ��������)
		TreeSet<Integer> ts = new TreeSet<Integer>(desc);		// ���� �ۼ��� ���� ���
		Random rand = new Random();
		
		for (int i=0; i<10; i++) {
			int n = rand.nextInt(20) + 1;
			
			ts.add(n);
		}
		System.out.println("ts = " + ts);	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}
}
