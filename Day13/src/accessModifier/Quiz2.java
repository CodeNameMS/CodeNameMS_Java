package accessModifier;

class Ball{
	private String name;
	
	Ball(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}

class Child{
	private String name;		//�̸�
	private Ball ball;		//��
	
	Child(String name){
		this.name = name;
	}
	
	void pickUp(Ball ball) {
		this.ball = ball;
		System.out.println(name +"�� "+ball.getName()+"�� �����.\n");
	}
	
	void show() {
		if(this.ball != null) {
			System.out.printf(name+"(�� : %s)\n", ball.getName());
		}
		else {
			System.out.println(name+"(�� : x)");
		}
	}
	
	void throwBall(Child name) {
		System.out.printf(this.name +"�� "+name.name+"���� %s�� ����\n", ball.getName());
		
		name.pickUp(ball);
		
		this.ball = null;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Child jinho = new Child("��ȣ");
		Child minsu = new Child("�μ�");
		
		jinho.show();	// ��ȣ (�� : x)
		minsu.show();	// �μ� (�� : x)
		System.out.println();
		
		Ball ball = new Ball("�౸��");
		
		jinho.pickUp(ball);		//��ȣ�� ���� �����.
		
		jinho.show();	// ��ȣ (�� : o)
		minsu.show();	// �μ� (�� : x)
		System.out.println();
		
		jinho.throwBall(minsu);	// ��ȣ�� �μ����� ���� ����
		
		jinho.show();	// ��ȣ (�� : o)
		minsu.show();	// �μ� (�� : x)
		
	}
}



























