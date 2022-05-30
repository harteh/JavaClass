package review;

/*
 * 1.	Interface�� ��ӹ��� CalcuŬ������ �ۼ��ض�. 
 * Main()���� a,b�� ���� ������ ���� �����ض�.

interface Cal {
	int total(int a, int b); 	//a���� b������ �� ����
	int big(int a, int b); 		//a,b�� ū �� ����
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
 * 2.	Main()�� ���� ��������1���� ����Ͻÿ�

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
		Th t=new Th("������ 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
*/

/*
 * 3.	Main()�� ���� Ŭ���� �ۼ��ض�. 
 * (0~10���� 1�ʵ��� ���� �� �� ������) 

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
 * 4.	���� �ڵ带 ���� AThreadŬ������ �ۼ��ض�. 
 * (1���� 100���� �� ���)
 * �� �����尡 �浹���� �ʰ� join()�� Ȱ���ض�.

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
 * 5.	main()�� �̷��� �ְ�, Figure�������̽� ����� 
 * 	circle_area()���� ������, 
 * 	rec_area()���� �簢�� ���� ����ض�.
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
		System.out.println("�簢���� �ƴմϴ�.");
	}
}

class Rec implements Figure {
	int a, b;
	Rec(int a, int b){
		this.a=a;	this.b=b;
	}
	
	public void circle_area() {
		System.out.println("���� �ƴմϴ�.");
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
