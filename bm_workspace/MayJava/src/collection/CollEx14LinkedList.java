package collection;

class Box<T>{	//제네릭 클래스
	Box<T> next;
	T t;
	
	void in(T t) {
		this.t=t;
	}
	
	T out() {
		return t;
	}
}

public class CollEx14LinkedList {
	public static void main(String[] args) {

		Box<Integer> b = new Box<Integer>();	//T를 <Integer>로 구체화
		
//		b.in(new Integer(30));	//Integer b = new Integer(30);
		b.in(30);
		
		b.next = new Box<Integer>();
		b.next.in(40);	//객체에 한번 더 접근
		
		b.next.next = new Box<Integer>();
		b.next.next.in(50);
		
		Box<Integer> tmp;
		tmp = b.next;
		System.out.println(tmp.out());
		
		System.out.println("***** *****");
		System.out.println(b.out());
		System.out.println(b.next.out());
		System.out.println(b.next.next.out());
	}
}
