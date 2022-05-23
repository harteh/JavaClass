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
 * �����ε�
class Number {
	static void show(int n){
		System.out.println(n);
	}
	void show(double n) {
		//line 56. ��ü�κ��� �����ϱ� ������ static ���ʿ�
		//�Լ����� ���� ��
		// -> �Ű����� Ÿ��||������ �ٸ��� �������
		// => �����ε�
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

//�������̵�
class AAA {
	void ride() {
		System.out.println("�������̵� AAA");
	}
	void load() {
		System.out.println("�����ε� AAA");
	}
}
class BBB extends AAA {
	void ride() { 	//�������̵�(������)
		System.out.println("�������̵� BBB");
	}
	void load(int n) {	//�����ε�
		System.out.println("�����ε� BBB");
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
