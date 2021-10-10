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
	private String name;		//이름
	private Ball ball;		//공
	
	Child(String name){
		this.name = name;
	}
	
	void pickUp(Ball ball) {
		this.ball = ball;
		System.out.println(name +"가 "+ball.getName()+"을 얻었다.\n");
	}
	
	void show() {
		if(this.ball != null) {
			System.out.printf(name+"(공 : %s)\n", ball.getName());
		}
		else {
			System.out.println(name+"(공 : x)");
		}
	}
	
	void throwBall(Child name) {
		System.out.printf(this.name +"가 "+name.name+"에게 %s을 던짐\n", ball.getName());
		
		name.pickUp(ball);
		
		this.ball = null;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Child jinho = new Child("진호");
		Child minsu = new Child("민수");
		
		jinho.show();	// 진호 (공 : x)
		minsu.show();	// 민수 (공 : x)
		System.out.println();
		
		Ball ball = new Ball("축구공");
		
		jinho.pickUp(ball);		//진호가 공을 얻었다.
		
		jinho.show();	// 진호 (공 : o)
		minsu.show();	// 민수 (공 : x)
		System.out.println();
		
		jinho.throwBall(minsu);	// 진호가 민수에게 공을 던짐
		
		jinho.show();	// 진호 (공 : o)
		minsu.show();	// 민수 (공 : x)
		
	}
}



























