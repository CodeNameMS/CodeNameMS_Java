package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// map : key와 value의 한 쌍의 데이터
		// - key는 중복x
		// - value는 중복o
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		list.add(70);
		list.add(80);
		list.add(60);
		
		System.out.println("list = " + list);
		System.out.println("list[0] = " + list.get(0)+"\n");
		// ㄴ> list는 요소(= value)를 참조하기 위해서 index를 활용한다.
		
		// add, remove, size, sort, clear, get
		
		map.put("Python", 70);
		map.put("Java", 80);
		map.put("C", 60);
		
		System.out.println("map = " + map);
		System.out.println("map['Pyhton'] = " + map.get("Python") + "\n");
		// ㄴ> map은 요소(= value)를 참조하기 위해서 key를 활용한다.
		
		// Map은 iterable을 구현하기 있지 않기 때문에 순환 혹은 반복이 불가능하다.
		// - Map에는 key값만 뽑아내는 메서드가 있다.
		// - Set으로 반환이 되는데, Set은 반복이 가능하다.
		// - 이를 이용해서 반복을 할 수 있다.
		// - for-each / Iterator
		
		Set<String> keys = map.keySet();
		
		System.out.println("keys = " + keys + "\n");
		
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		// 그럼 iterator로 똑같이 출력해보자
		
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
	}
}























