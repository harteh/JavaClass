package javaReview;

/*
 ** 6장 
 * this: 자신의 레퍼런스를 반환
 * this(): 생성자에서 다른 생성자를 호출
 * 
 ** 접근 지정자
 * default: 같은 패키지 내의 다른 클래스만 접근 가능
 * public: 패키지에 관계없이 모든 클래스에서 접근 가능
 * private: 클래스 내에서만 접근 가능(상속받았을 때도 안됨)
 * protected: 같은 패키지 내의 모든 클래스에서 잡근 가능
 * 			상속 받은 자식 클래스는 다른 패키지에 있어 접근 가능
 * 
 ** no-static 멤버: 객체마다 독립적으로 별도 존재 (인스턴스 변수)
 *		- 객체 생성 후 사용가능
 ** static 멤버: 객체를 생성하지 않고 사용 가능 (클래스 변수, static 변수)
 *		- 동일한 클래스의 모든 객체에 의해 공유된다
 *
 ** 7장 
 * 배열과 비슷한 리스트 인터페이스가 있다.
 */
/*
 ** 8장 
 * 자바는 다중상속을 지원하지 않는다. 
 * 상속의 횟수 제한이 없다
 * 
 * 하위 클래스 객체가 생성될 때 
 * - 하위 클래스가 생성될 때는 상위 클래스의 생성자가 먼저 호출된다
 * - 하위 클래스의 생성자와 상위 클래스의 생성자가 모두 실행된다
 * -> 하위 클래스 생성자에서 super()를 자동으로 호출된다.
 * 
 * 동적바인딩 : 서브 클래스에 오버라이딩 된 메소드가 무조건 실행됨
 */
/*
 ** 9장
 * 추상클래스 : 추상 메서드와 일반메서드 모두 있을 수 있다.
 * 추상 메서드는 추상 클래스 안에서만 존재할 수 있다.
 * public static final int MAX = 9999;
 * -> 공유 가능하고, 수정은 불가능하게 설정
 * 
 * 추상클래스 사용 이용
 * 	: 목적에 맞게 추상메서드를 다르게 구현하여 다형성을 추구할 수 있다
 */
/*
 ** 10장
 * 인터페이스: 추상메서드와 상수로만 이루워져있다
 */
/*
 ** 11장
 * Object 클래스: 최상위 클래스
 * 주요 메서드
 * 
 ** Wrapper 클래스
 * - 기본타입을 객체형으로 사용해야 하는 경우.
 * - 박싱(Boxing): 기본타입을 객체형으로 바꾸는 것
 * - 언박싱: 객체형을 기본형으로 꺼내는 것 
 * valueOf(), parseInt() : 클래스 메서드의 일종
 */
/*
 ** 14장
 * Exception 클래스: 예외 클래스의 최상위 클래스
 ** 예외처리 미루기
 *	throws: 예외처리를 메서드가 호출될 때 처리하도록 미룸 
 */
/*
 ** 15장
 * InputStream : 입력 => 파일을 읽어 들일 때 사용
 * 	
 * OutputStream : 저장 => 파일 생성
 */

/*
 * this
class Book{
	String a, b;
	int c;
	Book(){
		this(null,null,10);
	}
	Book(String a, int c){
		this("aa","", 33);
	}
	Book(String a, String b, int c){
		this.a=a;	this.b=b;	this.c=c;
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		Book b = new Book("aa","bb",33);
		Book b2 = new Book("cc",33);
		Book b3 = new Book();
	}
}
*/
/*
 * static
 *
class Sample {
	public int n;	//인스턴스 변수
	public void a() {
		m=20;
	}
	public void b() {
		m=30;
	}
	public static int m;	//클래스 변수, s1과 s2에 의해 공유된다
	public static void c() {//클래스 메서드
		m=40;
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.n=10;
		s1.a();
		s1.m=40;
		System.out.println(s1.n);
		
		Sample s2 = new Sample();
		s2.n=55;
		s2.b();
		s2.c();
		System.out.println(s2.n);
	}
}
*/
/*
 * 상속
 *
class A1 {
	A1(){
		System.out.println("A");
	}
}
class B extends A1 {
	B(){
		System.out.println("B");
	}
}
class C extends B {
	C(){	//생성자 호출. 상속받은 상위클래스의 생성자 호출
		System.out.println("C");
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		C c = new C(); //A B C 출력 된다
	}
}
*/
/*
 * Wrapper 클래스
 *
public class TotalRe0531A2 {
	public static void main(String[] args) {

		Integer i = new Integer(100); //100 을 객체화 시킴: 박싱(Boxing)
		int my = i.intValue(); // 기본타입으로 변경: 언박싱
		Float f = new Float((double)3.14);
		int num = Integer.parseInt("100");
	}
}
*/
/*
 * 예외처리
 */
public class TotalRe0531A2 {
	public static void main(String[] args) {
		String[] str = {"35", "54", "234", "3.14"};
		try {
			for(int i=0; i<str.length; i++) {
				int j = Integer.parseInt(str[i]);
				//문자열을 꺼내서 int타입으로 바꿈
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println("예외발생");
		}
	}
}
