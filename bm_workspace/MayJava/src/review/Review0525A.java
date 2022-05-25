package review;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1
 
class Tv {
	String name;
	int year;
	int size;
	
	Tv(String name, int year, int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	
	void show() {
		System.out.println(year+"년에 "+name+"에서 나온 "+size+"인치 TV" );
	}
}
public class Review0525A {
	public static void main(String[] args) {
		Tv t = new Tv("삼성", 2022, 20);
		t.show();   //2022년에 삼성에서 나온 20인치 Tv 출력
	}
}
*/

/*
 * 2

class Score {
	int math, eng, com;
	
	Score(int math, int eng, int com){
		this.math = math;		this.eng = eng;		this.com = com;
	}

	double avg() {
		return (math+eng+com)/3.0; 
	}
}

public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		Score s= new Score(math, eng, com);
		System.out.println("평균은 " + s.avg());
	}
}
 */

/*
 * 2-1

class Score {
	int math, eng, com;
	
	Scanner sc = new Scanner(System.in);
	
	Score(int math, int eng, int com){
		math = sc.nextInt();	eng = sc.nextInt();		com = sc.nextInt();
		this.math = math;		this.eng = eng;		this.com = com;
	}

	double avg() {
		return (math+eng+com)/3.0; 
	}
}

public class Review0525A {
	public static void main(String[] args) {
		
		int math=0; int eng=0; int com=0;
		
		Score s= new Score(math, eng, com);
		System.out.println("평균은 " + s.avg());
	}
}
 */

/*
 * 3
 * 다음 Circle클래스를 활용하여 Circle 객체배열을 생성하고, 
 * 5개의 원 반지름을 입력받아 배열에저장한 후, 원의 면적의 합을 출력해라.
 
class Circle1 {

	private double r;

	Circle1(double r){
		this.r=r;
	}

	double area() {
		return 3.14 * r * r;
	}

}

public class Review0525A {
	public static void main(String[] args) {
		Circle1 cir[] = new Circle1[5];
		
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요: ");
		for(int i=0; i<cir.length; i++) {
			double r=sc.nextDouble();
			cir[i] = new Circle1(r);
			
			sum += cir[i].area();
		}
		System.out.printf("원의 면적의 합: %.2f\n", sum);
	}
}
*/

/*
 * 4
 
class XY {
	int a, b;
	
	void set(int a, int b){
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println(a +" "+b);
	}
}

class XYZ extends XY {
	String color;
	
	void color(String color) {
		this.color = color;
	}
	
	void show() {
		super.show();
		System.out.println(color);
		//super키워드를 이용해 정적바인딩을 하여 부모 클래스의 멤버에 접근 가능
		//System.out.println(a+", "+b+", "+color);
	}
}

public class Review0525A {
	public static void main(String[] args) {
		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 출력

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue 출력   
	}
}
*/

/*
 * 5 두 사람이 가위바위보를 한다. 
 * 가위,바위,보 중 하나를 문자열로 입력받아 
 * 누가 이겼는지 판단하는 프로그램을작성해라.(중첩 if문 사용해야함, 문자열 비교)

public class Review0525A {
	public static void main(String[] args) {
		
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("영수: ");
		a=sc.next();
		System.out.println("철수: ");
		b=sc.next();
		
		if(a.equals("가위")) {
			if(b.equals("보")) {
				System.out.println("영수가 이겼다.");
			}
			else if(b.equals("바위")) {
				System.out.println("철수가 이겼다.");
			}
			else if(b.equals("가위")) {
				System.out.println("비겼다.");
			}
		}
		
		if(a.equals("바위")) {
			if(b.equals("보")) {
				System.out.println("철수가 이겼다.");
			}
			else if(b.equals("바위")) {
				System.out.println("비겼다.");
			}
			else if(b.equals("가위")) {
				System.out.println("영수가 이겼다.");
			}
		}
		
		if(a.equals("보")) {
			if(b.equals("보")) {
				System.out.println("비겼다.");
			}
			else if(b.equals("바위")) {
				System.out.println("영수가 이겼다.");
			}
			else if(b.equals("가위")) {
				System.out.println("철수가 이겼다.");
			}
		}
	}
}
*/

/*
 * 6. 정수 10개를 무작위로 입력하여 오름차순으로정렬시켜서 출력해라.
public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	//12 54 295 4 17 2 36 75 12 52
		
		int temp;	//빈공간
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {			//0-9
			for(int j=0; j<arr.length -i -1; j++) {	//0-9,8,
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}
}
*/

/*
 * 6-1. 정수 10개를 무작위로 입력하여 오름차순으로정렬시켜서 출력해라.
 */
public class Review0525A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();	//12 54 295 4 17 2 36 75 12 52
		}
		
		for(int i=0; i<arr.length; i++) {			//0-9
			Arrays.sort(arr);
			System.out.print(arr[i] +" ");
		}
		
	}
}