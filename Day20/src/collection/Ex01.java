package collection;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

// List	: ����o, �ߺ�o
// set	: ����x, �ߺ�x
// Map	: Key�� Value �� ���� ������

public class Ex01 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		// 1. List
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// 2. Set
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i =0; i<10; i++) {
			int n = rand.nextInt();
			
			list.add(n);
			set.add(n);
		}
		list.sort(null);
		
		System.out.println("list = " + list);
		System.out.println("set = " + set);
		
	}
}
























