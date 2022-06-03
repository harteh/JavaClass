package collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person3 {
	private String name;
	private int id;
	
	Person3(String n, int i){
		name=n;		id=i;
	}

	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	
	public boolean equals(Object obj) {
		Person3 p = (Person3)obj;
		if(p.getId()==this.id && (p.getName().equals(this.name))) {
			return true;
		}
		return false;
	}
}

class Game {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person3> a = new ArrayList<Person3>(5);
	
	Game() {
		a.add(new Person3("����", 123));
		a.add(new Person3("����", 456));
		a.add(new Person3("����", 789));
		a.add(new Person3("����", 357));
	}
	
	void in() {
		while(true) {
			System.out.println("�̸�, id �Է�:");
			String name=sc.next();
			
			if(name.equals("stop")) {
				break;
			}
			
			int id = sc.nextInt();
			Person3 pp = new Person3(name, id);		//Person ��ü ����
			
			if(a.contains(pp)) {
				System.out.println(pp.getName()+"�� �̹� �ֽ��ϴ�.");
			}
			else {
				a.add(pp);	//���� ������ ArrayList�� �߰��Ѵ�
			}
		}
	}
	
	void out() {
		while(true) {
			Random r = new Random();	//���� �߻���Ű�� Ŭ����
			int n = r.nextInt(a.size());
				//0~4 ������ ���� �߻����� n�� ����
			Person3 p = a.get(n);		//�ε���n�� ������ 
			String str = p.getName();	//�̸��� str�� �����Ѵ�.
			
			System.out.println(str+"�� id? ");
			int id = p.getId();
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();	//
			
			if(i == 999) {
				break;
			}
			if(i == p.getId()) {
				System.out.println("����");
			}
			else {
				System.out.println("����ƴ�");
			}
		}
	}
	
	void end() {
		System.out.println("����");
		System.exit(0);		//���α׷� ����
	}
}

public class GameTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		
		while(true) {
			System.out.println("1, 2, 3");

			int select = sc.nextInt();
			switch(select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}

	}
}
