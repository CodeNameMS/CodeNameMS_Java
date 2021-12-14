package collection;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

// List	: 순서o, 중복o
// set	: 순서x, 중복x
// Map	: Key와 Value 한 쌍의 데이터

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
























