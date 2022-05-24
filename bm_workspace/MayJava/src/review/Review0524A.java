package review;

/*
 * 3 this() 다른 생성자 호출
*/
class Music {
	String singer;
	String title;
	
	Music(String title, String singer){
		this.singer=singer;
		this.title=title;
	}
	Music(String title){
		this(title, "방탄");
	}
}
public class Review0524A {
	public static void main(String[] args) {
		Music m=new Music("On", "BTS");
		System.out.println(m.title+ " " +m.singer); // On , BTS 출력

		Music m1=new Music("Butter");
		System.out.println(m1.title+" " +m1.singer); // Butter, 방탄 출력
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
		int a = Cal.add(10, 5);	//합
		int b = Cal.div(10, 5);	//몫
		System.out.println(a +" "+b);
	}
}
*/
