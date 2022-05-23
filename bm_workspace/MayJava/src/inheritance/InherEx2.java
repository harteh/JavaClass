package inheritance;

/*
 * 자식 생성자 만들때 부모생성자 호출을 첫번째에 적어야 한다..
 * 
 * protected :
 * - 같은 패키지 클래스에 접근 가능
 * - 다른 패키지 클래스에 접근 불가능
 * -> 같은 패키지의 서브 클래스에 접근 가능
 * -> 다른 패키지의 서브 클래스에 접근 가능 : 상속개념..
 * 
 * p.244 
 * super 예약어로 매개변수가 있는 생성자 호출하기
 * - 디폴트 생성자가 아닌 매개변수가 있는 생성자를 직접 구현해야 한다.
 * 
 * 
 * 생성자가 하나 있으면 기본 생성자가 만들어 지지 않는다.
 * 매개변수를 가진 생성자의 경우 부모클래스의 기본생성자가 가장 먼저 호출된다.
 * 
 * super 
 * -> 어떤 생성자를 호출할 것인지 명시하는 예약어.
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
		
		Person p = new Person("세종");
		p.name();
		
		Student1 s = new Student1("정조", "컴퓨터", "컴공");
		s.show();
	}
}
*/

class A {
	A(){
		System.out.println("생성자 A");
	}
	A(int n){
		System.out.println(n);
	}//생성자 오버로딩
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
	B(int n){
		super(n);
		// 부모클래스의 매개변수가 있는 생성자가 호출된다.
		// 없으면 기본 생성자가 호출된다.
		//
		System.out.println(n);
	}//생성자 오버로딩
}

public class InherEx2 {
	public static void main(String[] args) {
		B b = new B(7);	//생성자 호출
	}
}
