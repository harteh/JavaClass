package review;

import java.util.Scanner;

class PhoneNum {
	String name;
	String phone;
	
	PhoneNum(String n, String p){
		name=n;		phone=p;
	}
	
	void show() {
		System.out.println("�̸�: " +name);
		System.out.println("��ȣ: " +phone);
	}
	
}

class School extends PhoneNum {
	String major;
	
	School(String n, String p, String m){
		super(n, p);	//�θ������ ȣ��
		major = m;		//major �ʱ�ȭ
	}
	
	void show() {	//�������̵�
		super.show();
		System.out.println("����: "+major);
	}
}

class Worker extends PhoneNum {
	String grade;
	
	Worker(String n, String p, String g){
		super(n, p);
		grade = g;
	}
	
	void show() {
		show();
		System.out.println("����: " +grade);
	}
}

//��ü�迭 �����
class Arr {
	PhoneNum [] ary;
	int n;	//�迭 ����
	
	Arr(int n){
		ary = new PhoneNum[n];	//�迭 ����
		n = 0;
	}
	
	void add(PhoneNum p) {
		ary[n++] = p;	//ģ�� �߰�
	}
	
	void friend(char ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�:");
		String name = sc.next();
		System.out.println("��ȣ:");
		String num = sc.next();
		
		switch(ch) {
		case 'A':
			System.out.println("����:");
			String major = sc.next();
			
			add( new School(name, num, major) );
			break;
			/*  **** �б�ģ�� �߰��ϱ� �۾� ****
			 * �������� �Է¹ް�
			 * �б�ģ����ü(School)�� ����
			 * add() �Լ��� ���ؼ� ��ü�迭�� �߰��Ѵ�.
			 */
		
		case 'B':
			System.out.println("����:");
			String grade = sc.next();
			add( new Worker(name, num, grade) );
			break;
		}
	}
	
	void all() {	//ģ����� ��ü���
		for(int i=0; i<n; i++) {
			ary[i].show();
		}
	}
	
}


public class Review0527AphoneBook {
	public static void main(String[] args) {
		
		Arr ar = new Arr(5);	//��ü�迭 5��
		
		while(true) {
			System.out.println("A. �б� ģ�� ����");
			System.out.println("B. ���� ���� ����");
			System.out.println("C. ����");
			System.out.println("D. ���");
			
			System.out.println("���� �Է�:");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			
			switch(c) {
			case 'A':
				ar.friend(c);
				break;
			case'B':
				ar.friend(c);
				break;
			case'C':
				System.out.println("����");
				return;		//�����Լ� ����
			case'D':
				ar.all();
			}
			
		}
		
	}
}
