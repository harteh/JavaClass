package javaReview;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * 	Q.  1 = �������Է� 	- in()
 * 		2 = ���� ���� 	- out()
 * 		3 = ����		- end()
 *  		
 * 1. ArrayList�� �̸��� id�� �����Ѵ�.
 * 	- ArrayList �� ���̰��� 5�� �����Ѵ�.
 * 2. �̸��� id�� �Է¹޾�,
 * 	- �⺻�� �ִ� ���̸� "�̹� �ֽ��ϴ�",
 *  - ���� ���̸� ArrayList�� �߰��Ѵ�.
 *  - "stop" �� �Է��ϸ� �Լ��� ����ȴ�.
 * 
 * 3. �ش� �̸��� ID�� ���߽ÿ� 
 *  - ������ �ε�����ȣ�� ������,
 *  - �ε�����ȣ�� �ش��ϴ� �̸��� �����´�.
 *  - �̸��� id�� ��ġ�ϸ� "����", �ƴϸ� "Ʋ��"�� ��ȯ�Ѵ�.
 *  - ���� '999'�� �Է��ϸ� �Լ��� ����ȴ�.
 */

class PersonRe {
	private String name;
	private int id;
	
	PersonRe(String n, int i) {
		name = n;	id = i;
	}
	
	String getName () {
		return name;
	}
	int getId() {
		return id;
	}
	
	public boolean equals(Object obj) {
		PersonRe p = (PersonRe)obj;
		
		if(p.getId()==this.id && p.getName()==this.name) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return name+", "+ id;
	}
}

class GameRe {
	Scanner sc = new Scanner(System.in);
	ArrayList<PersonRe> a = new ArrayList<PersonRe>(5);
	
	//�Է� �����Ϳ� ���ϱ� ���� ���ʵ����� �Է�
	GameRe(){
		a.add(new PersonRe("����", 123));
		a.add(new PersonRe("����", 456));
	}
	
	void in() {
		while(true) {
			System.out.println("�̸��� id �Է�:");
			String name = sc.next();
			
			if(name.equals("stop")) {
				break;
			}
			
			int id = sc.nextInt();
			PersonRe pr =
					new PersonRe(name, id);
			
			if(a.contains(pr)) {
				//a ArrayList�� pr ��ü�� ������
				System.out.printf("%s �� �̹� �ֽ��ϴ�", pr.getName());
			}
			else {
				a.add(pr);
			}
		}
	}
	
	void out() {
		while(true) {
			Random r = new Random();
			int n = r.nextInt(a.size());	
			//ArrayList ũ���� �������� ���� �߻����� n�� ����
			
			PersonRe pr = a.get(n);
			//ArrayList ���� �ε��� n�� �����ͼ�
			
			String str = pr.getName();
			//�� �̸��� str�� �����Ѵ�
			
			System.out.printf("����: %s�� id��?", str);
			int id = pr.getId();	//���� �Ǵ� id
			int i = sc.nextInt();	//�Է� �޴� ��
			
			if(i >= 999) {
				break;
			}
			
			if(i == id) {
				System.out.println("�����Դϴ�");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
			
		}
	}
	
	void end() {
		System.out.println("���α׷��� ����˴ϴ�");
		System.exit(0);
	}
	
	void show() {
		for(PersonRe aa : a) {
			System.out.println(aa);
		}
	}
}

public class GameReview {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GameRe g = new GameRe();
		
		while(true) {
			System.out.println("�����Ͻÿ� \n "
					+ "1. �������Է�, 2. ���ӽ���, 3. ����, 4. ���");
			
			int selectNum = sc.nextInt();
			switch(selectNum) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			case 4:
				g.show();
			}
		}
		
	}
}
