package inheritance;

/*
 * 상속 (inheritance)
 * 부모 클래스 = 슈퍼 클래스(super) = 상위 클래스
 * 자식 클래스 = 서브 클래스(sub) = 하위 클래스
 * 
 *  extens 예약어를 사용함
 *  
 *  상속을 이용하는 이유
 *  -클래스 사이에 변수를 중복 선언하지 않아도 된다.(클래스의 간결화)
 *  -계층적으로 분류를 할 수 있다.(클래스 관리에 용이)
 *  -클래스 재사용과 확장
 *  
 *  
 */

/*
 * 1
class XY {
	private int x, y;
	
	void set(int x, int y) {
		this.x=x;	this.y=y;
	}
	void show() { System.out.println(x +" "+y);	}
}

class XYZ extends XY{
	private String name;
	
	void setname(String a) {
		name = a;
	}
	void pr() {
		show();
		System.out.println(name);
	}
	
}

public class InherEx1 {
	public static void main(String[] args) {
		XY x = new XY();
		x.set(4, 8);
		x.show();
		
		XYZ y = new XYZ();
		y.set(6, 8);
		y.setname("xyz");
		y.pr();
	}
}
 */
/*
 * 2-1.
class Student {
	String name;
	String depart;
	String addr;
	
	Student(String a, String b, String c ){
		name=a; depart=b; addr=c;
	}
	
	void name() {
		System.out.println(name);
	}
	void info() {
		System.out.println(depart +" "+ addr);
	}
}
 */
/*
 * 2-2
class Man{
	String name;
	void name() { System.out.println(name);	}
}

class Student extends Man {
	String depart;
	String addr;
	
	void info() {
		System.out.println(depart +" "+ addr);
	}
}

public class InherEx1 {
	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.name = "세종";
		s1.depart="IT";
		s1.name();
		
		s1.addr="seoul";
		s1.info();
		
	}
}
*/	

class Human {
	String name;
	int age;
	
	void show() {
		System.out.println(name +" "+ age);
	}
}

class Student extends Human {
	String major;	//자식클래스에서 추가되는 인스턴스 변수(name,age,show())그대로 물려받음
	
	void pr() {
		show();
		System.out.println(major);
	}
	
}

public class InherEx1 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name="세종";
		h.age=32;
		h.show();
		
		Student s = new Student();
		s.name="정조";
		s.age=19;
		s.major="컴퓨터공학";
		s.pr();
	}
}	

