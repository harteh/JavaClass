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
		author = "���ڹ̻�";
		System.out.println(a+" "+author);
	}
}


public class CtorEx2 {
	public static void main(String[] args) {

		Book b1 = new Book("����", "��������");
		Book b2 = new Book("���� �ż���");
		//�����ڴ� ��ü�� �ѹ��� ȣ��ȴ�
		
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
