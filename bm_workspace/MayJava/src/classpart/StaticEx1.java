package classpart;
/*
 * static ������ ������ ����� Ŭ������ ��� �ν��Ͻ��� �����ϴ� �����̴�.
 * �ν��Ͻ� �������� static ������ ���� ����
 */

/*
 * 1
class A{
	static int n=100;
	//�޸� ������ �����ȴ�.
	//static �� ������ �ʱ�ȭ�ȴ�.
	
	
	A(){
		n++;
		System.out.println(n);
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
	}
}
 */

class A{
	static int num=0;
	A(){
		in();
	}
	public void in() {
		num++;
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		
		A a=new A();
		a.num++;	//�ν��Ͻ��� static ȣ��
		A.num++;	//Ŭ������ static ȣ��
		System.out.println(A.num);
	}
}
