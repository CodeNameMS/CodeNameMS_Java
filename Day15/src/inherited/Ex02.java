package inherited;

class Police extends Person {
	String rank;
	
	Police(String name, int age, String rank){
		super(name, age);
		
		this.rank = rank;
	}
	
	@Override
	void showInfo() {
		System.out.printf("이름 : %s (%d세, %s)\n", getName(),getAge(),rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major){
		super(name, age);
		
		this.major = major;
	}
	
	@Override
	void showInfo() {
		System.out.printf("이름 : %s (%d세, %s)\n", getName(), getAge(), major);
	}
	
	void cure(Person target) {
		System.out.println(target.getName() + "의 치료를 시작합니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 30);
		Student stu = new Student("김길동", 15, 78);
		Police pol = new Police("이길동", 40, "경감");
		Doctor doc = new Doctor("박길동", 37, "내과");
		
		per.showInfo();
		stu.showInfo();
		pol.showInfo();
		doc.showInfo();
		System.out.println();
		
		// 배열로 모두 묶어서 업캐스팅  
		// 즉, up-casting은 하위 클래스를 묶어서 처리하기 위함
		Person[] member = new Person[] { per, stu, pol , doc };
		
		for (int i=0; i<member.length; i++) {
			System.out.print(i +"번째");
			member[i].showInfo();
		}
		System.out.println();
		
		// member[1].study();
		// - 현재 up-casting 되어있는 상태 -> 자식의 멤버 접근 불가능
		
		// member[3]을 꺼내서 cure()메서드를 호출해 보세요
		Doctor Doc = (Doctor)member[3];
		
		
		Doc.cure(stu);
		Doc.cure(pol);

		// down-casting 후
		Student Stu = (Student)member[1];
		Stu.study("Java");
		System.out.println();
	
		// 형변환을 바르게 지정하지 않으면 에러
		System.out.println(member[3] instanceof Person);
		System.out.println(member[3] instanceof Doctor);
		System.out.println(member[3] instanceof Police);
		// member[3]은 의사 -> 즉, 경찰로 변환 불가능
		
		
	}
}
























