package interfaceex;

interface IT {
	public void java();
}
class Student {
	public void study(IT it) {
		it.java();
	}
}
class ITStudent implements IT {
	public void java() {
		System.out.println("자바 공부");
	}
}

class DBStudent implements IT {
	public void java() {
		System.out.println("데이터베이스 공부");
	}
}

/*
 * ITStudent 와 DBStudent 는 IT 인터페이스를 받아서 추상메서드 java()를 구현한다. 
 * s.study(i) : 는 Student 클래스에 접근, 업캐스팅
 * 		s.study(i);	 //IT it = new ITStudent();
 * 		동적바인딩
 */

public class InterfaceEx04 {
	public static void main(String[] args) {

		Student s = new Student();
		ITStudent i = new ITStudent();
		DBStudent d = new DBStudent();
		
		s.study(i);
		s.study(d);
		
	}
}
