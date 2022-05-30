package javaReview;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ����������
 * 	private -> default -> protected -> public
 * 		private : �ش� Ŭ���������� ���� ����
 * 		default : �ش� ��Ű�������� ���� ����
 * 		protected : ���� ��Ű�� & �ش� Ŭ������ ��ӹ��� �ٸ� ��Ű������ ���ٰ���
 * 		public : � Ŭ���������� ���� ����
 * 
 * this : �ν��Ͻ� �ڽ��� ����Ű�� ��������
 * this() : ������
 * 	
 *  this ���� ������ ����Ͽ� �ν��Ͻ� ������ ���� ����.
 *  - �ν��Ͻ� �޼ҵ忡���� ��밡��
 *  - !!Ŭ���� �޼ҵ忡���� ��� �Ұ�
 *  
 *  this() : ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
 *   - ������ ���ο����� ��밡��
 ********
 * super 
 * 	: �θ� Ŭ������ ����� ���� ����
 * 	 �ν��Ͻ� �޼ҵ忡�� ��밡��, Ŭ���� �޼ҵ忡 ��� �Ұ�.
 * super() �޼ҵ�
 * 	: �θ� Ŭ������ ������ ȣ��
 *
 */
/*
 * 1.

class Book {
	private String title, author;	//�ν��Ͻ� ����
	
	Book(String title, String author) {
		this.title=title;	this.author=author;
		info();
	}
	Book(String t){
		this(t, "���� �̻�");
	}
	Book(){
		this("������ ȣ��!", "");
	}
	void info() {
		System.out.println(title +" "+ author);
	}
	
}
public class Re0527 {
	public static void main(String[] args) {
		Book b1 = new Book("���� �ż���", "�ô��� �佽��");
		Book b2 = new Book("�� �غ�");
		Book b3 = new Book();
	}
}
*/
/*
 * 2 

class Friend {
	private String name;
	private String phone;
	
	Friend(String name, String phone){
		this.name=name;		this.phone=phone;
	}
	String get() {
		return name+" "+phone;
	}
}

class ITFriend extends Friend {
	private String major;
	
	ITFriend(String n, String p, String m){
		super(n, p);
		major = m;
	}
	
	void show(){
		System.out.println( major+" "+super.get() );
	}
}

public class Re0527 {
	public static void main(String[] args) {
		ITFriend it = new ITFriend("ȫ�浿", "010-111-1111", "��ǻ��");
		it.show();
	}
}
*/
/*
 * 3 

public class Re0527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int num;
		
		for(int i=0; i<5; i++) {
			try {
				num = sc.nextInt();
				System.out.println((i+1)+"��° ����: "+num);
				sum+=num;
			}
			catch(InputMismatchException  e) {
				System.out.println("������ �Է� �����մϴ�. �ٽ� �Է��ϼ���.");
				sc.next();
				i--;
				continue;
			}
		}
		System.out.println("����: "+sum);
	}
}
*/
/*
 * 4 

public class Re0527 {
	public static void main(String[] args) {
		Double num1 = new Double(9.5);
		String str1 = num1.toString();
		Double num2 = num1.doubleValue();
	}
}
*/
/*
 * 5 

class Circle {
	private int r;
	
	Circle(int r) {
		this.r = r;
	}
	
	public boolean equals(Object obj){
		if(this.r == ((Circle)obj).r  ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return r+"";
	}
}
public class Re0527 {
	public static void main(String[] args) {
		Circle a = new Circle(30);
		Circle b = new Circle(30);
		
		System.out.println("������: " +a);
		System.out.println("������: " +b);
		
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("�ٸ� ��");
		}
	}
}
*/
/*
 * 6 
 */
interface Po {
	public void pr(int a, String b);
	public void pr(String b);
}

class Point implements Po {
	public void pr(int a, String b) {
		System.out.println(b +"å�� "+a+"��");
	}
	public void pr(String b) {
		System.out.println(b);
	}
}

public class Re0527 {
	public static void main(String[] args) {
		Po p = new Point();
		p.pr(30000, "java");
		p.pr("python");
	}
}

