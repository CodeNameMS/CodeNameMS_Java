package interaction;

// ��ȣ�ۿ� : ��ü ���� ���°��踦 ����

// ��ü ���� ���α׷���(OOP) : ��ü�� �����ϰ� ��ü ���� ��ȣ�ۿ����� ���α׷��� �ϼ��ϴ� ���

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Car{
	String model;
	int speed;
	Person driver;
	
	Car(String model){
		this.model = model;
	}
	
	void showCar() {
		String name = driver == null ? "����" : driver.name;
		
		System.out.printf("%s (%dkm/s, ������ : %s)\n",
				model, speed, name);
	}
	
	void takeOn(Person p) {
		driver = p;		// �Ű������� ���� ��� ������
						// �ɹ������� ���� -> �ڵ����� ����� ž��
		System.out.printf("%s(��)�� ž�� !!!\n", p.name);
		showCar();
	}
	
	void accel(int speed) {
		
		if  (driver == null) {
			System.out.println("�����ڰ� �����ϴ� !!!");
			return;
		}
		System.out.printf("%dkm/s ����!!!\n", speed);
		this.speed += speed;
		showCar();
	}
	
	void _break(int speed) {
		if(driver == null) {
			System.out.println("�����ڰ� �����ϴ� !!!");
			return;
		}
		System.out.println(speed +"km/s ����!!!");
		this.speed -= speed;
		showCar();
	}
	
	void takeOff() {
		if(this.speed != 0) {
			System.out.println("���� �� ������ �ּ���~");
			return;
		}
		System.out.println(driver.name + "(��)�� ����!!!");
		driver = null;
		showCar();
	}
}
public class Quiz {
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿");
		Car car = new Car("���");
		
		car.showCar();	// ��� (0km/s, ������ : ����)
		
		// ���� �����ڰ� ���� ���� -> �����ϸ� �ȵ�
		car.accel(20);	// �����ڰ� �����ϴ� !!!
		
		car.takeOn(p);	// ȫ�浿(��)�� ž��!!!
						// ��� (0km/s, ������ : ȫ�浿);
		
		car.accel(20);	// 20km/s ����!!!
						// ��� (20km/s, ������ : ȫ�浿);
		
		car._break(10); // 10km/s ����!!!
						// ���(10km/s, ������ : ȫ�浿);
		
		car.takeOff();	// ���� �� ������ �ּ���~
		
		car._break(10);
		
		car.takeOff();	// ȫ�浿(��)�� ����
						// ���(0km/s, ������ : ����);
	
	}
}































