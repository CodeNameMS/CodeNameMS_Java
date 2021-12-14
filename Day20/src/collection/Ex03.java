package collection;

import java.util.HashMap;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age + "세";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		
		map.put("hong", new Person("홍길동", 20));
		map.put("kim", new Person("김길동", 17));
		map.put("lee", new Person("이길동", 32));
		
		System.out.println("map : " + map);
		// ㄴ> Map의 참조변수로 바로 결과를 출력하고 싶다면
		// 	  toString을 오버라이딩 하도록 하자~
		
		
	}
}





























