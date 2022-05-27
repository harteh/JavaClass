package collection;

class Th5 extends Thread {
	String str;
	Th5(String str, int n){
		this.str=str;
		setPriority(n);	//������ �켱���� ����
	}
	
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());	//������ �켱���� ��
	}
}

public class CollEx05thread {
	public static void main(String[] args) {
		//�������� �켱������ ���� �� �ִ�.
		Th5 t1 = new Th5("����", Thread.MAX_PRIORITY);
		Th5 t2 = new Th5("����", Thread.MIN_PRIORITY);
		Th5 t3 = new Th5("����", Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
