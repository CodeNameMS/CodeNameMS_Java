package constructor;

// 생성자 : 메서드의 일종으로, 클래스의 멤버 변수를 초기화하는 용도로 자주 사용된다.
// ㄴ> 생성자는 하나도 작성하지 않을시 Java컴파일러가 알아서 하나 생성해준다.
// ㄴ> 이를, '기본 생성자'라고 한다.

class Person{
	String name;
	int age;
	
	// 기본생성자는 생성자가 하나도 없을 때만 자동으로 생성되니 주의한다.
	Person(){}
	
	// 생성자는필요하다면 오버로딩을 통해서 여러개를 작성할 수 있다.
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세\n");
	}
}



public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("김길동", 30);
		
		p1.showInfo();
		p2.showInfo();
	}
}






























