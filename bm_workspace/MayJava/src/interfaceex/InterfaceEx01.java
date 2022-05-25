package interfaceex;

/*
 * 인터페이스
 * - 함수의 구현을 강제한다.
 * - 구현 객체의 같은 동작을 강제한다.
 */

/*
 * 1

interface Food {
	int price = 30000;	//상수
	void eat();			//추상메서드
}

class Pizza implements Food {
	public void eat() {	//public 항상 붙여서 구현해야한다.
		System.out.println("피자를 먹는다.");
	}
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		Pizza piz = new Pizza();
		piz.eat();
		System.out.println(piz.price);
	}
}
*/

/*
 * 2

interface Addin {
	public int add(int a, int b);
	public int add(int a);
	
	default void pr() {		//자바8에서 추가된 디폴트 메서드
		System.out.println("하하");
	}
	//default라는 예약어를 적지 않으면 다 추상메소드로 인식한다.
}
class Add implements Addin {
	public int add(int a, int b) {
		return a+b;
	};
	public int add(int a) {
		int sum=0;
		for (int i=1; i<=a; i++) {
			sum+=i;
		}
		return sum;
	};
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		
		Add a = new Add();
		System.out.println(a.add(1, 4));
		System.out.println(a.add(10));	//1-10까지 합구하기
		a.pr();
	}
}
*/

interface Animal{
	void bear();
}

interface Fish{
	public void swim();
}

class A implements Animal, Fish {	//인터페이스 다중 상속
	public void bear() {
		System.out.println("낳는다");
	};
	public void swim() {
		System.out.println("수영한다.");
	};
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		A a = new A();
		a.bear();
		a.swim();
	}
}
