package review;

class Circle {
	private double r;
	Circle(double r){
		this.r = r;
	}
	double get() {
		return r;
	}
}

class Cir extends Circle {
	private String name;
	Cir(double a, String b){
		super(a);	//Circle(double r)
		name = b;
	}
	
	void pr() {
		System.out.println(get()+"인 "+ name);
	}
}

public class Review0524C {
	public static void main(String[] args) {

		Cir c=new Cir(2.5,"circle");
		c.pr();   //2.5인 circle 출력
	}
}
