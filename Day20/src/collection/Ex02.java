package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// map : key�� value�� �� ���� ������
		// - key�� �ߺ�x
		// - value�� �ߺ�o
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		list.add(70);
		list.add(80);
		list.add(60);
		
		System.out.println("list = " + list);
		System.out.println("list[0] = " + list.get(0)+"\n");
		// ��> list�� ���(= value)�� �����ϱ� ���ؼ� index�� Ȱ���Ѵ�.
		
		// add, remove, size, sort, clear, get
		
		map.put("Python", 70);
		map.put("Java", 80);
		map.put("C", 60);
		
		System.out.println("map = " + map);
		System.out.println("map['Pyhton'] = " + map.get("Python") + "\n");
		// ��> map�� ���(= value)�� �����ϱ� ���ؼ� key�� Ȱ���Ѵ�.
		
		// Map�� iterable�� �����ϱ� ���� �ʱ� ������ ��ȯ Ȥ�� �ݺ��� �Ұ����ϴ�.
		// - Map���� key���� �̾Ƴ��� �޼��尡 �ִ�.
		// - Set���� ��ȯ�� �Ǵµ�, Set�� �ݺ��� �����ϴ�.
		// - �̸� �̿��ؼ� �ݺ��� �� �� �ִ�.
		// - for-each / Iterator
		
		Set<String> keys = map.keySet();
		
		System.out.println("keys = " + keys + "\n");
		
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		// �׷� iterator�� �Ȱ��� ����غ���
		
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
	}
}























