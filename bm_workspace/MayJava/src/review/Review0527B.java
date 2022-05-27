package review;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1 this() -> �ٸ������� ȣ��
 * ���� ���) 
 * ���� �ż��� �ô��� �佽��
 * �� �غ� �۰� �̻�
 * ������ ȣ��!! 
 
class Book {
	String title;
	String author;
	
	Book(){
		this("������ ȣ��!!", "");
	}
	Book(String title){
		this(title, "�۰��̻�");	//�Ķ���Ͱ� 2���� ������ ȣ��
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
		show();
	}
	
	void show() {
		System.out.println(title+" "+author);
	}
}

public class Review0527B {
	public static void main(String[] args) {
		Book b1=new Book("���� �ż���", "�ô��� �佽��");
		Book b2=new Book("�� �غ�");
		Book b3=new Book();

	}
}
*/

/*
 * 2  FriendŬ������ ��ӹ��� ITFriendŬ�����������ض�.

class Friend {
	private String name;
	private String phone;
	
	Friend(String name, String phone){
		this.name=name;		this.phone=phone;
	}
	
	String get() {
		return name+ " "+ phone;
	}
}

class ITFriend extends Friend {
	String major;
	ITFriend(String n, String p, String m){
		super(n, p);
		major=m;
	}
	void show() {
		System.out.println( major+", " +super.get()  );
	}
}

public class Review0527B {
	public static void main(String[] args) {
		 ITFriend it=new ITFriend("ȫ�浿", "010-111-1111", "��ǻ��");
		 it.show();
	}
}
*/

/*
 * 3. 5�� ������ �Է¹޾� ���� ���ϴ� ���α׷�.
 * ����, ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� 
 * InputMismatchException���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �ۼ��ض�.
 * ���� ���) 	1��° ����: 1
 * 				2��° ����: a
 * 				�ٽ� �Է��ض�. �����ƴϴ�.
 * 				2��° ���� : 2
 * 				3��° ���� : 3
 * 				4��° ����: 4
 * 				5��° ����: 5           
 * 				����: 15

public class Review0527B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num;
		
		for(int i=0; i<5; i++ ) {
		System.out.println(i+1 +"��° ����: ");
			try {
				num = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է��ض�. �����ƴϴ�.");
				sc.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println(sum);

	}
}
*/

/*
 * 4. �Ǽ� 9.5�� ��üȭ(�ڽ�) ���Ѷ�.
 * 4.1) ��üȭ ��Ų 9.5�� ���ڿ��� �����ض�.
 * 4.2) ���ڿ��� ������ 9.5�� �⺻�������� ��ڽ��ض�.

public class Review0527B {
	public static void main(String[] args) {
		
		Double d = new Double(9.5);
		Double dd = 9.5;
		
		String s = d.toString();
		String ss = Double.toString(d);
		
		Double d2 = Double.valueOf(s);		//�ڽ�
		double dd2 = Double.parseDouble(s);	//��ڽ�
		double dd3 = d2.doubleValue();		//��ڽ�
		
	}
}
*/

/*
 * 5. equals(�� ���� ������ ������ ��),  
 * 	  toString�޼ҵ带 ����Ͽ� �ϼ����Ѷ�. (�������� 30��)

class Circle1 {
	private int r;
	Circle1(int r) {
		this.r=r;
	}
	
	public boolean equals(Object ob) {	//Object ob = new Circle();
		if(this.r == ((Circle1)ob).r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString(){
		return r+"";
	}
}

public class Review0527B {
	public static void main(String[] args) {
		
		Circle1 a=new Circle1(30);
		Circle1 b=new Circle1(30);

        System.out.println("������: "+a);
        System.out.println("������: "+b);

        // ������ ���ϴ� ���̱� ������ ������ �ؾ��Ѵ�.
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
 * 6  �������̽� Po�� ����� �߻�޼ҵ� pr�� ������. 
 * 		��ӹ޾� �����ض�.
 * 	���� ���) 
 * 		javaå��30000��
 *  	python
 */
interface Po {
	public void pr(int p, String t);
	public void pr(String t);
}

class Point implements Po {		
	public void pr(int p, String t) {
		System.out.println(t +"å�� "+p);
	}
	
	public void pr(String t) {
		System.out.println(t);
	}
}

public class Review0527B {
	public static void main(String[] args) {
		
        Po p=new Point();
        p.pr(30000,"java");
        p.pr("python");
	}
}

