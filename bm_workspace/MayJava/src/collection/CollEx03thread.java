package collection;

class Music extends Thread {
	String str;
	Music(String s){
		str = s;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str +" "+ i);
		}
	}
}

class Movie implements Runnable {
	String str;
	Movie(String s){
		str = s;
	}
	public void run() {
		System.out.println(str);
	}
}

public class CollEx03thread {
	public static void main(String[] args) {

		Music m = new Music("���� ���");
		m.start();		//10�� ���
		
		Movie m1 = new Movie("��ȭ ���");
		Thread t = new Thread(m1);
		t.start();		//��ȭ ��� ���
		
		try {
			m.join();	//m �����尡 ������ ������ ��ٸ���.
			t.join();
		}
		catch(Exception e) {}
			
	}
}
