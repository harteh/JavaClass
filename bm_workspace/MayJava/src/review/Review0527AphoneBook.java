package review;

import java.util.Scanner;

class PhoneNum {
	String name;
	String phone;
	
	PhoneNum(String n, String p){
		name=n;		phone=p;
	}
	
	void show() {
		System.out.println("이름: " +name);
		System.out.println("번호: " +phone);
	}
	
}

class School extends PhoneNum {
	String major;
	
	School(String n, String p, String m){
		super(n, p);	//부모생성자 호출
		major = m;		//major 초기화
	}
	
	void show() {	//오버라이딩
		super.show();
		System.out.println("전공: "+major);
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
		System.out.println("직급: " +grade);
	}
}

//객체배열 만들기
class Arr {
	PhoneNum [] ary;
	int n;	//배열 개수
	
	Arr(int n){
		ary = new PhoneNum[n];	//배열 생성
		n = 0;
	}
	
	void add(PhoneNum p) {
		ary[n++] = p;	//친구 추가
	}
	
	void friend(char ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
		System.out.println("번호:");
		String num = sc.next();
		
		switch(ch) {
		case 'A':
			System.out.println("전공:");
			String major = sc.next();
			
			add( new School(name, num, major) );
			break;
			/*  **** 학교친구 추가하기 작업 ****
			 * 전공까지 입력받고
			 * 학교친구객체(School)을 만들어서
			 * add() 함수를 통해서 객체배열에 추가한다.
			 */
		
		case 'B':
			System.out.println("직급:");
			String grade = sc.next();
			add( new Worker(name, num, grade) );
			break;
		}
	}
	
	void all() {	//친구목록 전체출력
		for(int i=0; i<n; i++) {
			ary[i].show();
		}
	}
	
}


public class Review0527AphoneBook {
	public static void main(String[] args) {
		
		Arr ar = new Arr(5);	//객체배열 5개
		
		while(true) {
			System.out.println("A. 학교 친구 정보");
			System.out.println("B. 직장 동료 정보");
			System.out.println("C. 종료");
			System.out.println("D. 출력");
			
			System.out.println("문자 입력:");
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
				System.out.println("종료");
				return;		//메인함수 종료
			case'D':
				ar.all();
			}
			
		}
		
	}
}
