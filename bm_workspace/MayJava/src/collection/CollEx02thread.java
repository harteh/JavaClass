package collection;

class Th1 implements Runnable {	
	//Runnable 인터페이스를 구현하도록 하는 방법
	String name;
	Th1(String n){
		name = n;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name + i);
			try {
				Thread.sleep(100);
				//sleep = 클래스(static) 함수
			} catch (Exception e) {}
		}
	}
	
}

public class CollEx02thread {
	public static void main(String[] args) {

		Th1 t = new Th1("스레드 1, ");
		Thread t1 = new Thread(t);
		t1.start();
		
		//Runnable 에는 run() 밖에 없으므로
		//start()는 Thread의 객체로밖에 접근 못한다.
		
	}
}
