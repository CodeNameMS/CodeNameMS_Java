package collection;

import java.util.ArrayList;

// collection : ����
// framework : ����ȭ�� ����. ������ ���ؼ� ������ ������ �ϳ��� ������ �ۼ��س��� ����

// collection framework : �÷��� �����ӿ�ũ
// - �ڹٿ��� �ʿ��� �ڷᱸ���� �˰����� �̸� �ۼ��صΰ� �������ִ� ��

// ��� ����
// 1. �迭�� �Ѱ��� - ����� ����, ũ�⸦ �̸� �����صΰ� ��� �Ѵ�
// 2. �پ��� ������ �ڷᱸ���� �ʿ�
// 3. ���߽ð��� ����

// ����
// 1. List : ���� o(= index), �ߺ� o
// ��> ArrayList, LinkedList, Vector
// 2. Set : ���� x, �ߺ� x
// ��> HashSet, TreeSet
// 3. Map : key�� value�� �� ���� �����ϴ� �ڷᱸ��
//			key�� �ߺ� x, value�� �ߺ� o
// ��> HashMap, TreeMap, HashTable 


public class Ex01 {
	public static void main(String[] args) {
		// ���� List, Set, Map�� interface�� �ۼ��Ǿ� �ִ�.
		// ����, ������ ������ Ŭ������ ��� ��밡��
		
		// List�� ������ Ŭ���� : ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[5];
		
		System.out.println("list = " + list);	// collection : toString()�� �������̵� �Ǿ��־�
		System.out.println("arr = " + arr);		// �ٷ� ����� ����
		
		list.add(10);	// add() : �����͸� ����Ʈ �� �ڿ� �߰�
		list.add(20);
		list.add(30);
		
		System.out.println("\nlist = " + list);
		
		list.add(1, 15);	// add(index, value) : �ش� index�� �߰�. ���� �����ʹ� �� ĭ�� �ڷ�
		System.out.println("\nlist = " + list);
		
		list.remove(2);		// remove(index) : �ش� index����. ���� �����ʹ� �� ĭ�� ������ ���
		System.out.println("list = " + list);
		
		// get(index) : ����Ʈ�� []�� indexing �Ұ���. �޼���� ����Ѵ�.
		// - �ش� index ��ġ�� ���� ��ȯ
		System.out.println("list[0] = " + list.get(0));
		
		// size() : ����Ʈ�� ũ��(= ����)�� ��ȯ
		System.out.println("list�� ũ�� : " + list.size());
		
		// clear()
		list.clear();
		System.out.println("list = " + list);
	}
}























