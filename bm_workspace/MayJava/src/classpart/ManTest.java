package classpart;

class Man {
	int age;
	String name;
	boolean married;
	int child;
	
	void show() {
		System.out.println("�� ����� ����: " +age);
		System.out.println("�� ����� �̸�: " +name);
		System.out.println("�� ����� ��ȥ����: " +married);
		System.out.println("�� ����� �ڳ� ��: " +child);
	}
}

public class ManTest {
	public static void main(String[] args) {
		Man m1 = new Man();
		
		m1.age = 40;
		m1.name = "James";
		m1.married = true;
		m1.child = 3;
		
		m1.show();

	}
}
