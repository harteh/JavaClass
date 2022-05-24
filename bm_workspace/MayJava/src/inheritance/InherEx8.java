package inheritance;

/*
 * 1. 
private y는 공유가 안되서 오류남
class A1{
	private int x,y;
	
	protected void setx(int x) {
		this.x=x;
	}
}

class B1 extends A1 {
	private int z;
	protected void setXY(int a, int b,int c) {
		setx(a+b);
		y=b;
		z=c;
	}
}
*/

/*
 * 2
class A1{
	int a;
}
class B1 extends A1{
	int b;
}
class C extends B1{
	int c;
}
class D extends B1{
	int d;
}

public class InherEx8 {
	public static void main(String[] args) {
		System.out.println(new D() instanceof C);	//false
		System.out.println(new D() instanceof A1);	//true
	}
}
 */

/*
 * 3
 */
class A1{
	int a;
}
class B1 extends A1{
	int b;
}
class C extends B1{
	int c;
}
class D extends B1{
	int d;
}
public class InherEx8 {
	public static void main(String[] args) {
		
//		A a = new D();
//		System.out.println(a instanceof B1);	// true
		System.out.println(new D() instanceof A1);	// true
		System.out.println(new C() instanceof A1);	// true
//		System.out.println(new C() instanceof D);	// false
	}
}
