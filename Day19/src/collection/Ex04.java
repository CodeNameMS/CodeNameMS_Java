package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex04 {
	public static void main(String[] args) {
		// List�� interface
		
		// List�� ������ Ŭ������ ��ǥ������, ArrayList, LinkedList, Vector�� �ִ�.
		
		// �ڽ��� ������ �θ� ���������� �����ϴ� ���� 'up-casting'�̶�� �ߴ�.
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<String> list2 = new LinkedList<String>();
		List<Double> list3 = new Vector<Double>();
		
		list1.add(10);
		list2.add("Java");
		list3.add(1.8);
		
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("list3 = " + list3);
	}
}



















