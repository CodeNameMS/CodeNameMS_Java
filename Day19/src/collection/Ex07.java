package collection;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		// TreeSet : Tree라는 자료구조 형태로 저장한다
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		// TreeSet<Integer> ts = new TreeSet<Integer>();		// 기본정렬 방식 (Integer는 오름차순)
		TreeSet<Integer> ts = new TreeSet<Integer>(desc);		// 내가 작성한 정렬 방식
		Random rand = new Random();
		
		for (int i=0; i<10; i++) {
			int n = rand.nextInt(20) + 1;
			
			ts.add(n);
		}
		System.out.println("ts = " + ts);	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}
}
