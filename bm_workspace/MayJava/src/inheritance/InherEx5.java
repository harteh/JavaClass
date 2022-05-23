package inheritance;

class Circle {
	private int r;	//필드 (인스턴스 변수)
	
	public Circle(int r) {	//생성자
		this.r = r;
	}
	int get() {	//메서드
		return r;
	}
}

class NCircle extends Circle {
	String color;
	NCircle(int r, String c){
		super(r);	//부모 생성자를 호출하는 것(line 6)
		color = c;
	}
	void show() {
		System.out.println("반지름: " + get() +", "+ color +"색");
	}
}

public class InherEx5 {
	public static void main(String[] args) {
		NCircle n = new NCircle(10, "red");
		n.show();	//반지름 10 red색
	}
}
