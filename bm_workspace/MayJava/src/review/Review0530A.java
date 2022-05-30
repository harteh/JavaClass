package review;

/*
 * 1.	Interface를 상속받은 Calcu클래스를 작성해라. 
 * Main()에서 a,b에 대해 적절한 값을 설정해라.

interface Cal {
	int total(int a, int b); 	//a부터 b까지의 합 리턴
	int big(int a, int b); 		//a,b중 큰 값 리턴
}
class Calcu implements Cal {
	public int total(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public int big(int a, int b) {
		return a > b ? a : b; 
	}
	
}

public class Review0530A {
	public static void main(String[] args) {
		Calcu ca = new Calcu();
		ca.total(3,  10);
		ca.big(3, 10);
	}
}
*/
/*
 * 2.	Main()를 보고 “쓰레드1”을 출력하시오

class Th implements Runnable  {
	String name;
	Th(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println(name);
	}
}
public class Review0530A {
	public static void main(String[] args) {
		Th t=new Th("쓰레드 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
*/

/*
 * 3.	Main()를 보고 클래스 작성해라. 
 * (0~10까지 1초동안 잠을 잔 후 깨워라) 

class Timer extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				sleep(1000);
			} catch (Exception e) { }
			System.out.println(i+1);
		}
	}
}
public class Review0530A {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();
	}
}
*/
/*
 * 4.	다음 코드를 보고 AThread클래스를 작성해라. 
 * (1부터 100까지 합 출력)
 * 두 쓰레드가 충돌하지 않게 join()도 활용해라.

class Total{
	int sum;
	Total() {
		sum=0; 
	}
	void total(int n) {
		sum+=n; 
	}
	int get() {
		return sum; 
	}
}
class AThread extends Thread {
	int a, b;
	int sum;
	
	AThread (Total t, int a, int b) {
		for (int i=a; i < b; i++) {
			t.total(i);
		}
		sum = t.get();
	}
	
	public synchronized void run() {
		System.out.println(sum);
	}	
}

public class Review0530A {
	public static void main(String[] args) {

		Total t=new Total();
		AThread a=new AThread(t, 1, 50);
		AThread b=new AThread(t, 51, 100);
		a.start(); b.start();

	}
}
*/

/*
 * 5.	main()에 이렇게 주고, Figure인터페이스 만들어 
 * 	circle_area()에는 원면적, 
 * 	rec_area()에는 사각형 면적 출력해라.
 */

interface Figure {
	public void circle_area();
	public void rec_area();
}
class Circle2 implements Figure{
	int r;
	final double PI = 3.14;
	
	Circle2(int r) {
		this.r=r;
	}
	
	public void circle_area() {
		System.out.println((r*r*PI));
	}
	public void rec_area() {
		System.out.println("사각형이 아닙니다.");
	}
}

class Rec implements Figure {
	int a, b;
	Rec(int a, int b){
		this.a=a;	this.b=b;
	}
	
	public void circle_area() {
		System.out.println("원이 아닙니다.");
	}
	public void rec_area() {
		System.out.println(a*b);
	}
	
}
public class Review0530A {
	public static void main(String[] args) {

		Figure f1=new Circle2(5);
		Figure f2=new Rec(2,5); 
		f1.circle_area(); 
		f2.rec_area();

	}
}
