package inheritance;

/*
 * 동적바인딩(dynamic binding)
 * 실행할 메서드를 컴파일 할때 결정하지 않고 실행 시(run time)에 결정하는 것
 * 
 * 자바에서는 동적 바인딩을 통해 오버라이딩된 메서드가 항상 실행되도록 보장한다.
 * 
 * => 동적바인딩에 의해 항상 자식 클래스에 오버라이딩한 메소드가 호출됨
 * => 그럼 부모 클래스의 메서드는 더이상 쓸 수 없는가?
 * => 아니다. super키워드를 이용해 정적바인딩을 하여 부모 클래스의 멤버에 접근 가능하다. 
 */

class Food {
	void eat() {
		System.out.println("eat");
	}
}

class Pizza extends Food {
	void eat() {
		System.out.println("pizza");
	}
}
class Pasta extends Food {
	void eat() {
		System.out.println("pasta");
	}
}
class Chicken extends Food {
	void eat() {
		System.out.println("chicken");
	}
}

public class InherEx10Poly {
	
	static void pr(Food f) {
		f.eat();	//메인에서 호출하기 위해 공유	//동적바인딩
	}
	
	public static void main(String[] args) {

		Pizza p = new Pizza();
		pr(p);		//Food f = new Pizza();	//업캐스팅
		
		pr(new Pasta());	//Food f = new Pasta();	//업캐스팅
		pr(new Chicken());
	}
}
