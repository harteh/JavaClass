package collection;

class Th extends Thread {	//������ Ŭ���� �ۼ�: ��ӹ޾� ����
	String name;
	Th(String n){
		name = n;
	}
	public void run() {	
		/* Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�
		 * ������ �ڵ� = ������ ���� ���� �޼���
		 * �������� ���� �޼��� */
		
//		System.out.println(name);
		
		for(int i=0; i<10; i++) {
			System.out.println(name);
			try {
				sleep(100);
			} catch (Exception e) {}
		}
		
	}
}

public class CollEx01thread {
	public static void main(String[] args) {

		Th t = new Th("������ 1");
		Th t2 = new Th("������ 2");
		
		t.start();	//������� �۵� ����(JVM�� ���� ������Ǳ� ������)
		t2.start();
		

	}
}