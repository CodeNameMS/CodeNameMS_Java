package constructor;

class People{
	String name;
	int age;
	double height;
	
	People(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	People(String name){
		this.name = name;
	}
	
	People(){
		this.name = "무명";
	}
	
	
	void showInfo() {
		System.out.printf("%s (%d세, %.1f)\n", name, age, height);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드들이 모두 동작하게 클래스를 구현
		People p1 = new People("홍길동", 15, 167.8);
		People p2 = new People("김길동", 31);
		People p3 = new People("이길동");
		People p4 = new People();
		
		p1.showInfo();		// 홍길동(15세, 167.8)
		p2.showInfo();		// 김길동(31.세 0.0)
		p3.showInfo();		// 이길동(0세, 0.0)
		p4.showInfo();		// 무명(0세,0.0)
		
	}
}


















