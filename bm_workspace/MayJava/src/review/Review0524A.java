package review;

import java.util.Scanner;

/*
 * 3 this() 다른 생성자 호출
 * 
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
*/

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

/*
 * 5 

public class Review0524A {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {			//i=0, 1, 2, 3
			for (int j = 0; j < 3-i; j++) {		//j=3, 2, 1, 0 (공백)
				System.out.print(" ");
			}
			for (int j=0; j<(i*2)+1; j++) {		//j=0
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
*/

/*
 * 6

public class Review0524A {
	public static void main(String[] args) {
		int[][] grade = {{55, 60, 65}, {85, 90, 95}};
		int high;
		
		high= get(grade);
		System.out.println("가장 높은 점수는 " + high+ "점 입니다.");
	}

	static int get(int[][] grade) {
		int high=0;
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				if(high < grade[i][j]) {
					high = grade[i][j];
				}
			}
		}
		return high;
	}
}
*/

/*
 * 7
 * “stop"을 입력하면 프로그램을 종료시켜라. 
 * (while(true), equals() 사용)

public class Review0524A {
	public static void main(String[] args) {
		String eng[] = {"student", "book", "future", "note"};
		String kor[] = {"학생", "책", "미래", "공책"};
		
		Scanner sc = new Scanner(System.in);
		String str=null;
		while(true) {
			System.out.println("영어단어 입력: ");
			str=sc.next();
			if(str.equals("stop")) {
				break;
			}
			
			for(int i=0; i<eng.length; i++) {
				if(str.equals(eng[i])) {
					System.out.println(kor[i]);
				}
			}
		}
	}
}



/*
 * 8
 * 서랍의 비밀번호가 생각이 나지 않는다.
 * 비밀번호 P는 000부터 999까지 번호 중의 하나이다.
 * 주어지는 번호 K부터 1씩 증가하며 비밀번호를 확인해 볼 생각이다.
 * 예를 들어 비밀번호 P가 123 이고 주어지는 번호 K가 100 일 때, 
 * 100부터 123까지 24번 확인하여 비밀번호를 맞출 수 있다.
 * P와 K가 주어지면 K부터 시작하여 몇 번 만에 P를 맞출 수 있는지 알아보자.
 * 
 * 입력으로 P와 K가 빈 칸을 사이로 주어진다.
 * 몇 번 만에 비밀번호를 맞출 수 있는지 출력한다.
 *  
*/

public class Review0524A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();	//비밀번호	000~999
		int k = sc.nextInt();	//추측번호
		int num=0;	//몇번만에 맞추는가..
		
		for (int i=k; i<=p; i++) {
			num++;
			if(i == p) {
				System.out.println(num);
			}
		}

	}
}

