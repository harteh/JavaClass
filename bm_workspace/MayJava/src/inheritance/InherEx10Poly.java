package inheritance;

/*
 * �������ε�(dynamic binding)
 * ������ �޼��带 ������ �Ҷ� �������� �ʰ� ���� ��(run time)�� �����ϴ� ��
 * 
 * �ڹٿ����� ���� ���ε��� ���� �������̵��� �޼��尡 �׻� ����ǵ��� �����Ѵ�.
 * 
 * => �������ε��� ���� �׻� �ڽ� Ŭ������ �������̵��� �޼ҵ尡 ȣ���
 * => �׷� �θ� Ŭ������ �޼���� ���̻� �� �� ���°�?
 * => �ƴϴ�. superŰ���带 �̿��� �������ε��� �Ͽ� �θ� Ŭ������ ����� ���� �����ϴ�. 
 */

class Food {
	void eat() {
		System.out.println("eat");
	}
}

class Pizza extends Food {
	void eat() {
		System.out.println("pizza");
	}
}
class Pasta extends Food {
	void eat() {
		System.out.println("pasta");
	}
}
class Chicken extends Food {
	void eat() {
		System.out.println("chicken");
	}
}

public class InherEx10Poly {
	
	static void pr(Food f) {
		f.eat();	//���ο��� ȣ���ϱ� ���� ����	//�������ε�
	}
	
	public static void main(String[] args) {

		Pizza p = new Pizza();
		pr(p);		//Food f = new Pizza();	//��ĳ����
		
		pr(new Pasta());	//Food f = new Pasta();	//��ĳ����
		pr(new Chicken());
	}
}
