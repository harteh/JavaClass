package interfaceex;

interface A1 {
	public void funcA();	//�߻� �޼���
}
interface B1 {
	public void funcB();	//�߻� �޼���
}
interface C1 extends A1,B1 {	//���� ���
	public void funcC();	//�߻� �޼���
}

class D1 implements C1 {
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcC() {
		System.out.println("funcC");
	}
}


public class InterfaceEx02 {
	public static void main(String[] args) {

		D1 d1 = new D1();
		A1 a1 = d1;		//��ĳ����
		a1.funcA();
		
		B1 b1 = d1;		//��ĳ����
		b1.funcB();
		
		C1 c1 = d1;
		c1.funcA();
		c1.funcB();
		c1.funcC();
		//�������̽����� ��ü ���� �Ұ����ϱ� ������
		//��ӹ��� Ŭ���� D���� ��ü ��������
	}
}
