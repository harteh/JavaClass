package collection;

class Th extends Thread {	//스레드 클래스 작성: 상속받아 만듬
	String name;
	Th(String n){
		name = n;
	}
	public void run() {	
		//Thread 를 상속하면 run 메서드를 구현해야 한다
		//스레드 코드 = 스레드 실행 시작 메서드
		//스레드의 메인 메서드
		System.out.println(name);
	}
}

public class CollEx01thread {
	public static void main(String[] args) {

		Th t = new Th("스레드 1");
		Th t2 = new Th("스레드 2");
		
		t.start();	//스레드로 작동 시작(JVM에 의해 스케쥴되기 시작함)
		t2.start();
		

	}
}
