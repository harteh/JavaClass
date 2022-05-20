package constructor;

/*1
class Color{
	String a;
	String b="black";
	
	Color(String a){
		this.a = a;
	}
	Color(String a, String b){
		this.a=a;	this.b=b;
	}
	
	void show() {
		System.out.println(a+", "+ b);
	}
}

public class Test0520 {
	public static void main(String[] args) {
		Color c1=new Color("순신");
		Color c2=new Color("세종","red");
		
		c1.show();
		c2.show();
	}
}
*/

/*2 */

class Rec{
	int a, b;
	Rec(int a, int b){
		this.a=a;	this.b=b;
	}
	void area(){
		System.out.println(a*b);
	}
}
public class Test0520{
	public static void main(String[] args) {
		Rec r1=new Rec(4,7);
		Rec r2=new Rec(7,9);
		
		r1.area(); //4*7
		r2.area(); //7*9
	}
}
