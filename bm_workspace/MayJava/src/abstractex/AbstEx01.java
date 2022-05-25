package abstractex;

/*
 * 추상메소드 (abstract method)
 * 추상클래스 (abstract class)
 *   1. 추상 메소드를 최소 한개 이상 가지고 abstract 로 선언된 클래스
 *   2. 추상 메소드가 없어도 abstract 로 선언한 클래스
 * => ★★★★★★ 추상 클래스의 객체 생성할 수 없다 ★★★★★★
 *   
 *   - 추상메소드와 일반메소드 모두 들어갈 수 있다.
 *   - 상속받아 서브클래스에서 다형성을 실현하기 위해서 사용.
 *   
 *  추상메소드 (abstract method)는 일반 클래스 안에 들어갈 수 없다.
 *  - 반드시 추상 클래스 안에 있어야 한다.
 *  
 *  
 */

/*
 * 1
abstract class Car {
	String name;	//필드
	void run() {	//일반적인 메소드
		System.out.println("차가 움직인다.");
	}
	abstract void stop();	//추상 메소드(빈껍데기 함수)
}

class Cars extends Car {
	Cars(){
		name = "인피니티";
	}
	void stop(){	//오버라이딩
		System.out.println("차가 멈춘다.");
	}
}

public class AbstEx1 {
	public static void main(String[] args) {

		Cars c = new Cars();
		c.run();
		c.stop();
	}
}
*/

abstract class Ca {
	abstract int add(int a, int b);	
	abstract double avg(int a[]);
}

class Cal extends Ca {
	int add(int a, int b) {
		return a+b;
	}
	double avg(int a[]) {
		int sum=0;
		int size = a.length;
		for(int i=0; i<size; i++) {
			sum+= a[i];
		}
		return (double)sum/size;
	}
}


public class AbstEx01 {
	public static void main(String[] args) {
		Cal c= new Cal();
		System.out.println(c.add(3,7));		//두수합
		System.out.println(c.avg(new int[]{1,2,4}));  //배열의 평균
	}
}
