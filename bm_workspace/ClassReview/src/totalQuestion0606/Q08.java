package totalQuestion0606;

class Point {
	private int a, b;
	Point(int a, int b){
		this.a=a;		this.b=b;
	}
	
	public String toString() {
		return a+"."+b;
	}
}

public class Q08 {
	public static void main(String[] args) {
		Point p = new Point(3,4);
		System.out.println(p);	//3.4 Ãâ·Â
	}
}
