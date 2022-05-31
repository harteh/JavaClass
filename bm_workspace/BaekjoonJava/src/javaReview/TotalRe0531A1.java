package javaReview;

import java.util.Scanner;

/*
 * 교재복습 용 클래스
 ** 용어
 *  클래스에 선언한 멤버 변수 = 인스턴스 변수, 속성, 특성, 필드
 *  인스턴스 : 클래스가 메모리 공간에 생성된 상태
 *  객체 : 생성된 클래스의 인스턴스를 지칭
 *  참조변수 = 힙 메모리에 생성된 인스턴스를 가리킨다.
 *  
 *  생성자: 처음 만들 때 멤버 변수나 상수를 초기화 하는 일을 한다.
 *  생성자 오버로드: 클래스에 생성자가 두 개 이상 제공되는 경우
 *  오버로드: 메서드 이름이 같고 매개변수만 다른 경우
 *  
 */
/*
 ** 1장
 * 개발환경설정: JDK와 이클립스 설치
 * 
 * 자바를 컴파일 하면 .class로 바뀜
 * .java(자바소스파일) -> 컴파일러 -> .class(바이트코드) -> JVM
 * JDK: 자바 개발 키트
 * jre: 자바 실행 환경(런타임 관련된것들)
 * 오픈소스: 무상으로 공개한 소프트웨어
 *  * 컴파일: 자바를 기계어로 변경해주는 과정
 *  bin 폴더: 개발에 필요한 도구들이 들어있다.
 *  API: Application Programming Interface
 *  	- JDK에 포함된 클래스 라이브러리
 *  	- 응용 프로그램에서 사용할 수 있도록, 운영 체제나 프로그래밍 언어가 
 *  	제공하는 기능을 제어할 수 있게 만든 인터페이스
 */
/*
 ** 2장
 * 보수: x에 대한 (x+k)의 보수는 k이다
 * 데이터 타입 
 * 	1. 기본타입 8개
 * 		1.1 null : 레퍼런스 타입의 값으로 사용가능하다
 * 					(기본타입에는 사용 불가)
 * 				int a=null; (X)
 * 				String str=null; (O)
 * 		1.2 문자열: 자바에서 문자열은 객체임(기본타입 아님)
 * 	2. 레퍼런스 타입: 클래스, 인터페이스, 배열에 대한 레퍼런스
 * 
 * 바이트형: 1바이트는 8비트, 동영상이나 음악팡리 재생, 데이터 전송에 사용
 * 	-> 바이트기반 스트림
 * 	-> -128 ~ 127
 * 정수타입 리터럴: 
 * 	8진수: 0으로 시작하는 숫자
 * 		int n=015; -> 0으로 시작: 8진수
 *  16진수, 10진수
 * 
 * 상수: final, 값변경불가, 사용전에값지정가능
 * 리터럴: 프로그램에서 사용하는 모든 숫자, 문자, 논리값
 * 
 * 형변환: 자동형변환, 강제형변환
 * 강제형변환 시 데이터 손실이 될 수 있다. (나누기 연산 시)
 * 		ex) 5/2 => 2만 나옴 
 * 		소수점 아래가 버려짐
 */
/*
 ** 4장
 * case 문에 정수, 문자, 문자열 사용가능 
 * continue 문: continue 이후의 문장은 수행하지 않고, 
 ** 			** 반복문을 빠져나가지 않고! 건너뛴다 **
 * 				검사식 처음으로 돌아가 수행됨
 * break 문: 그 지점에서 더 이상 수행문을 반복하지 않고 반복문을 빠져나온다.
 * 			가장 가까운 반복문을 빠져나간다.
 * 
 * 나머지의 범위는 나누는 수보다 하나 작은 수까지.
 */
