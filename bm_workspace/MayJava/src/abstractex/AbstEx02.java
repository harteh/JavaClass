package abstractex;

abstract class A {
	abstract public void show();
	
	void pr() {
		show();
	}
}
class B extends A {
	int r;
	
	B(int r) {
		this.r = r;
	}
	int get() {
		return r;
	}
	
	public void show() {
//		System.out.println(get());
		System.out.println(r);
	}
}

public class AbstEx02 {
	public static void main(String[] args) {

		B b = new B(20);
		b.pr();
	}
}
