package review;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1
 
class Tv {
	String name;
	int year;
	int size;
	
	Tv(String name, int year, int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	
	void show() {
		System.out.println(year+"�⿡ "+name+"���� ���� "+size+"��ġ TV" );
	}
}
public class Review0525A {
	public static void main(String[] args) {
		Tv t = new Tv("�Ｚ", 2022, 20);
		t.show();   //2022�⿡ �Ｚ���� ���� 20��ġ Tv ���
	}
}
*/

/*
 * 2

class Score {
	int math, eng, com;
	
	Score(int math, int eng, int com){
		this.math = math;		this.eng = eng;		this.com = com;
	}

	double avg() {
		return (math+eng+com)/3.0; 
	}
}

public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		Score s= new Score(math, eng, com);
		System.out.println("����� " + s.avg());
	}
}
 */

/*
 * 2-1

class Score {
	int math, eng, com;
	
	Scanner sc = new Scanner(System.in);
	
	Score(int math, int eng, int com){
		math = sc.nextInt();	eng = sc.nextInt();		com = sc.nextInt();
		this.math = math;		this.eng = eng;		this.com = com;
	}

	double avg() {
		return (math+eng+com)/3.0; 
	}
}

public class Review0525A {
	public static void main(String[] args) {
		
		int math=0; int eng=0; int com=0;
		
		Score s= new Score(math, eng, com);
		System.out.println("����� " + s.avg());
	}
}
 */

/*
 * 3
 * ���� CircleŬ������ Ȱ���Ͽ� Circle ��ü�迭�� �����ϰ�, 
 * 5���� �� �������� �Է¹޾� �迭�������� ��, ���� ������ ���� ����ض�.
 
class Circle1 {

	private double r;

	Circle1(double r){
		this.r=r;
	}

	double area() {
		return 3.14 * r * r;
	}

}

public class Review0525A {
	public static void main(String[] args) {
		Circle1 cir[] = new Circle1[5];
		
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���: ");
		for(int i=0; i<cir.length; i++) {
			double r=sc.nextDouble();
			cir[i] = new Circle1(r);
			
			sum += cir[i].area();
		}
		System.out.printf("���� ������ ��: %.2f\n", sum);
	}
}
*/

/*
 * 4
 
class XY {
	int a, b;
	
	void set(int a, int b){
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println(a +" "+b);
	}
}

class XYZ extends XY {
	String color;
	
	void color(String color) {
		this.color = color;
	}
	
	void show() {
		super.show();
		System.out.println(color);
		//superŰ���带 �̿��� �������ε��� �Ͽ� �θ� Ŭ������ ����� ���� ����
		//System.out.println(a+", "+b+", "+color);
	}
}

public class Review0525A {
	public static void main(String[] args) {
		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 ���

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue ���   
	}
}
*/

/*
 * 5 �� ����� ������������ �Ѵ�. 
 * ����,����,�� �� �ϳ��� ���ڿ��� �Է¹޾� 
 * ���� �̰���� �Ǵ��ϴ� ���α׷����ۼ��ض�.(��ø if�� ����ؾ���, ���ڿ� ��)

public class Review0525A {
	public static void main(String[] args) {
		
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		a=sc.next();
		System.out.println("ö��: ");
		b=sc.next();
		
		if(a.equals("����")) {
			if(b.equals("��")) {
				System.out.println("������ �̰��.");
			}
			else if(b.equals("����")) {
				System.out.println("ö���� �̰��.");
			}
			else if(b.equals("����")) {
				System.out.println("����.");
			}
		}
		
		if(a.equals("����")) {
			if(b.equals("��")) {
				System.out.println("ö���� �̰��.");
			}
			else if(b.equals("����")) {
				System.out.println("����.");
			}
			else if(b.equals("����")) {
				System.out.println("������ �̰��.");
			}
		}
		
		if(a.equals("��")) {
			if(b.equals("��")) {
				System.out.println("����.");
			}
			else if(b.equals("����")) {
				System.out.println("������ �̰��.");
			}
			else if(b.equals("����")) {
				System.out.println("ö���� �̰��.");
			}
		}
	}
}
*/

/*
 * 6. ���� 10���� �������� �Է��Ͽ� ���������������Ľ��Ѽ� ����ض�.
public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	//12 54 295 4 17 2 36 75 12 52
		
		int temp;	//�����
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {			//0-9
			for(int j=0; j<arr.length -i -1; j++) {	//0-9,8,
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}
}
*/

/*
 * 6-1. ���� 10���� �������� �Է��Ͽ� ���������������Ľ��Ѽ� ����ض�.
 */
public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();	//12 54 295 4 17 2 36 75 12 52
		}
		
		for(int i=0; i<arr.length; i++) {			//0-9
			Arrays.sort(arr);
			System.out.print(arr[i] +" ");
		}
		
	}
}