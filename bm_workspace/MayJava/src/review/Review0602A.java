package review;

import java.util.Scanner;

/*
 * 1.
 *
class Book {
	private String name;
	private int price;
	
	Book(String name, int price){
		this.name=name;		this.price = price;
	}
	Book(String name){
		this(name, 40000);
	}
	Book(){}
	
	void title () {
		System.out.println(name + " "+price+"��");
	}
}
public class Review0602A {
	public static void main(String[] args) {
		Book b1=new Book("�ڹ�"); 
		b1.title();            //�ڹٴ� 40000��
		Book b2=new Book("���̽�", 30000);
		b2.title();           //���̽� 30000��
	}
}
*/

/*
 * 2.2. 1~100���� �������Է¹޾� 
 * 3,6,9 �� �ϳ��� �ִ� ��� ��¦��, �� �� �ִ� ��� ��¦¦��,
 * �ϳ��� ������ ������������ض�.
 * (�������� 39��� �� ��, n/10=3, n%10=9 �� ���´�.   (/, % ������ Ȱ��))
 *    ���� ���) �Է�:39
 *    ¦¦
 */
public class Review0602A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	//������ �Է¹���
		int chk1 = num/10;	//üũ�� ����
		int chk2 = num%10;	//üũ�� ����
		
		if(chk1==3 || chk1==6 || chk1==9) {
			System.out.print("¦");
		}
		if(chk2==3 || chk2==6 || chk2==9) {
			System.out.print("¦");
		}
		else {
			System.out.println("��");
		}
	}
}
