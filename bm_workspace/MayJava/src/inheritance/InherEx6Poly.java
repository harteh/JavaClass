package inheritance;
/*
 * 하위 클래스는 상위 클래스 자료형으로 형변환될 수 있지만 
 * 그 역은 성립하지 않는다
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

		Person p = new Student2("이세종");	//업캐스팅
		
		Student2 s = (Student2) p;	//다운캐스팅
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
 * 3. 오류나는.
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

		//s를 이용하면 멤버 4개 접근 가능
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
		System.out.println(color+"색 "+number+"개 "+size+"인치");
	}
}

public class InherEx6Poly {
	public static void main(String[] args) {
		
		Ipad i = new Ipad("red", 10, 12);
		i.show();
	}
}

