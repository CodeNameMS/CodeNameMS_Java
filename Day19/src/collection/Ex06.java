package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		// List�� Set������ ��ȯ�� �����ϴ�.
		// �׳� �� ��ȯ�� �ȵǰ�, �����ڸ� �̿��ϸ� �����ϴ�
		
		Random rand = new Random(0);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			int n = rand.nextInt(15)+1;
			
			list.add(n);
		}
		
		System.out.println("list = " + list);
		
		// List -> Set
		HashSet<Integer> hs = new HashSet<Integer>(list);	// ������ ���޿� ����Ʈ�� ����
		
		System.out.println("hs = " + hs);
		
		// Set -> List
		
		list = new ArrayList<Integer>(hs);
		
		list.sort((Integer o1, Integer o2) -> {
			return o2 - o1;
		});
		
		System.out.println("list = " + list);
	}
}


































