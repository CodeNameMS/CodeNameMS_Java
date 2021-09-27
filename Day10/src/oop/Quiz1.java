package oop;

class Student{
	String name;
	int kor, eng, mat;


	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	
	void showStu() {
		System.out.println("이름 : " + name);
		System.out.println("국 영 수 : " + kor +" "+ eng + " " + mat);
	}
	
	int total() {
		return kor+eng+mat;
	}
	
	double avg() {
		return (kor+eng+mat)/3.0;
	}
}
public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 실행될 수 있도록 클래스를 직접 작성해보세요
		
		Student s1 = new Student("홍길동", 70, 80, 98);	// 이름, 국, 영, 수
		Student s2 = new Student("김길동", 60, 99, 78);
		Student s3 = new Student("이길동", 90, 66, 81);
		
		s1.showStu();	// 이름, 국 영 수 점수를 출력한다.
		s2.showStu();
		s3.showStu();
		System.out.println();
		
		System.out.println("s1의 합계 : " + s1.total());	//국영수 합계를 반환하게
		System.out.println("s2의 합계 : " + s2.total());
		System.out.println("s3의 합계 : " + s3.total());
		System.out.println();
		
		System.out.printf("s1의 평균 : %.1f\n", s1.avg());
		System.out.printf("s2의 평균 : %.1f\n", s2.avg());
		System.out.printf("s3의 평균 : %.1f\n", s3.avg());
	}
}
































