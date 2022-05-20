package classpart;

/*
* this()는 반드시 생성자의 첫번째 문장에 위치해야한다.
* this()는 반드시 같은 클래스의 다른 생성자를 호출할 때 사용된다.
* this()는 생성자에서만 사용된다.

* 기본생성자가 먼저 실행된다.
* 생성자는 void가 있을 수 없다
*/

class Book{
	String name;
	int price;
	
	Book(String name, int price){
		this.name=name;
		this.price=price;
	}
	Book(String name){
		this(name, 0);	//-> 다른생성자 호출
	}
	Book(){
		this("제목미정", 0);	//매게변수가 2개이므로 7라인이 호출됨
		System.out.println("생성자 호출!");
		// show() 실행 이전에 기본생성자(sysout) 먼저 실행됨
	}
	
	void show() {
		System.out.println(name +" "+ price);
	}
}


public class ThisEx1 {
	public static void main(String[] args) {

		Book b1=new Book("고양이", 30000);	//파라미터가 있는 생성자
		Book b2=new Book("총균쇠");
		Book b3=new Book();
		
		b1.show();
		b2.show();
		b3.show();
		
	}
}
