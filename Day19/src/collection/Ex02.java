package collection;

import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
		// ArrayList vs LinkedList
		// 1. 사용방법은 동일
		// 2. 내부적인 저장 구조가 다르다
		
		// 특징)
		// ArrayList = 접근 속도가 빠르다. 단, 데이터의 수정, 삭제 시 오버헤드가 발생할 수 있다.
		// - 즉, 변화에 적합하지 못한 구조
		
		// LinkedList : ArrayList보단 느리다. 단, 데이터의 수정, 삭제 시 성능 문제가 없다.
		// - 즉, 변화에 적합
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i=10; i<=100; i+= 10) {
			list.add(i);
		}
		
		System.out.println("list = " + list);
		
		list.clear();
		System.out.println("list = " + list);
		
	}
}

















