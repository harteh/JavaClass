package constructor;

/* 1
class Book{
	String name;
	String author;
	
	Book(String a, String b){
		name=a;	author=b;
		System.out.println(a +" "+ b);
	}
	
	Book(String a){
		name =a;
		author = "작자미상";
		System.out.println(a+" "+author);
	}
}


public class CtorEx2 {
	public static void main(String[] args) {

		Book b1 = new Book("개미", "베르나르");
		Book b2 = new Book("멋진 신세계");
		//생성자는 객체당 한번만 호출된다
		
	}
}
*/

class Number{
	int a;
	Number(int a){
		this.a=a;
		System.out.println(a);
	}
}

public class CtorEx2 {
	public static void main(String[] args) {
		Number n=new Number(5);
//		System.out.println(n.a);		
	}
}	
