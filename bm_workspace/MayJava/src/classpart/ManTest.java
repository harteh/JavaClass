package classpart;

class Man {
	int age;
	String name;
	boolean married;
	int child;
	
	void show() {
		System.out.println("이 사람의 나이: " +age);
		System.out.println("이 사람의 이름: " +name);
		System.out.println("이 사람의 결혼여부: " +married);
		System.out.println("이 사람의 자녀 수: " +child);
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
