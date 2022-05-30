package javaReview;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 접근제어자
 * 	private -> default -> protected -> public
 * 		private : 해당 클래스에서만 접근 가능
 * 		default : 해당 패키지에서만 접근 가능
 * 		protected : 동일 패키지 & 해당 클래스를 상속받은 다른 패키지에서 접근가능
 * 		public : 어떤 클래스에서도 접근 가능
 * 
 * this : 인스턴스 자신을 가리키는 참조변수
 * this() : 생성자
 * 	
 *  this 참조 변수를 사용하여 인스턴스 변수에 접근 가능.
 *  - 인스턴스 메소드에서만 사용가능
 *  - !!클래스 메소드에서는 사용 불가
 *  
 *  this() : 같은 클래스의 다른 생성자를 호출할 때 사용
 *   - 생성자 내부에서만 사용가능
 ********
 * super 
 * 	: 부모 클래스의 멤버에 접근 가능
 * 	 인스턴스 메소드에만 사용가능, 클래스 메소드에 사용 불가.
 * super() 메소드
 * 	: 부모 클래스의 생성자 호출
 *
 */
/*
 * 1.

class Book {
	private String title, author;	//인스턴스 변수
	
	Book(String title, String author) {
		this.title=title;	this.author=author;
		info();
	}
	Book(String t){
		this(t, "작자 미상");
	}
	Book(){
		this("생성자 호출!", "");
	}
	void info() {
		System.out.println(title +" "+ author);
	}
	
}
public class Re0527 {
	public static void main(String[] args) {
		Book b1 = new Book("멋진 신세계", "올더스 헉슬리");
		Book b2 = new Book("더 해빙");
		Book b3 = new Book();
	}
}
*/
/*
 * 2 

class Friend {
	private String name;
	private String phone;
	
	Friend(String name, String phone){
		this.name=name;		this.phone=phone;
	}
	String get() {
		return name+" "+phone;
	}
}

class ITFriend extends Friend {
	private String major;
	
	ITFriend(String n, String p, String m){
		super(n, p);
		major = m;
	}
	
	void show(){
		System.out.println( major+" "+super.get() );
	}
}

public class Re0527 {
	public static void main(String[] args) {
		ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		it.show();
	}
}
*/
/*
 * 3 

public class Re0527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int num;
		
		for(int i=0; i<5; i++) {
			try {
				num = sc.nextInt();
				System.out.println((i+1)+"번째 정수: "+num);
				sum+=num;
			}
			catch(InputMismatchException  e) {
				System.out.println("정수만 입력 가능합니다. 다시 입력하세요.");
				sc.next();
				i--;
				continue;
			}
		}
		System.out.println("총합: "+sum);
	}
}
*/
/*
 * 4 

public class Re0527 {
	public static void main(String[] args) {
		Double num1 = new Double(9.5);
		String str1 = num1.toString();
		Double num2 = num1.doubleValue();
	}
}
*/
/*
 * 5 

class Circle {
	private int r;
	
	Circle(int r) {
		this.r = r;
	}
	
	public boolean equals(Object obj){
		if(this.r == ((Circle)obj).r  ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return r+"";
	}
}
public class Re0527 {
	public static void main(String[] args) {
		Circle a = new Circle(30);
		Circle b = new Circle(30);
		
		System.out.println("반지름: " +a);
		System.out.println("반지름: " +b);
		
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
 * 6 
 */
interface Po {
	public void pr(int a, String b);
	public void pr(String b);
}

class Point implements Po {
	public void pr(int a, String b) {
		System.out.println(b +"책은 "+a+"원");
	}
	public void pr(String b) {
		System.out.println(b);
	}
}

public class Re0527 {
	public static void main(String[] args) {
		Po p = new Point();
		p.pr(30000, "java");
		p.pr("python");
	}
}

