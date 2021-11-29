package _abstract;

import other.Machine;
import other.USB;

class Phone extends Machine implements USB {
	@Override
	public void run() {
		System.out.println("�޴��� �����. ������...");
	}
}

class Remocon extends Machine {
	@Override
	public void run() {
		System.out.println("������ ����. OnOff");
	}
}

class PC extends Machine {
	@Override
	public void run() {
		System.out.println("���� OnOff");
	}
	
	void connect(USB target) {
		target.run();
	}
}

class People {
	void use(Machine target) {
		target.run();
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Phone phone = new Phone();
		Remocon remote = new Remocon();
		
		pc.connect(phone);
		// pc.connect(remote);
		System.out.println();
		
		People pe = new People();
		
		pe.use(phone);
		pe.use(remote);
		
		// �� �������̽���, �߻�Ŭ������
		// �͸� Ŭ������� �̸����� ��ü�� ������ �� �ִ�.
		// - ��ȸ�� Ŭ�����ν�, Ư�� ��ü �ϳ����� ����
		
		Machine mac = new Machine() {
			
			@Override
			public void run() {
				System.out.println("��� �Դϴ�");
			}
		};
		
		mac.run();
		
		// ��� �������̽�
		USB sub = new USB() {
			
			@Override
			public void run() {
				System.out.println("USB ��ü�Դϴ�.");
			}
		};
		
		sub.run();
		
		// �� �Լ��� �������̽��� ���ٽ��̶�� �ڵ��
		// �����ϰ� �ٷ� ��ü ���� ����
		
		USB usb2 = () -> {
			System.out.println("���ٽ����� ������ USB");
		};
		
		usb2.run();
		
	}
}































