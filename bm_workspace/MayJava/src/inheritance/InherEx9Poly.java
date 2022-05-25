package inheritance;
/*
 * 동적바인딩

class Parent {
	void a() {
		pa();
	}
	void pa() {
		pa();	//
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void a() {	//오버라이딩
		super.a();	//부모의 a()함수 호출
	}
	void pa() {
		System.out.println("Child");
	}
}

public class InherEx9Poly {
	public static void main(String[] args) {

		Parent c = new Child();	//업캐스팅
		c.a();	//Child
				//업캐스팅일때 재정의된 메서드가 호출됨
		c.pa();
		
	}
} 
*/
/*
 * 정적바인딩
 */
class Parent {
	int n;
	void a() {
		pa();
	}
	void pa() {
		System.out.println(n);
	}
}

class Child extends Parent {
	int n;
	void pa() {
		n=20;
		super.n =39;
		super.pa();		//정적바인딩
		System.out.println(n);
	}
}

public class InherEx9Poly {
	public static void main(String[] args) {

		Parent c = new Child();	//업캐스팅
		c.a();	//Child
		
	}
} 