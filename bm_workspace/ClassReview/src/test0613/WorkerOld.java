package test0613;

import java.util.Scanner;

class PhoneBook {
	private int id;
	private String name;
	private String part;
	private String addr;
	private String birth;
	
	PhoneBook(int id, String name, String part, String addr, String birth){
		this.id= id;	this.name=name;	this.part=part;	this.addr=addr;	this.birth=birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	void show() {
		System.out.println("이름:"+getName());
		System.out.println("부서:"+getPart());
		System.out.println("주소:"+getAddr());
		System.out.println("생일:"+getBirth());
	}
	
}

class Arr {
	PhoneBook[] arr;
	int n;
	
	Arr(int n){
		arr = new PhoneBook[n];
		n=0;
	}
	void add(PhoneBook p) {
		arr[n++] = p;
	}
	void WorkerOld() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번:");
		int id = sc.nextInt();
		System.out.println("이름:");
		String name = sc.next();
		System.out.println("부서:");
		String part = sc.next();
		System.out.println("주소:");
		String addr = sc.next();
		System.out.println("생일:");
		String birth = sc.next();
		System.out.println("사원정보가 입력되었다.");
		
		add(new PhoneBook(id, name, part, addr, birth));
	}
	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 사원의 사번:");
		int chkId = sc.nextInt();
		
		
		arr[1].show();
	}
}

public class WorkerOld {
	public static void main(String[] args) {

		Arr ad = new Arr(5);
		
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1. 사원정보 입력\n2. 사원정보 개별 조회\n3. 프로그램종료");
			
			Scanner sc = new Scanner(System.in);
			int chk = sc.nextInt();
			
			switch(chk) {
			case 1:
				ad.WorkerOld();
				break;
			case 2:
				ad.show();
				break;
			case 3:
				System.out.println("종료");
				return;
			}
			
		}
	}
}
