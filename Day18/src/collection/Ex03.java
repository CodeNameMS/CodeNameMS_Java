package collection;

import java.util.ArrayList;
import java.util.Comparator;

// 객체를 비교하기 위한 방법
// 1. CompareAlbe
// - 기본 비교 기준
// - 하나 밖에 못 씀

// 2. Comparator
// - 기타 다른 비교 기준을 더 쓰고 싶을 때
// 


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
	
	@Override	// 나이를 기준으로 오름차순
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

class AgeDesc implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o2.getAge() - o1.getAge();
	}
}

class NameAsc implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

//1. private 상태로 실행되게
//2. 이름순으로 내림차순
class NameDesc implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o2.getName().compareTo(o1.getName());
	}
}


public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		
		System.out.println("p1 = " + p1);
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(p1);	// 인스턴스를 참조 중인 참조변수를 추가
		
		// 바로 인스턴스를 추가해도 됨
		list.add(new Person("김길동", 15));
		list.add(new Person("이길동", 30));
		
		// 기본 출력
		System.out.println("list = " + list);
		
		// 오름차순
		list.sort(null);
		System.out.println("list = " + list);
		
		// 내림차순
		list.sort(new AgeDesc());
		System.out.println("list = " + list);
		
		// 이름 오름차순
		list.sort(new NameAsc());
		System.out.println("list = " + list);
		
		list.sort(new NameDesc());
		System.out.println("list = " + list);
		
		// 참고 ( 내부 클래스 활용 )
		Comparator<Person> ageDesc = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge() - o1.getAge();
			}
		};
		
		// 람다식 : 함수형 인터페이스를 바로 구현가능한 식
		Comparator<Person> ageAsc = (Person o1, Person o2) -> {
			return o1.getAge() - o2.getAge();
		};
		
		
		list.sort(ageDesc);
		System.out.println("list = " + list);
		
		list.sort(ageAsc);
		System.out.println("list = " + list + "\n");
		
		// 람다식은 주로 내부에서 바로 사용형태로 자주 사용됨
		list.sort((Person o1, Person o2) -> { 
			return o1.getAge() - o2.getAge(); 
				}
		);
		System.out.println("list = " + list);
	}
}


























