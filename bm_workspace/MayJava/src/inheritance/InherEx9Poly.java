package inheritance;
/*
 * �������ε�

class Parent {
	void a() {
		pa();
	}
	void pa() {
		pa();	//
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void a() {	//�������̵�
		super.a();	//�θ��� a()�Լ� ȣ��
	}
	void pa() {
		System.out.println("Child");
	}
}

public class InherEx9Poly {
	public static void main(String[] args) {

		Parent c = new Child();	//��ĳ����
		c.a();	//Child
				//��ĳ�����϶� �����ǵ� �޼��尡 ȣ���
		c.pa();
		
	}
} 
*/
/*
 * �������ε�
 */
class Parent {
	int n;
	void a() {
		pa();
	}
	void pa() {
		System.out.println(n);
	}
}

class Child extends Parent {
	int n;
	void pa() {
		n=20;
		super.n =39;
		super.pa();		//�������ε�
		System.out.println(n);
	}
}

public class InherEx9Poly {
	public static void main(String[] args) {

		Parent c = new Child();	//��ĳ����
		c.a();	//Child
		
	}
} 