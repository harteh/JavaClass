package totalQuestion0606;

/*
 * main()�� ���� �������̽��� �ۼ��ض�. 
	(�������̽����� Re, ��� �޼ҵ���� �������̽��ȿ��� �����ϰ� 
	show�Լ��� default�� ����,area�� abstract�� ����)
 */
/*
 * default��� ���� ���� ������ �� �߻�޼ҵ�� �ν�
 */
interface Re {
	public int area();
	default void show() {
		System.out.println("�簢��!!");
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
		r.show(); 			//"�簢��!!" ���
		System.out.println("����: " + r.area());
	}
}
