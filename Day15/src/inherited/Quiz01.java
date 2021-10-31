package inherited;

class Airplain {
	Person[] member = new Person[5];	// 비행기 좌석
	int tmp = 0;
	
	void takeOn(Person target) {
		for (int i=0; i< member.length; i++) {
			if(member[i] == null) {		// 배열에 데이터가 없으면 == 좌석이 비었으면
				member[i] = target;
				
				System.out.println(target.getName() + "님이 탑승");
				return;
			}
		}
		System.out.println("님은 좌석이 없습니다 !");
	}
	
	void list() {
		for (int i=0; i<member.length; i++) {
			if(member[i] != null) {
				member[i].showInfo();
			}
			else {
				System.out.println("======== 빈좌석 ========");
			}
		}
	}
	
	void emergency(Person target) {
		for (int i=0; i<member.length; i++) {
			if(member[i] instanceof Doctor) {	// 사람중에 의사가 있으면
				System.out.println("의사를 찾았습니다 !");
				Doctor C = (Doctor)member[i];
				C.cure(target);
				return;
			}
		}
		System.out.println("기내에 의사가 없습니다 !!!");
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 30);
		Student stu = new Student("김길동", 15, 78);
		Police pol = new Police("이길동", 40, "경감");
		Doctor doc = new Doctor("박길동", 37, "내과");
		
		Airplain air = new Airplain();
		
		air.takeOn(per);	// 비행기에 '사람'이 탈 수 있는 메서드
		air.takeOn(stu);
		air.takeOn(pol);
		air.takeOn(doc);
		System.out.println();
		
		air.list();			// 승객의 목록을 출력
		System.out.println();
		
		air.emergency(stu);	// 승객 중에서 의사를 찾아서, 전달된 '사람'을 치료하도록, cure()를 호출
							// 단, 의사가 없으면 없다고 출력
		
	}
}



























