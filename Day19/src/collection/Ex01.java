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
		
		// 리스트의 반복
		// 1. 일반 for문 : index를 가지고 반복
		for (int i=0; i<list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
		}
		System.out.println();
		
		// 2. for-each : 배열이나, 컬렉션의 요소를 하나씩 대입하며 반복
		for (String str : list) {
			System.out.println("str = " + str);
		}
		System.out.println();
		
		// 3. iterator : 반복자, 요소를 순환하는 객체
		Iterator<String> it = list.iterator();
		
		// hasNext() : 현재 위치에서 다음 요소가 있는지 판별, ★ 커서는 이동하지 않는다
		System.out.println("it.hasnext() = " + it.hasNext());
		
		// next() : 커서를 한 칸 뒤로 이동 후, 이동 후의 요소를 리턴
		System.out.println("it.next() = " + it.next());
		System.out.println("it.next() = " + it.next());
		System.out.println("it.next() = " + it.next());
		
		System.out.println("it.hasNext() = " + it.hasNext() + "\n");
		
		
		// 이미 움직인 커서는 다시 돌아오지 않는다.
		// 다시 순환하려면, 컬렉션의 iterator를 다시 받는다.
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}


























