package review;


/*
 * 4. main()을 보고 클래스를 작성해라 
 * 
class Rectangle {
	int width;
	int height;
	
	int area() {
		return width * height;
	}
}

public class Review0523B {
	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		rec.width = 5;
		rec.height = 6;
		System.out.println("사각형 면적" + rec.area());
	}
}
*/

/*
 * 5. main()를 보고 Song클래스를 작성해라
 * 실행결과) 좋아하는 노래 On
 * 			내 노래 Butter
 */

class Song {
	private String title;
	Song(String title){
		this.title = title;
	}
	String getsong() {
		return title;
	}
}

public class Review0523B {
	public static void main(String[] args) {
		Song s1 = new Song("On");
		Song s2 = new Song("Butter");
		System.out.println("좋아하는 노래 " + s1.getsong());
		System.out.println("내 노래 " + s2.getsong());
	}
}
