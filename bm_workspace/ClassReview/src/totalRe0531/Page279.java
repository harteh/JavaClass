package totalRe0531;

import java.util.ArrayList;

class Shape279 {
	public void draw(){
		System.out.println("Shape");
	}
}
class Circle279 extends Shape279 {
	public void draw() {
		System.out.println("Circle");
	}
}
class Triangle279 extends Shape279 {
	public void draw() {
		System.out.println("Triangle");
	}
}
public class Page279 {
	public static void main(String[] args) {

		ArrayList<Shape279> list = new ArrayList<Shape279>();
		list.add(new Circle279());
		list.add(new Triangle279());
		list.add(new Shape279());
		
		for(Shape279 s : list) {
			s.draw();
		}
		
	}
}
