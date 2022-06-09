package javaReview;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * 	Q.  1 = 데이터입력 	- in()
 * 		2 = 게임 시작 	- out()
 * 		3 = 종료		- end()
 *  		
 * 1. ArrayList에 이름과 id를 저장한다.
 * 	- ArrayList 의 길이값은 5로 지정한다.
 * 2. 이름과 id를 입력받아,
 * 	- 기본에 있는 값이면 "이미 있습니다",
 *  - 없는 값이면 ArrayList에 추가한다.
 *  - "stop" 을 입력하면 함수가 종료된다.
 * 
 * 3. 해당 이름의 ID를 맞추시오 
 *  - 임의의 인덱스번호를 가져와,
 *  - 인덱스번호에 해당하는 이름을 가져온다.
 *  - 이름과 id가 일치하면 "정답", 아니면 "틀림"을 반환한다.
 *  - 정수 '999'를 입력하면 함수가 종료된다.
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
	
	//입력 데이터와 비교하기 위해 기초데이터 입력
	GameRe(){
		a.add(new PersonRe("세종", 123));
		a.add(new PersonRe("정조", 456));
	}
	
	void in() {
		while(true) {
			System.out.println("이름과 id 입력:");
			String name = sc.next();
			
			if(name.equals("stop")) {
				break;
			}
			
			int id = sc.nextInt();
			PersonRe pr =
					new PersonRe(name, id);
			
			if(a.contains(pr)) {
				//a ArrayList에 pr 객체가 있으면
				System.out.printf("%s 는 이미 있습니다", pr.getName());
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
			//ArrayList 크기의 범위에서 난수 발생시켜 n에 저장
			
			PersonRe pr = a.get(n);
			//ArrayList 에서 인덱스 n을 꺼내와서
			
			String str = pr.getName();
			//그 이름을 str에 저장한다
			
			System.out.printf("문제: %s의 id는?", str);
			int id = pr.getId();	//답이 되는 id
			int i = sc.nextInt();	//입력 받는 답
			
			if(i >= 999) {
				break;
			}
			
			if(i == id) {
				System.out.println("정답입니다");
			}
			else {
				System.out.println("틀렸습니다");
			}
			
		}
	}
	
	void end() {
		System.out.println("프로그램이 종료됩니다");
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
			System.out.println("선택하시오 \n "
					+ "1. 데이터입력, 2. 게임시작, 3. 종료, 4. 목록");
			
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