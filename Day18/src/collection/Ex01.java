package collection;

import java.util.ArrayList;

// collection : 모음
// framework : 정형화된 도구. 개발을 위해서 복잡한 과정을 하나의 도구로 작성해놓은 형태

// collection framework : 컬렉션 프레임워크
// - 자바에서 필요한 자료구조나 알고리즘을 미리 작성해두고 제공해주는 것

// 사용 이유
// 1. 배열의 한계점 - 기능이 없다, 크기를 미리 지정해두고 써야 한다
// 2. 다양한 형태의 자료구조가 필요
// 3. 개발시간의 단축

// 종류
// 1. List : 순서 o(= index), 중복 o
// ㄴ> ArrayList, LinkedList, Vector
// 2. Set : 순서 x, 중복 x
// ㄴ> HashSet, TreeSet
// 3. Map : key와 value의 한 쌍을 저장하는 자료구조
//			key는 중복 x, value는 중복 o
// ㄴ> HashMap, TreeMap, HashTable 


public class Ex01 {
	public static void main(String[] args) {
		// 위의 List, Set, Map은 interface로 작성되어 있다.
		// 따라서, 실제로 구현한 클래스를 써야 사용가능
		
		// List를 구현한 클래스 : ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[5];
		
		System.out.println("list = " + list);	// collection : toString()이 오버라이딩 되어있어
		System.out.println("arr = " + arr);		// 바로 출력이 가능
		
		list.add(10);	// add() : 데이터를 리스트 맨 뒤에 추가
		list.add(20);
		list.add(30);
		
		System.out.println("\nlist = " + list);
		
		list.add(1, 15);	// add(index, value) : 해당 index에 추가. 기존 데이터는 한 칸씩 뒤로
		System.out.println("\nlist = " + list);
		
		list.remove(2);		// remove(index) : 해당 index제거. 기존 데이터는 한 칸씩 앞으로 당김
		System.out.println("list = " + list);
		
		// get(index) : 리스트는 []로 indexing 불가능. 메서드로 사용한다.
		// - 해당 index 위치의 값을 반환
		System.out.println("list[0] = " + list.get(0));
		
		// size() : 리스트의 크기(= 개수)를 반환
		System.out.println("list의 크기 : " + list.size());
		
		// clear()
		list.clear();
		System.out.println("list = " + list);
	}
}























