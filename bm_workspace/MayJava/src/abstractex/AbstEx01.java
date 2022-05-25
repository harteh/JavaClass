package abstractex;

/*
 * �߻�޼ҵ� (abstract method)
 * �߻�Ŭ���� (abstract class)
 *   1. �߻� �޼ҵ带 �ּ� �Ѱ� �̻� ������ abstract �� ����� Ŭ����
 *   2. �߻� �޼ҵ尡 ��� abstract �� ������ Ŭ����
 * => �ڡڡڡڡڡ� �߻� Ŭ������ ��ü ������ �� ���� �ڡڡڡڡڡ�
 *   
 *   - �߻�޼ҵ�� �Ϲݸ޼ҵ� ��� �� �� �ִ�.
 *   - ��ӹ޾� ����Ŭ�������� �������� �����ϱ� ���ؼ� ���.
 *   
 *  �߻�޼ҵ� (abstract method)�� �Ϲ� Ŭ���� �ȿ� �� �� ����.
 *  - �ݵ�� �߻� Ŭ���� �ȿ� �־�� �Ѵ�.
 *  
 *  
 */

/*
 * 1
abstract class Car {
	String name;	//�ʵ�
	void run() {	//�Ϲ����� �޼ҵ�
		System.out.println("���� �����δ�.");
	}
	abstract void stop();	//�߻� �޼ҵ�(�󲮵��� �Լ�)
}

class Cars extends Car {
	Cars(){
		name = "���Ǵ�Ƽ";
	}
	void stop(){	//�������̵�
		System.out.println("���� �����.");
	}
}

public class AbstEx1 {
	public static void main(String[] args) {

		Cars c = new Cars();
		c.run();
		c.stop();
	}
}
*/

abstract class Ca {
	abstract int add(int a, int b);	
	abstract double avg(int a[]);
}

class Cal extends Ca {
	int add(int a, int b) {
		return a+b;
	}
	double avg(int a[]) {
		int sum=0;
		int size = a.length;
		for(int i=0; i<size; i++) {
			sum+= a[i];
		}
		return (double)sum/size;
	}
}


public class AbstEx01 {
	public static void main(String[] args) {
		Cal c= new Cal();
		System.out.println(c.add(3,7));		//�μ���
		System.out.println(c.avg(new int[]{1,2,4}));  //�迭�� ���
	}
}
