package inheritance;

/*
 * ��� (inheritance)
 * �θ� Ŭ���� = ���� Ŭ����(super) = ���� Ŭ����
 * �ڽ� Ŭ���� = ���� Ŭ����(sub) = ���� Ŭ����
 * 
 *  extens ���� �����
 *  
 *  ����� �̿��ϴ� ����
 *  -Ŭ���� ���̿� ������ �ߺ� �������� �ʾƵ� �ȴ�.(Ŭ������ ����ȭ)
 *  -���������� �з��� �� �� �ִ�.(Ŭ���� ������ ����)
 *  -Ŭ���� ����� Ȯ��
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
		
		s1.name = "����";
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
	String major;	//�ڽ�Ŭ�������� �߰��Ǵ� �ν��Ͻ� ����(name,age,show())�״�� ��������
	
	void pr() {
		show();
		System.out.println(major);
	}
	
}

public class InherEx1 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name="����";
		h.age=32;
		h.show();
		
		Student s = new Student();
		s.name="����";
		s.age=19;
		s.major="��ǻ�Ͱ���";
		s.pr();
	}
}	

