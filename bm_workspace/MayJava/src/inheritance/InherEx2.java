package inheritance;

/*
 * �ڽ� ������ ���鶧 �θ������ ȣ���� ù��°�� ����� �Ѵ�..
 * 
 * protected :
 * - ���� ��Ű�� Ŭ������ ���� ����
 * - �ٸ� ��Ű�� Ŭ������ ���� �Ұ���
 * -> ���� ��Ű���� ���� Ŭ������ ���� ����
 * -> �ٸ� ��Ű���� ���� Ŭ������ ���� ���� : ��Ӱ���..
 * 
 * p.244 
 * super ������ �Ű������� �ִ� ������ ȣ���ϱ�
 * - ����Ʈ �����ڰ� �ƴ� �Ű������� �ִ� �����ڸ� ���� �����ؾ� �Ѵ�.
 * 
 * 
 * �����ڰ� �ϳ� ������ �⺻ �����ڰ� ����� ���� �ʴ´�.
 * �Ű������� ���� �������� ��� �θ�Ŭ������ �⺻�����ڰ� ���� ���� ȣ��ȴ�.
 * 
 * super 
 * -> � �����ڸ� ȣ���� ������ ����ϴ� �����.
 * 
 */

/*
 * 1
class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	void name() {
		System.out.println(name);
	}
}

class Student1 extends Person {
	private String major;
	private String subMajor;
	
	Student1(String name, String major, String subMajor){
		super(name);
		this.major = major;
		this.subMajor = subMajor;
	}
	
	void show() {
		name();
		System.out.println(major + subMajor);
	}
}

public class InherEx2 {
	public static void main(String[] args) {
		
		Person p = new Person("����");
		p.name();
		
		Student1 s = new Student1("����", "��ǻ��", "�İ�");
		s.show();
	}
}
*/

class A {
	A(){
		System.out.println("������ A");
	}
	A(int n){
		System.out.println(n);
	}//������ �����ε�
}
class B extends A{
	B(){
		System.out.println("������ B");
	}
	B(int n){
		super(n);
		// �θ�Ŭ������ �Ű������� �ִ� �����ڰ� ȣ��ȴ�.
		// ������ �⺻ �����ڰ� ȣ��ȴ�.
		//
		System.out.println(n);
	}//������ �����ε�
}

public class InherEx2 {
	public static void main(String[] args) {
		B b = new B(7);	//������ ȣ��
	}
}
