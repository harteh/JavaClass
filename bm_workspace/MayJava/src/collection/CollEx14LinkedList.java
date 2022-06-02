package collection;

class Box<T>{	//���׸� Ŭ����
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

		Box<Integer> b = new Box<Integer>();	//T�� <Integer>�� ��üȭ
		
//		b.in(new Integer(30));	//Integer b = new Integer(30);
		b.in(30);
		
		b.next = new Box<Integer>();
		b.next.in(40);	//��ü�� �ѹ� �� ����
		
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
