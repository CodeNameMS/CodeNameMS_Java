package accessModifier;

// 메서드의 종류 
// 1. 생성자
// 2. Access 메서드
// 3. 사용자 메서드

// Access 메서드 사용 이유
// 1. 필드(= 멤버 변수)를 바로 제공하는 것보다 안정적이다
// ㄴ> getter만 제공 시 값을 얻기만, setter만 제공 시 값의 수정만 가능
// 2. 쓰는 곳이 있다.
// ㄴ> 예시) JSP의 beans 클래스


class Student{
	private String name;
	private int kor, eng, mat;
	
	// 생성자
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.mat = mat;
	}
	
	// 사용자 메서드
	void showStu() {
		System.out.printf("%s (국 %d 영 %d 수 %d)\n", name, kor, eng, mat);
	}
	
	// Access 메서드 : getter, setter
	// getter : 값을 얻는 메서드
	// setter : 값을 변경하는 메서드
	// 작성 방식 : get변수명, set변수명
	
	String getName() {
		return name;
	}

	int getKor() {
		return kor;
	}

	void setKor(int kor) {
		this.kor = kor;
	}

	int getEng() {
		return eng;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	int getMat() {
		return mat;
	}

	void setMat(int mat) {
		this.mat = mat;
	}

	void setName(String name) {
		this.name = name;
	}
	
//	void setName(String name) {
//		this.name = name;
//	}
//	
//	int getKor() {
//		return kor;
//	}
//	int getEng() {
//		return eng;
//	}
//	int getMat() {
//		return mat;
//	}
//	
//	void setKor(int kor) {
//		this.kor = kor;
//	}
//	void setEng(int eng) {
//		this.eng = eng;
//	}
//	void setMat(int mat) {
//		this.mat = mat;
//	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 70, 80, 98);
		
		s1.showStu();
		
		s1.setName("홍진호");
		
		s1.setKor(22);
		s1.setEng(22);
		s1.setMat(22);

		
		//System.out.println("s1의 이름 : " + s1.name);
		System.out.println("s1의 이름 : " + s1.getName());
		
		System.out.println("s1의 국어 : "+s1.getKor());	// 22
		System.out.println("s1의 영어 : "+s1.getEng());	// 22
		System.out.println("s1의 수학 : "+s1.getMat());	// 22
	}
}






















