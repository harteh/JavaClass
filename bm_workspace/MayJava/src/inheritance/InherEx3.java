package inheritance;
/*
 * 1
class Point{
	private int x, y;
	Point(){
		this.x = 0;
		this.y = 0;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void pr() {
		System.out.println(x+" "+y);
	}
}

class Color extends Point {
	private String name;
	Color(int a, int b, String c){
		super(a, b);
		name = c;
	}
	void show() {
		System.out.println(name);
		pr();
	}
}

public class InherEx3 {
	public static void main(String[] args) {

		Color c = new Color(3, 6, "red");
		c.show();
	}
}
*/

/*
 * 오버로딩
class Number {
	static void show(int n){
		System.out.println(n);
	}
	void show(double n) {
		//line 56. 객체로부터 접근하기 때문에 static 불필요
		//함수명이 같을 때
		// -> 매개변수 타입||개수가 다르면 상관없음
		// => 오버로딩
		System.out.println(n);
	}
}

public class InherEx3 {
	public static void main(String[] args) {
		Number.show(20);	//20
		
		Number n = new Number();
		n.show(3.14);
	}
}
*/

//오버라이딩
class AAA {
	void ride() {
		System.out.println("오버라이딩 AAA");
	}
	void load() {
		System.out.println("오버로딩 AAA");
	}
}
class BBB extends AAA {
	void ride() { 	//오버라이딩(재정의)
		System.out.println("오버라이딩 BBB");
	}
	void load(int n) {	//오버로딩
		System.out.println("오버로딩 BBB");
	}
}
public class InherEx3 {
	public static void main(String[] args) {
		
		AAA a = new AAA();
		a.ride();
		a.load();
		
		BBB b = new BBB();
		b.ride();
		b.load();
		b.load(2);
	}
}
