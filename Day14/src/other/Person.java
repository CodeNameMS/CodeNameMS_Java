package other;

// ���� ���� ������
// 1. private	: ����
// 2. default	: ���� + ��Ű��
// 3. protected : ���� + ��Ű�� + �ڽ�
// 4. public	: ���� + ��Ű�� + �ڽ� + �ܺ�


public class Person {
	private String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("%s %d��\n", name, age);
	}
	
	public void eat(String food) {
		System.out.printf("%s(��)�� %s�� �Դ´�. �ȳ�", name, food);
	}
	
	public String getName() {
		return name;
	}
}


















