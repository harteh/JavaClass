package totalQuestion0606;

/*
 * 	���� ���) ���� �ż��� �ô����佽��
	�� �غ� �۰� �̻�
	������ ȣ��!!
 */
/*
 * this() : ���� Ŭ������ �ٸ� ������ ȣ��
 */

class Book {
	String title, author;
	
	Book(String t, String a){
		title = t;	author = a;
		System.out.println(t +" "+ a);
	}
	Book(String t){
		this(t, "�۰� �̻�");
	}
	Book(){
		this("������ ȣ��", "");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Book b1=new Book("���� �ż���", "�ô����佽��");
		Book b2=new Book("�� �غ�");
		Book b3=new Book(); 
	}
}
