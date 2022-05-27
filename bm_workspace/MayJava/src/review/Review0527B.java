package review;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1 this() -> 다른생성자 호출
 * 실행 결과) 
 * 멋진 신세계 올더스 헉슬리
 * 더 해빙 작가 미상
 * 생성자 호출!! 
 
class Book {
	String title;
	String author;
	
	Book(){
		this("생성자 호출!!", "");
	}
	Book(String title){
		this(title, "작가미상");	//파라미터가 2개인 생성자 호출
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
		show();
	}
	
	void show() {
		System.out.println(title+" "+author);
	}
}

public class Review0527B {
	public static void main(String[] args) {
		Book b1=new Book("멋진 신세계", "올더스 헉슬리");
		Book b2=new Book("더 해빙");
		Book b3=new Book();

	}
}
*/

/*
 * 2  Friend클래스를 상속받은 ITFriend클래스를구현해라.

class Friend {
	private String name;
	private String phone;
	
	Friend(String name, String phone){
		this.name=name;		this.phone=phone;
	}
	
	String get() {
		return name+ " "+ phone;
	}
}

class ITFriend extends Friend {
	String major;
	ITFriend(String n, String p, String m){
		super(n, p);
		major=m;
	}
	void show() {
		System.out.println( major+", " +super.get()  );
	}
}

public class Review0527B {
	public static void main(String[] args) {
		 ITFriend it=new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		 it.show();
	}
}
*/

/*
 * 3. 5개 정수를 입력받아 합을 구하는 프로그램.
 * 만약, 정수를 아닌 문자를 입력할 때 발생하는 
 * InputMismatchException예외를 처리하여 다시 입력받도록 작성해라.
 * 실행 결과) 	1번째 정수: 1
 * 				2번째 정수: a
 * 				다시 입력해라. 정수아니다.
 * 				2번째 정수 : 2
 * 				3번째 정수 : 3
 * 				4번째 정수: 4
 * 				5번째 정수: 5           
 * 				총합: 15

public class Review0527B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num;
		
		for(int i=0; i<5; i++ ) {
		System.out.println(i+1 +"번째 정수: ");
			try {
				num = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("다시 입력해라. 정수아니다.");
				sc.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println(sum);

	}
}
*/

/*
 * 4. 실수 9.5를 객체화(박싱) 시켜라.
 * 4.1) 객체화 시킨 9.5를 문자열로 변경해라.
 * 4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.

public class Review0527B {
	public static void main(String[] args) {
		
		Double d = new Double(9.5);
		Double dd = 9.5;
		
		String s = d.toString();
		String ss = Double.toString(d);
		
		Double d2 = Double.valueOf(s);		//박싱
		double dd2 = Double.parseDouble(s);	//언박싱
		double dd3 = d2.doubleValue();		//언박싱
		
	}
}
*/

/*
 * 5. equals(두 원의 면적이 같은지 비교),  
 * 	  toString메소드를 사용하여 완성시켜라. (반지름이 30임)

class Circle1 {
	private int r;
	Circle1(int r) {
		this.r=r;
	}
	
	public boolean equals(Object ob) {	//Object ob = new Circle();
		if(this.r == ((Circle1)ob).r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString(){
		return r+"";
	}
}

public class Review0527B {
	public static void main(String[] args) {
		
		Circle1 a=new Circle1(30);
		Circle1 b=new Circle1(30);

        System.out.println("반지름: "+a);
        System.out.println("반지름: "+b);

        // 정수를 비교하는 것이기 때문에 재정의 해야한다.
        if(a.equals(b)) {
        	System.out.println("같은 원"); 
        }
        else {
        	System.out.println("다른 원");
        }
		
	}
}
*/

/*
 * 6  인터페이스 Po를 만들고 추상메소드 pr을 만들어라. 
 * 		상속받아 구현해라.
 * 	실행 결과) 
 * 		java책은30000원
 *  	python
 */
interface Po {
	public void pr(int p, String t);
	public void pr(String t);
}

class Point implements Po {		
	public void pr(int p, String t) {
		System.out.println(t +"책은 "+p);
	}
	
	public void pr(String t) {
		System.out.println(t);
	}
}

public class Review0527B {
	public static void main(String[] args) {
		
        Po p=new Point();
        p.pr(30000,"java");
        p.pr("python");
	}
}

