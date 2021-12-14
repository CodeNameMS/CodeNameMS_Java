package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		// List와 Set간에는 변환이 가능하다.
		// 그냥 형 변환은 안되고, 생성자를 이용하면 가능하다
		
		Random rand = new Random(0);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			int n = rand.nextInt(15)+1;
			
			list.add(n);
		}
		
		System.out.println("list = " + list);
		
		// List -> Set
		HashSet<Integer> hs = new HashSet<Integer>(list);	// 생성자 전달에 리스트를 전달
		
		System.out.println("hs = " + hs);
		
		// Set -> List
		
		list = new ArrayList<Integer>(hs);
		
		list.sort((Integer o1, Integer o2) -> {
			return o2 - o1;
		});
		
		System.out.println("list = " + list);
	}
}


































