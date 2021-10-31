package inherited;

// ��� : ������ �ۼ��� Ŭ������ ����� �����޾Ƽ� ����� Ȯ���Ű�� ���

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name + " (" + age + "��)");
	}
	
	void eat(String food) {
		System.out.println(name + "(��)�� " + food + "(��)�� �Դ´�. �ȳ�");
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}

}

class Student extends Person{
	private int scores;
	
	Student(String name, int age, int scores){
		super(name, age);		// �θ�Բ� �θ������~
		
		this.scores = scores;	// ���� ����~
	}
	
	@Override
	void showInfo() {
		System.out.printf("�̸� : %s (%d��, %d��)\n", getName(), getAge(), scores);
	}
	
	void study(String sub) {
		System.out.printf("%s(��)�� %s(��)�� �����Ѵ�\n", getName(), sub);
	}
}
	
public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		
		p1.showInfo();
		p1.eat("�Ұ��");
		// p1.study("Python");		// �θ�� �ڽ��� �޼��带 �𸥴�.
		System.out.println();
		
		Student s1 = new Student("��浿", 17, 88);
		
		s1.showInfo();
		s1.eat("¥���");
		s1.study("Java");
		System.out.println();
		
		// Ŭ���� ������ ��Ӱ����϶��� ����ȯ(= casting)�� �����ϴ�.
		// �θ� �������� : new �ڽ�Ŭ����;
		// - ������ �ڽ�Ŭ���� ����������, ����� �θ� ��� �ۿ� �������� ����.
		// - �̸�, up-casting(= ��ĳ����)�̶�� �Ѵ�.
		Person s2 = new Student("�̱浿", 19, 70);
		
		s2.showInfo();			// 2. ������, �������̵��� �޼���� �ڽ��� ���·� ����Ǵ� Ư¡�� �ִ�.
		s2.eat("������");
		// s2.study("C++");		// �ڽ��� �޼��� ȣ�� �Ұ��� -> 2������
		
		
		// �̷���, up-casting�� ��ü�� �ٽ� ������ ������ ���� down-casting�̶�� �Ѵ�.
		// �̶�, ���� ����ȯ�� �ʿ��ϴ�.
		Student stu = (Student)s2;
		
		System.out.println("\ndown ��)");
		stu.showInfo();
		stu.study("C���");		// �ٿ� ĳ������ �ϰ���, �ٽ� �ڽ�Ŭ������ ��� ����� ��� ����
		
		
		
		
		
		
		
	}
}























