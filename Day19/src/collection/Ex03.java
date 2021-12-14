package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
	public static void main(String[] args) {
		// Vector : ArrayList와 동일하고, 옛 버전.
		// - 호환성을 위해서 남겨둠
		// - 멀티쓰레드 방식을 지원
		
		Vector<Integer> vec = new Vector<Integer>();
		
		for (int i=10; i<=100; i+=10) {
			vec.add(i);
		}
		
		System.out.println("vec = " + vec + "\n");
		
		// Vector는 Iterator 대신에 Enumeration을 사용한다.
		// 이것도, 옛 버전.
		
		Enumeration<Integer> em = vec.elements();	// it = list.iterator();
		
		while(em.hasMoreElements()) {				// it.hasNext();
			System.out.println(em.nextElement());	// it.next();
		}
	}
}




















