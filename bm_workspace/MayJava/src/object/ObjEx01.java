package object;

/*
 * 1 toString()

class In {
	private int num;
	In(int num){
		this.num = num;
	}
	
	public String toString() {	//재정의 하여
		return num +" ";		//문자열 반환
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		In i = new In(4);
		System.out.println(i);
	}
}
*/

/*
 * 2 toString()

class Po {
	private int a, b;
	Po(int a, int b){
		this.a = a;		this.b = b;
	}
	
	public String toString() {
		return a+" "+b;
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		
		Po p = new Po(3,4);
		System.out.println(p.getClass().getName());	//객체의 클래스 이름 출력
		System.out.println(p.hashCode());		//해시코드의 16진수 값
		System.out.println(p.toString());		//클래스명+주소값
		
		System.out.println(p.toString());	//toString() 재정의하면 3, 4가 출력됨
	}
}
*/

/*
 * 3 .equals()

class Po {
	private int a, b;
	Po(int a, int b){
		this.a = a;		this.b = b;
	}
	
	public boolean equals(Po p) {
		if(this.a==p.a && this.b==p.b) {	
			//자기자신의 a와 매개변수로 전달받은 값 비교
			return true;
		}
		else
			return false;
	}
	
}

public class ObjEx01 {
	public static void main(String[] args) {
		
		Po p = new Po(3,4);
		Po p1 = new Po(2,3);
		Po p2 = new Po(3,4);
		
		if(p==p1) {
			System.out.println("p==p1");	//주소값이 다르다
		}
		if(p.equals(p1)) {		
			// 객체 p가 자기자신..(-> line 64), p1이 매개변수
			System.out.println("p는 p1과 같다");			
		}
		if(p.equals(p2)) {
			System.out.println("p는 p2와 같다");			
		}
	}
}
*/

/*
 * 4. p.386 Q4

class MyDog{
	String a, b;
	MyDog(String a, String b){
		this.a=a;	this.b=b;
	}
	public String toString() {
		return b+" "+a;
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}
}
*/

public class ObjEx01 {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String ("Hello");
		String e = new String ("Java");
		String f = new String ("Java");
		
		System.out.println(f.equals(e));
		System.out.println(f == c);
		System.out.println("****************");

	}
}

