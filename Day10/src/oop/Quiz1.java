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
		System.out.println("�̸� : " + name);
		System.out.println("�� �� �� : " + kor +" "+ eng + " " + mat);
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
		// �Ʒ� �ڵ尡 ����� �� �ֵ��� Ŭ������ ���� �ۼ��غ�����
		
		Student s1 = new Student("ȫ�浿", 70, 80, 98);	// �̸�, ��, ��, ��
		Student s2 = new Student("��浿", 60, 99, 78);
		Student s3 = new Student("�̱浿", 90, 66, 81);
		
		s1.showStu();	// �̸�, �� �� �� ������ ����Ѵ�.
		s2.showStu();
		s3.showStu();
		System.out.println();
		
		System.out.println("s1�� �հ� : " + s1.total());	//������ �հ踦 ��ȯ�ϰ�
		System.out.println("s2�� �հ� : " + s2.total());
		System.out.println("s3�� �հ� : " + s3.total());
		System.out.println();
		
		System.out.printf("s1�� ��� : %.1f\n", s1.avg());
		System.out.printf("s2�� ��� : %.1f\n", s2.avg());
		System.out.printf("s3�� ��� : %.1f\n", s3.avg());
	}
}
































