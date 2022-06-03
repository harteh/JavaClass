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
		a.add(new Person3("세종", 123));
		a.add(new Person3("세조", 456));
		a.add(new Person3("정조", 789));
		a.add(new Person3("태조", 357));
	}
	
	void in() {
		while(true) {
			System.out.println("이름, id 입력:");
			String name=sc.next();
			
			if(name.equals("stop")) {
				break;
			}
			
			int id = sc.nextInt();
			Person3 pp = new Person3(name, id);		//Person 객체 생성
			
			if(a.contains(pp)) {
				System.out.println(pp.getName()+"은 이미 있습니다.");
			}
			else {
				a.add(pp);	//값이 없으면 ArrayList에 추가한다
			}
		}
	}
	
	void out() {
		while(true) {
			Random r = new Random();	//난수 발생시키는 클래스
			int n = r.nextInt(a.size());
				//0~4 사이의 난수 발생시켜 n에 저장
			Person3 p = a.get(n);		//인덱스n을 꺼내서 
			String str = p.getName();	//이름을 str에 저장한다.
			
			System.out.println(str+"의 id? ");
			int id = p.getId();
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();	//
			
			if(i == 999) {
				break;
			}
			if(i == p.getId()) {
				System.out.println("정답");
			}
			else {
				System.out.println("정답아님");
			}
		}
	}
	
	void end() {
		System.out.println("종료");
		System.exit(0);		//프로그램 종료
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
