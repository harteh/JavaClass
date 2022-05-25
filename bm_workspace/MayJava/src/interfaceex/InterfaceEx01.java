package interfaceex;

/*
 * �������̽�
 * - �Լ��� ������ �����Ѵ�.
 * - ���� ��ü�� ���� ������ �����Ѵ�.
 */

/*
 * 1

interface Food {
	int price = 30000;	//���
	void eat();			//�߻�޼���
}

class Pizza implements Food {
	public void eat() {	//public �׻� �ٿ��� �����ؾ��Ѵ�.
		System.out.println("���ڸ� �Դ´�.");
	}
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		Pizza piz = new Pizza();
		piz.eat();
		System.out.println(piz.price);
	}
}
*/

/*
 * 2

interface Addin {
	public int add(int a, int b);
	public int add(int a);
	
	default void pr() {		//�ڹ�8���� �߰��� ����Ʈ �޼���
		System.out.println("����");
	}
	//default��� ���� ���� ������ �� �߻�޼ҵ�� �ν��Ѵ�.
}
class Add implements Addin {
	public int add(int a, int b) {
		return a+b;
	};
	public int add(int a) {
		int sum=0;
		for (int i=1; i<=a; i++) {
			sum+=i;
		}
		return sum;
	};
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		
		Add a = new Add();
		System.out.println(a.add(1, 4));
		System.out.println(a.add(10));	//1-10���� �ձ��ϱ�
		a.pr();
	}
}
*/

interface Animal{
	void bear();
}

interface Fish{
	public void swim();
}

class A implements Animal, Fish {	//�������̽� ���� ���
	public void bear() {
		System.out.println("���´�");
	};
	public void swim() {
		System.out.println("�����Ѵ�.");
	};
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		A a = new A();
		a.bear();
		a.swim();
	}
}
