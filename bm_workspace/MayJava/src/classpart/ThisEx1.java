package classpart;

class Book{
	String name;
	int price;
	
	Book(String name, int price){
		this.name=name;
		this.price=price;
	}
	Book(String name){
		this(name, 0);	//-> �ٸ������� ȣ��
	}
	Book(){
		this("�������", 0);	//�ŰԺ����� 2���̹Ƿ� 7������ ȣ���
		System.out.println("������ ȣ��!");
		// show() ���� ������ �⺻������(sysout) ���� �����
	}
	
	void show() {
		System.out.println(name +" "+ price);
	}
}

//�����ڴ� void�� ���� �� ����.

public class ThisEx1 {
	public static void main(String[] args) {

		Book b1=new Book("�����", 30000);	//�Ķ���Ͱ� �ִ� ������
		Book b2=new Book("�ѱռ�");
		Book b3=new Book();
		
		b1.show();
		b2.show();
		b3.show();
		
	}
}
