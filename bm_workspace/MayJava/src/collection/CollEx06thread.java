package collection;

class Tt1 extends Thread {
	//객체와 배열
	Share s;
	String []str;
	
	Tt1(Share s, String[] str){
		this.s=s;
		this.str=str;
	}
	
	public void run() {
		for(int i=0; i<str.length; i++) {
			s.pr(str[i]);
		}
	}
}

class Share {
	synchronized void pr(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}

public class CollEx06thread {
	public static void main(String[] args) {

		Share s = new Share();
		
		String eng[] = {"java", "study", "db", "spring", "jsp"};
		String kor[] = {"자바","공부","데이터베이스","스프링","제이에스피"};
		
		Tt1 t1 = new Tt1(s, eng);
		Thread t2 = new Tt1(s, kor);	//업캐스팅
		
		t1.start();
		t2.start();
	}
}
