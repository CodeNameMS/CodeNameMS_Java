package _abstract;

class Programmer extends Person implements Coding {
	
	Programmer(String name) {
		super(name);
	}
	
	@Override
	void study() {
		System.out.println("딥러닝을 공부하는 중");
	}
	
	@Override
	public void programming() {
		System.out.println("웹 개발을 하는 중");
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 80);
		Child c1 = new Child("김길동");
		Programmer p1 = new Programmer("이길동");
		
		// 어린이나 학생은 둘 다 '사람' -> 업캐스팅 가능
		Person[] pers = new Person[] { s1, c1, p1};
		
		// 같은 '사람'이나, 학생은 코딩 가능, 어린이는 코딩 불가능
		Coding[] cos = new Coding[] { s1, p1};
		
		cos[0].programming();
		cos[1].programming();
		
	}
}


























