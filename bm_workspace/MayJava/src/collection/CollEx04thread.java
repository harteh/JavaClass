package collection;

class Th2 implements Runnable{
	public void th1() {
		System.out.println("BB");
		th2();
	}
	public void th2() {
		System.out.println("CC");
	}
	public void run() {
		System.out.println("AA");
		th1();
	}	
}

public class CollEx04thread {
	public static void main(String[] args) {

		System.out.println("스레드!!!!!!!");
		Th2 t = new Th2();
		Thread t1 = new Thread(t);
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {}
		System.out.println("스레드@@@@@@@");

	}
}
