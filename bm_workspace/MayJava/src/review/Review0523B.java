package review;


/*
 * 4. main()�� ���� Ŭ������ �ۼ��ض� 
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
		System.out.println("�簢�� ����" + rec.area());
	}
}
*/

/*
 * 5. main()�� ���� SongŬ������ �ۼ��ض�
 * ������) �����ϴ� �뷡 On
 * 			�� �뷡 Butter
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
		System.out.println("�����ϴ� �뷡 " + s1.getsong());
		System.out.println("�� �뷡 " + s2.getsong());
	}
}
