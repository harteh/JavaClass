package collection;

class Th1 implements Runnable {	
	//Runnable �������̽��� �����ϵ��� �ϴ� ���
	String name;
	Th1(String n){
		name = n;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name + i);
			try {
				Thread.sleep(100);
				//sleep = Ŭ����(static) �Լ�
			} catch (Exception e) {}
		}
	}
	
}

public class CollEx02thread {
	public static void main(String[] args) {

		Th1 t = new Th1("������ 1, ");
		Thread t1 = new Thread(t);
		t1.start();
		
		//Runnable ���� run() �ۿ� �����Ƿ�
		//start()�� Thread�� ��ü�ιۿ� ���� ���Ѵ�.
		
	}
}
