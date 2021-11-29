package object;

class Car {
	String name;
	int table;
	
	Car(String name, int table){
		this.name = name;
		this.table = table;
	}

	@Override
	public String toString() {
		
		return name +", " + table + "��";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + table;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (table != other.table)
			return false;
		return true;
	}
	
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 ����ǰ� Ŭ������ �ۼ�
		Car car1 = new Car("���", 4);
		Car car2 = new Car("���", 5);
		Car car3 = new Car("���", 4);
		
		System.out.println("car1 = " + car1);	// ���, 4
		System.out.println("car2 = " + car2);	// ���, 5
		System.out.println("car3 = " + car3);	// ���, 4
		
		if (car1.equals(car2)) {
			System.out.println("�� ���� �����ϴ�~");
		}
		else {
			System.out.println("�� ���� �ٸ��ϴ�~");
		}
	}
}















