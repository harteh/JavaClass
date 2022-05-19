package classpart;

class Rectangle{
	int width;
	int height;
	
	int getArea(){
		return width*height;		
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.width=4;
		r.height=10;
		
		System.out.println("¸éÀû: "+r.getArea());
	}
}
