package review;

/*
 * 5 다음은 Person인터페이스이다. Worker, Student클래스 작성해라

interface Person2 {
	String work();
}

class Worker2 implements Person2 {
	public String work() {
		return "일한다";
	}
}

class Student2 implements Person2 {
	public String work() {
		return "공부한다";
	}
}

public class Review0530C {
	static void pr(Person2 p) {		//동적바인딩
		System.out.println(p.work());
	}
	
	public static void main(String[] args) {
		pr(new Worker2());	//일한다
		pr(new Student2());	//공부한다.
	}
}
*/

/*
 * 6 main()를 보고 추상 클래스와 추상메소드 작성해라
 * (total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)
 */
abstract class Ab {
	abstract int total(int arr[]);
}
class Cd extends Ab {
	int total(int arr[]) {
		int sum=0;
		for(int aa:arr) {
			sum+=aa;
		}
		return sum;
	}
}

public class Review0530C {
	public static void main(String[] args) {
		Ab c = new Cd();
		System.out.println(c.total(new int[] {1,2,3,4,5}));
	}
}
