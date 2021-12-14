package collection;

import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
		// ArrayList vs LinkedList
		// 1. ������� ����
		// 2. �������� ���� ������ �ٸ���
		
		// Ư¡)
		// ArrayList = ���� �ӵ��� ������. ��, �������� ����, ���� �� ������尡 �߻��� �� �ִ�.
		// - ��, ��ȭ�� �������� ���� ����
		
		// LinkedList : ArrayList���� ������. ��, �������� ����, ���� �� ���� ������ ����.
		// - ��, ��ȭ�� ����
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i=10; i<=100; i+= 10) {
			list.add(i);
		}
		
		System.out.println("list = " + list);
		
		list.clear();
		System.out.println("list = " + list);
		
	}
}

















