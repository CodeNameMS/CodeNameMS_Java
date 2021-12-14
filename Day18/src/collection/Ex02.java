package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

class Desc implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			int n = rand.nextInt(20) + 1;	// 1 ~ 20 사이의 무작위 수를 반환
			
			list.add(n);
		}
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		list.sort(new Desc());
		System.out.println("list = " + list);
	}
}


















