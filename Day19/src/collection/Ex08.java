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
		return name + " (" + age + "��)";
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
		// �� ������ ���̷� �ϰ�, �������� �ǰ�
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("ȫ�浿", 29));
		ts.add(new Person("��浿", 17));
		ts.add(new Person("�̱浿", 25));
		ts.add(new Person("�ڱ浿", 43));
		
		System.out.println("ts = " + ts);
		
		// �Ʒ��� Comparator�� �̿��ؼ� �̸������� �������� ���ķ� ����� ������
		Comparator<Person> name = (Person o1, Person o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		
		TreeSet<Person> ts2 = new TreeSet<Person>(name);
		
		ts2.add(new Person("ȫ�浿", 29));
		ts2.add(new Person("��浿", 17));
		ts2.add(new Person("�̱浿", 25));
		ts2.add(new Person("�ڱ浿", 43));
		
		System.out.println("ts2 = " + ts2);
	}
}

















