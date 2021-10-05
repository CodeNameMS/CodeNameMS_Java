package accessModifier;

// �޼����� ���� 
// 1. ������
// 2. Access �޼���
// 3. ����� �޼���

// Access �޼��� ��� ����
// 1. �ʵ�(= ��� ����)�� �ٷ� �����ϴ� �ͺ��� �������̴�
// ��> getter�� ���� �� ���� ��⸸, setter�� ���� �� ���� ������ ����
// 2. ���� ���� �ִ�.
// ��> ����) JSP�� beans Ŭ����


class Student{
	private String name;
	private int kor, eng, mat;
	
	// ������
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.mat = mat;
	}
	
	// ����� �޼���
	void showStu() {
		System.out.printf("%s (�� %d �� %d �� %d)\n", name, kor, eng, mat);
	}
	
	// Access �޼��� : getter, setter
	// getter : ���� ��� �޼���
	// setter : ���� �����ϴ� �޼���
	// �ۼ� ��� : get������, set������
	
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
		Student s1 = new Student("ȫ�浿", 70, 80, 98);
		
		s1.showStu();
		
		s1.setName("ȫ��ȣ");
		
		s1.setKor(22);
		s1.setEng(22);
		s1.setMat(22);

		
		//System.out.println("s1�� �̸� : " + s1.name);
		System.out.println("s1�� �̸� : " + s1.getName());
		
		System.out.println("s1�� ���� : "+s1.getKor());	// 22
		System.out.println("s1�� ���� : "+s1.getEng());	// 22
		System.out.println("s1�� ���� : "+s1.getMat());	// 22
	}
}






















