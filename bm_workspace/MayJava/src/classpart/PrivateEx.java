package classpart;

/*
 * 1
class Circle {
	private double a;
	static final double PI = 3.14;	//변경되는 값이 아니다.
	
	Circle(double a){
		this.a = a;
	}
	
	void show(){
		System.out.println("원의 둘레: " + a*2*PI);
	}
	void area() {
		System.out.println("원의 면적: " + a*a*PI);
	}	
}

public class PrivateEx {
	public static void main(String[] args) {
		Circle c = new Circle(3.4);
		c.show();
		c.area();
	}
}
 */

/*
 * 2
 */

class Number {
	static void show(int n) {
		//-> 클래스 메소드 = 정적메소드
		System.out.println(n);
	}
	static void sh(double n) {
		System.out.println(n);
	}
}

public class PrivateEx {
	public static void main(String[] args) {
		
		Number.show(30);	
		//클래스로 접근. 
		//show->static이다. 클래스 메소드
		//-> 객체를 생성하지 않아도 static 메소드를 호출할 수 있다.
		//이유는? static메소드는 객체보다 먼저 생성되기 때문.
		
		Number n = new Number();
		n.sh(2.45);
		

	}
}