/*
 ** 5장 객체지향
 * 사용목적: 상속, 상속으로 인한 업,다운 캐스팅. 캡슐화
 * -> 소프트웨어 재사용성이 높아진다. 생상성이 향상된다.
 * 객체: 현실세계에 있는 사물
 * 캡슐화: 클래스에 메서드와 데이터를 넣고 구현
 * 	-> 공개된 메서드에만 접근가능하도록 제한
 *  -> 객체내의 데이터를 보안, 보호
 *  
 *  클래스의 다중 상속 없음 -> 인터페이스를 통해 같은 결과를 얻음
 *  다형성 -> 오버라이딩
 *  	-> 동일한 이름의 다른 동작을 하게 한다.
 *  클래스: 변수(필드), 생성자, 메서드만 들어갈 수 있다.
 *  
 *  메모리 공간이 따로 생기지 않고 같이 사용 가능한 공간: static
 *  
 ** 인자(매개변수) 전달 -> call by value
 *	1) 값에 의한 호출
 *		: 기본타입의 값을 전달하는 경우/레퍼런스를 전달하는 경우
 *	1-1. 기본타입의 값을 전달하는 경우
 *		: 값이 복사되어 전달
 *		: 메소드의 매개변수가 변경되도 호출한 실인자 값은 변경되지 않음
 *
 *	1-2. 레퍼런스를 전달하는 경우
 *		: 객체, 배열의 레퍼런스 전달(복사되어 전달되는게 아님)
 *		: 메소드의 매개변수와 호출한 실인자가 
 *			객체나 배열을 공유하게 된다.
 *
 ** 생성자
 *	- 메서드 (리턴타입이 없다)
 *	- new를 통해 객체를 생성할 때만 호출된다.
 *	- 생성자를 작성하지 않으면 컴파일에 의해 자동으로 기본생성자가 선언된다.
 *	
 *   
 */

/*
 ** 코드정리. 하나의 메인클래스
 *  
public class TotalRe0531A1 {
	public static void main(String[] args) {

		//시험점수 입력받아 3의 배수이면 합격
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		if(score%3 == 0) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		 
		// swicth-case 문 
//		Scanner sc = new Scanner(System.in);
//		char point = sc.next().charAt(0);
//		switch (point) {
//		case 'A' : case 'B':
//			System.out.println("Perfect");
//			break;
//		case 'C' : case 'D':
//			System.out.println("Good");
//			break;
//		case 'F':
//			System.out.println("재수강");
//			break;
//		}
		// 1부터 10까지
//		int n=1;
//		do {
//			System.out.print(n+" ");
//			n++;
//		} while (n<=10);
		
		// 반복문, continue
//		int sum =0;
//		for (int i = 0; i <= 100; i++) {
//			if(i%2==1) {//홀수일때
//				continue;	//건너뛴다.
//			}
//			else {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);	//짝수의 합만 출력
		
	}//main 끝
}//TotalRe0531A 끝
*/
/*
 * 인자호출 기본타입의 값을 전달하는 경우
 * 
class Goods {
	String name;
	int price;
	
	void set(int p) {
		price=p;
		p++;	//2.set함수가 끝나면 p는 사라짐
		System.out.println("set함수의 p: "+p);	//30001
	}
}
public class TotalRe0531A1 {
	public static void main(String[] args) {
		Goods g = new Goods();
		int a=30000;
		g.set(a);	//1.set 함수 호출되면 매개변수 p가 생성됨
		System.out.println(a);	//30000
	}
}
*/
/*
 * 인자호출 - 레퍼런스를 전달하는 경우
 * 
class A{
	int n;
	A(int n){
		this.n=n;
	}
}
public class TotalRe0531A1 {
	String name;
	int m;
	TotalRe0531A1(String n) {
		name=n;
	}
	void set(A a) {
		m = a.n;	//m=22
		a.n++;		//m=23
	}
	public static void main(String[] args) {
		TotalRe0531A1 t = new TotalRe0531A1("AA");
		A a = new A(22);
		t.set(a);
		System.out.println(a.n);
	}
}
*/
/*
 * 인자호출 - 배열를 전달하는 경우
 * 
public class TotalRe0531A1 {
	static void in(int []b) {
		for(int i=0; i<b.length;i++) {
			b[i]++;
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,6,7};
		in(a);
		
		for(int i=0; i<a.length;i++) {
			System.out.println( a[i] );
		}
	}
}
*/
/*
 * 오버로딩
 */ 
class A {
	int i;
	A(){}
	A(int i){
		this.i=i;
	}
	
	int get() {
		return i;
	}
	void set(int i) {
		this.i=i;
	}
}
public class TotalRe0531A1 {
	public static void main(String[] args) {
		A a = new A(3);
		int n=a.get();
		
		A a2 = new A();
		a2.set(4);
	}
}
