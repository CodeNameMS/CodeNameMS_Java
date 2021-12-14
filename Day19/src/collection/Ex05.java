package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// Set	: ����x, �ߺ�x
		// List : ����o, �ߺ�x
		
		// HashSet, TreeSet�� ��ǥ���� Ŭ����
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// 10�� �̹� �ִ� ������ -> �߰����� ����
						// ����, Set���� ���� �ߺ��� �о�µ� ���� ���� ���ȴ�.
		
		
		System.out.println("hs = " + hs);
		
		System.out.println("hs ũ�� : " + hs.size() + "\n");
		
		// ������ ���ٴ� ���� index�� ���ٴ� �ǹ�
		// ��, indexing�� �ȵ�
		
		// System.out.println("hs[0] = " + hs.get(0));
		
		// ����, �Ϲ� for�� ��� �Ұ���
		
		for (int n : hs) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		
		hs.remove(10);		// remove(��)
		System.out.println("hs = " + hs);
		
		hs.clear();
		System.out.println("hs = " + hs);
	}
}

























