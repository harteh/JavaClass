package review;

import java.util.Scanner;

/*
 * 1. Cal은 인터페이스, a,b,는 두 정수를 입력받아 a부터 b까지 총합
 *
interface Cal {
	public int cal(int a, int b);
}

class Show implements Cal {
	int sum=0;
	public int cal(int a, int b) {
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}

public class Review0602B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		Cal c = new Show();
		System.out.println( c.cal(a,b) );
		
	}
}
*/
/*
 * 2. Gen클래스를 만들어라.
 */
class Gen<T> {
	T t, t1;
	
	public Gen(T t, T t1) {
		this.t=t;	this.t1=t1;
	}
	
	T one() {
		return t;
	}
	T two() {
		return t1;
	}
	
//	Boolean three() {
//		if(t.equals(t1)) {
//			return true;
//		}
//		return false;
//	}
	
	boolean three() {
		return t.equals(t1);
	}
}

public class Review0602B {
	public static void main(String[] args) {
		Gen<String> g = new Gen<String>("seoul","busan");
		System.out.println(g.one());   //seoul 출력
		System.out.println(g.two());   //busan 출력
		System.out.println(g.three());  //false 출력 (두 문자열 비교)
	}
}
