package collection;

import java.util.ArrayList;
import java.util.Comparator;

// ��ü�� ���ϱ� ���� ���
// 1. CompareAlbe
// - �⺻ �� ����
// - �ϳ� �ۿ� �� ��

// 2. Comparator
// - ��Ÿ �ٸ� �� ������ �� ���� ���� ��
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
		return name + " (" + age + "��)";
	}
	
	@Override	// ���̸� �������� ��������
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

//1. private ���·� ����ǰ�
//2. �̸������� ��������
class NameDesc implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o2.getName().compareTo(o1.getName());
	}
}


public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		
		System.out.println("p1 = " + p1);
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(p1);	// �ν��Ͻ��� ���� ���� ���������� �߰�
		
		// �ٷ� �ν��Ͻ��� �߰��ص� ��
		list.add(new Person("��浿", 15));
		list.add(new Person("�̱浿", 30));
		
		// �⺻ ���
		System.out.println("list = " + list);
		
		// ��������
		list.sort(null);
		System.out.println("list = " + list);
		
		// ��������
		list.sort(new AgeDesc());
		System.out.println("list = " + list);
		
		// �̸� ��������
		list.sort(new NameAsc());
		System.out.println("list = " + list);
		
		list.sort(new NameDesc());
		System.out.println("list = " + list);
		
		// ���� ( ���� Ŭ���� Ȱ�� )
		Comparator<Person> ageDesc = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge() - o1.getAge();
			}
		};
		
		// ���ٽ� : �Լ��� �������̽��� �ٷ� ���������� ��
		Comparator<Person> ageAsc = (Person o1, Person o2) -> {
			return o1.getAge() - o2.getAge();
		};
		
		
		list.sort(ageDesc);
		System.out.println("list = " + list);
		
		list.sort(ageAsc);
		System.out.println("list = " + list + "\n");
		
		// ���ٽ��� �ַ� ���ο��� �ٷ� ������·� ���� ����
		list.sort((Person o1, Person o2) -> { 
			return o1.getAge() - o2.getAge(); 
				}
		);
		System.out.println("list = " + list);
	}
}


























