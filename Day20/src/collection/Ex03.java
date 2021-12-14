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
		return name + " " + age + "��";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		
		map.put("hong", new Person("ȫ�浿", 20));
		map.put("kim", new Person("��浿", 17));
		map.put("lee", new Person("�̱浿", 32));
		
		System.out.println("map : " + map);
		// ��> Map�� ���������� �ٷ� ����� ����ϰ� �ʹٸ�
		// 	  toString�� �������̵� �ϵ��� ����~
		
		
	}
}





























