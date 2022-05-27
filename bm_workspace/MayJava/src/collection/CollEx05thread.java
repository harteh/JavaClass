package collection;

class Th5 extends Thread {
	String str;
	Th5(String str, int n){
		this.str=str;
		setPriority(n);	//스레드 우선순위 세팅
	}
	
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());	//스레드 우선순위 얻어냄
	}
}

public class CollEx05thread {
	public static void main(String[] args) {
		//스레드의 우선순위를 정할 수 있다.
		Th5 t1 = new Th5("세종", Thread.MAX_PRIORITY);
		Th5 t2 = new Th5("태종", Thread.MIN_PRIORITY);
		Th5 t3 = new Th5("정조", Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
