package review;

/*
 * 3 this() �ٸ� ������ ȣ��
*/
class Music {
	String singer;
	String title;
	
	Music(String title, String singer){
		this.singer=singer;
		this.title=title;
	}
	Music(String title){
		this(title, "��ź");
	}
}
public class Review0524A {
	public static void main(String[] args) {
		Music m=new Music("On", "BTS");
		System.out.println(m.title+ " " +m.singer); // On , BTS ���

		Music m1=new Music("Butter");
		System.out.println(m1.title+" " +m1.singer); // Butter, ��ź ���
	}
}

/*
 * 4 

class Cal {
	static int add(int a, int b){
		return (a+b);
	}
	static int div(int a, int b){
		return (a/b);
	}
}
public class Review0524A {
	public static void main(String[] args) {
		int a = Cal.add(10, 5);	//��
		int b = Cal.div(10, 5);	//��
		System.out.println(a +" "+b);
	}
}
*/
