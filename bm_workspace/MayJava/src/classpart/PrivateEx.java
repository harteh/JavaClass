package classpart;

/*
 * 1
class Circle {
	private double a;
	static final double PI = 3.14;	//����Ǵ� ���� �ƴϴ�.
	
	Circle(double a){
		this.a = a;
	}
	
	void show(){
		System.out.println("���� �ѷ�: " + a*2*PI);
	}
	void area() {
		System.out.println("���� ����: " + a*a*PI);
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
		//-> Ŭ���� �޼ҵ� = �����޼ҵ�
		System.out.println(n);
	}
	static void sh(double n) {
		System.out.println(n);
	}
}

public class PrivateEx {
	public static void main(String[] args) {
		
		Number.show(30);	
		//Ŭ������ ����. 
		//show->static�̴�. Ŭ���� �޼ҵ�
		//-> ��ü�� �������� �ʾƵ� static �޼ҵ带 ȣ���� �� �ִ�.
		//������? static�޼ҵ�� ��ü���� ���� �����Ǳ� ����.
		
		Number n = new Number();
		n.sh(2.45);
		

	}
}
