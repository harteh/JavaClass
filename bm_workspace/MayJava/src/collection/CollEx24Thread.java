package collection;

class Student extends Thread {
	String name;
	Sh sh;
	
	Student(String name, Sh sh){
		this.name = name;
		this.sh = sh;
	}
	
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				sh.add();
				sleep(500);
			} catch (Exception e) {}
		}
	}
}

class Sh {
	private int num = 0;
	
	public void add() {
		int n = num;
		Thread.yield();
		n+=10;
		num=n;
		System.out.println(num); 
	}
}

public class CollEx24Thread {
	public static void main(String[] args) {

		Sh sh = new Sh();
		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);
		th1.start();
		
		try {
			//스레드 동기화
			th1.join();
			th2.join();
		} catch (Exception e) {}
		th2.start();
	}
}
