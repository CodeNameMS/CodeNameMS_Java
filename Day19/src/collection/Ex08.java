package collection;

import java.util.TreeSet;
import java.util.Comparator;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + "세)";
	}
	
	@Override
	public int compareTo(Person o) {
		return o.age - age;
	}
	
	String getName() {
		return name;
	}
	
}

public class Ex08 {
	public static void main(String[] args) {
		// 비교 기준은 나이로 하고, 내림차순 되게
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("홍길동", 29));
		ts.add(new Person("김길동", 17));
		ts.add(new Person("이길동", 25));
		ts.add(new Person("박길동", 43));
		
		System.out.println("ts = " + ts);
		
		// 아래는 Comparator를 이용해서 이름순으로 오름차순 정렬로 출력해 보세요
		Comparator<Person> name = (Person o1, Person o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		
		TreeSet<Person> ts2 = new TreeSet<Person>(name);
		
		ts2.add(new Person("홍길동", 29));
		ts2.add(new Person("김길동", 17));
		ts2.add(new Person("이길동", 25));
		ts2.add(new Person("박길동", 43));
		
		System.out.println("ts2 = " + ts2);
	}
}

















