package totalQuestion0606;

/*
 * main()를 보고 인터페이스를 작성해라. 
	(인터페이스명은 Re, 모든 메소들들을 인터페이스안에서 선언하고 
	show함수는 default로 설정,area는 abstract로 설정)
 */
/*
 * default라는 예약어를 적지 않으면 다 추상메소드로 인식
 */
interface Re {
	public int area();
	default void show() {
		System.out.println("사각형!!");
	}
}

class Rec implements Re {
	private int a, b;
	Rec(int a, int b) {
		this.a = a;		this.b = b;
	}
	public int area() {
		return a*b;
	}
}


public class Q09 {
	public static void main(String[] args) {
		Re r=new Rec(10,20);
		r.show(); 			//"사각형!!" 출력
		System.out.println("면적: " + r.area());
	}
}
