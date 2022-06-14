package test0613;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Worker {
	private int id;
	private String name;
	private String part;
	private String addr;
	private String birth;

	Worker(int id, String name, String part, String addr, String birth) {
		this.id = id;
		this.name = name;
		this.part = part;
		this.addr = addr;
		this.birth = birth;
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

	public String toString() {
		return "이름:" + getName()+ "\n사번:" + getId() + "\n부서:" + getPart() +
				"\n주소:" + getAddr() + "\n생일:" + getBirth();
	}
	
	void show() {
		System.out.println(
				"이름:" + getName() + "\n부서:" + getPart() +
				"\n주소:" + getAddr() + "\n생일:" + getBirth());
	}
	
}

public class JavaTest07Worker {
	public static void main(String[] args) {

		HashSet<Worker> h = new HashSet<Worker>();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("<사원정보관리프로그램>");
			System.out.println(
					"1. 사원정보입력\n" + "2. 사원정보 개별조회\n" +
					"3. 프로그램 종료\n" + "4. 전체명단조회");
			int chk = sc.nextInt();

			switch (chk) {
			case 1:
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
				h.add(new Worker(id, name, part, addr, birth));
				break;
			// 123 세종 사무 서울시 12.5
			// 456 태조 총무 부산시 10.15
			case 2:
				System.out.println("검색하고자 하는 사원의 사번은?");
				int schId = sc.nextInt();

				Iterator<Worker> it = h.iterator();
				while(it.hasNext()) {
					Worker num = it.next();
					if(schId == num.getId()) {
						num.show();
					}
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
			case 4:
				System.out.println(h);
				break;
			}
		}

	}
}
