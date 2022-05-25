package inheritance;

/*
 * 다운캐스팅을 하기 전에 상위 클래스로 형변환된 인스턴스의
 * 원래 자료형을 확인해야 변환할 때 오류를 막을 수 있다.
 */

/*
 * 1
 
class Person {}
class Student3 extends Person{}
class Entertainer extends Person{}
class Singer extends Entertainer{}

public class InherEx7Instanceof {
	
	static void pr(Person p) {
		if(p instanceof Person) {
			System.out.println("사람");
		}
		if(p instanceof Student3) {
			System.out.println("학생");
		}
		if(p instanceof Entertainer) {
			System.out.println("연예인");
		}
		if(p instanceof Singer) {
			System.out.println("가수");
		}
	}
	
	public static void main(String[] args) {
		pr(new Student3());		//pr(Person p = new Student3());
		//사람 학생
		pr(new Entertainer());	//Person p = new Entertainer()
		//사람 연예인
		pr(new Singer());		//Person p = new Singer()
		//사람 연예인 가수
	}
}
*/

/* 2 */
class Person{}
class Student1 extends Person{}
class Worker extends Person{}
class ITWorker extends Worker{}

public class InherEx7Instanceof {
	
	static void show(Person p) {
		if(p instanceof Person) {
			System.out.println("사람");
		}
		if(p instanceof Student1) {
			System.out.println("학생");
		}
		if(p instanceof Worker) {
			System.out.println("직장인");
		}
		if(p instanceof ITWorker) {
			System.out.println("IT종사자");
		}
	}
	
	public static void main(String[] args) {
		show(new Person());
		show(new Worker());
		show(new ITWorker());
	}
}
