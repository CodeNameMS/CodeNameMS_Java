package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// Set	: 순서x, 중복x
		// List : 순서o, 중복x
		
		// HashSet, TreeSet이 대표적인 클래스
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// 10은 이미 있는 데이터 -> 추가되지 않음
						// 따라서, Set같은 경우는 중복을 털어내는데 가장 많이 사용된다.
		
		
		System.out.println("hs = " + hs);
		
		System.out.println("hs 크기 : " + hs.size() + "\n");
		
		// 순서가 없다는 말은 index가 없다는 의미
		// 즉, indexing이 안됨
		
		// System.out.println("hs[0] = " + hs.get(0));
		
		// 따라서, 일반 for문 사용 불가능
		
		for (int n : hs) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		
		hs.remove(10);		// remove(값)
		System.out.println("hs = " + hs);
		
		hs.clear();
		System.out.println("hs = " + hs);
	}
}

























