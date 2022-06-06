package totalQuestion0606;

/*
 * 	실행 결과) 멋진 신세계 올더스헉슬리
	더 해빙 작가 미상
	생성자 호출!!
 */
/*
 * this() : 같은 클래스의 다른 생성자 호출
 */

class Book {
	String title, author;
	
	Book(String t, String a){
		title = t;	author = a;
		System.out.println(t +" "+ a);
	}
	Book(String t){
		this(t, "작가 미상");
	}
	Book(){
		this("생성자 호출", "");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Book b1=new Book("멋진 신세계", "올더스헉슬리");
		Book b2=new Book("더 해빙");
		Book b3=new Book(); 
	}
}
