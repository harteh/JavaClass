package inheritance;
/*
 * ���� Ŭ������ ���� Ŭ���� �ڷ������� ����ȯ�� �� ������ 
 * �� ���� �������� �ʴ´�
 */

/*
 * 1
 
class Person {
	String name;
	String id;
	
	Person(String name ){
		this.name = name;
	}
}
class Student2 extends Person {
	
	Student2 (String name){
		super(name);
	}
}

public class InherEx6Poly {
	public static void main(String[] args) {

		Person p = new Student2("�̼���");	//��ĳ����
		
		Student2 s = (Student2) p;	//�ٿ�ĳ����
		System.out.println(s.name);
		
	}
}
*/

/*
 * 2
class Fruit {
	String color;
	int cnt;
	
	Fruit(String color, int cnt ) {
		this.color = color;
		this.cnt = cnt;
	}
	void show(){
		System.out.println(color+", "+ cnt);
	}
}
class Apple extends Fruit {
	Apple(String color, int cnt ){
		super(color, cnt);
	}
}

public class InherEx6Poly {
	public static void main(String[] args) {

		Fruit f1 = new Apple("red", 10);
		f1.show();
	}
}
*/

/*
 * 3. ��������.
class Person{
	String name;
	
	Person(String n){
		name=n;
	}
}
class Student extends Person{
	String grade;
	String major;
	Student(String n){
		super(n);
	}
}

public class InherEx6Poly {
	public static void main(String[] args) {

		//s�� �̿��ϸ� ��� 4�� ���� ����
		//p
		Person p;
		Student s=new Student("aa");
		p=s;     
		System.out.println(p.name);
		
		p.grade="A";
	}
}
*/

class Elec{
	String color;
	Elec(String c){
		color=c;
	}
}
class Note extends Elec{
	int number;
	Note(String c, int n){
		super(c); //color=c;
		number=n;
	}
}
class Ipad extends Note {
	int size;
	Ipad(String c, int n, int s){
		super(c, n);
		size = s;
	}
	void show() {
		System.out.println(color+"�� "+number+"�� "+size+"��ġ");
	}
}

public class InherEx6Poly {
	public static void main(String[] args) {
		
		Ipad i = new Ipad("red", 10, 12);
		i.show();
	}
}

