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

		Music m = new Music("음악 재생");
		m.start();		//10번 출력
		
		Movie m1 = new Movie("영화 재생");
		Thread t = new Thread(m1);
		t.start();		//영화 재생 출력
		
		try {
			m.join();	//m 스레드가 종료할 때까지 기다린다.
			t.join();
		}
		catch(Exception e) {}
			
	}
}
