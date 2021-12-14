package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("Python");
		list.add("C++");
		
		System.out.println("list = " + list + "\n");
		
		// ����Ʈ�� �ݺ�
		// 1. �Ϲ� for�� : index�� ������ �ݺ�
		for (int i=0; i<list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
		}
		System.out.println();
		
		// 2. for-each : �迭�̳�, �÷����� ��Ҹ� �ϳ��� �����ϸ� �ݺ�
		for (String str : list) {
			System.out.println("str = " + str);
		}
		System.out.println();
		
		// 3. iterator : �ݺ���, ��Ҹ� ��ȯ�ϴ� ��ü
		Iterator<String> it = list.iterator();
		
		// hasNext() : ���� ��ġ���� ���� ��Ұ� �ִ��� �Ǻ�, �� Ŀ���� �̵����� �ʴ´�
		System.out.println("it.hasnext() = " + it.hasNext());
		
		// next() : Ŀ���� �� ĭ �ڷ� �̵� ��, �̵� ���� ��Ҹ� ����
		System.out.println("it.next() = " + it.next());
		System.out.println("it.next() = " + it.next());
		System.out.println("it.next() = " + it.next());
		
		System.out.println("it.hasNext() = " + it.hasNext() + "\n");
		
		
		// �̹� ������ Ŀ���� �ٽ� ���ƿ��� �ʴ´�.
		// �ٽ� ��ȯ�Ϸ���, �÷����� iterator�� �ٽ� �޴´�.
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}


























