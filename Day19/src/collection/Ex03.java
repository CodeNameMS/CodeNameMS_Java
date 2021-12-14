package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
	public static void main(String[] args) {
		// Vector : ArrayList�� �����ϰ�, �� ����.
		// - ȣȯ���� ���ؼ� ���ܵ�
		// - ��Ƽ������ ����� ����
		
		Vector<Integer> vec = new Vector<Integer>();
		
		for (int i=10; i<=100; i+=10) {
			vec.add(i);
		}
		
		System.out.println("vec = " + vec + "\n");
		
		// Vector�� Iterator ��ſ� Enumeration�� ����Ѵ�.
		// �̰͵�, �� ����.
		
		Enumeration<Integer> em = vec.elements();	// it = list.iterator();
		
		while(em.hasMoreElements()) {				// it.hasNext();
			System.out.println(em.nextElement());	// it.next();
		}
	}
}




















