package review;

import java.util.Scanner;

/*
 * 1
class Point {
	int a, b;
	Point(int a, int b){
		this.a=a;	this.b=b;
	}
	public String toString() {
		return a+" "+b;
	}
}
public class Review0526A {
	public static void main(String[] args) {

		Point p = new Point(3, 4);
		System.out.println(p);	//3, 4출력
	}
}
*/

/*
 * 2 주민번호 “841111-1234560”을 초기화하여 여성인지 남성인지 출력
 * (7번째 숫자가 1이면 남성, 2이면여성 – switch case사용)

public class Review0526A {
	public static void main(String[] args) {
		String num = "841111-1234560";

		switch (num.charAt(7)) {
		case '1':
			System.out.println("남성");
			break;
		case '2':
			System.out.println("여성");

		default:
			break;
		}
	}
}
*/

/*
 * 2-1 	Integer.parseInt()

public class Review0526A {
	public static void main(String[] args) {
		String num = "841111-1234560";
		
		String c = num.substring(7,8);
		int chk = Integer.parseInt(c);
		
		//int chk = Integer.valueOf(id.substring(7,8));
		
		switch (chk) {
		case 1:
			System.out.println("�궓�꽦");
			break;
		case 2:
			System.out.println("�뿬�꽦");
			
		default:
			break;
		}
	}
}
*/

/*
 * 3	Tv클래스와main()를 보고 Tv클래스를 상속받은 Tv1클래스를작성
 
class Tv{
	private int size;
	Tv(int size){
		this.size = size;
	}
	protected int getsize(){
	   return size; 
	}
}
class Tv1 extends Tv {
	String name;
	Tv1(int a, String name){
		super(a);
		this.name=name;
	}
	void show(){
			System.out.println(name+" "+ getsize() +"인치 Tv");
	}
}

public class Review0526A {
	public static void main(String[] args) {
		Tv1 t = new Tv1(20, "삼성");
		t.show();		//삼성 20인치 Tv 출력
	}
}
*/

/*
 * 4

class Shape {
	int a, b;
	String chk;
	
	Shape(){
		a=1; b=3;
	}
	Shape(int a, int b){
		this.a=a; this.b=b;
	}
	
	void pr(String chk) {
		this.chk = chk;
	}
	
	void show() {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(chk);
			}
			System.out.println();
		}
	}
}

public class Review0526A {
	public static void main(String[] args) {
		Shape s = new Shape();
		Shape s1 = new Shape(2,5);
		
		s.pr("@");
		s1.pr("#");
		
		s.show();	//@@@	-> 1�뻾 3�뿴
		s1.show();	//#####	-> 2�뻾 5�뿴
					//#####
	}
}
*/

/*
 *  * 5	main(), XY클래스를 보고 XY를 상속받는 XYZ 클래스를 작성

class XY{
	private int x,y;

	XY(int x, int y){
		this.x=x; this.y=y; 
    }
	
	int getx(){
		return x; 
	}
	int gety(){
		return y;
	}
	protected void move(int x, int y){	//초기화하는 함수
		this.x=x;
		this.y=y;
	}
}

class XYZ extends XY {
	private String z;
	
	XYZ(int a, int b, String z){
		super(a, b);	//부모 생성자 호출
		this.z=z;		//z 초기화
	}
	
	void setxy(int a, int b) {	//세팅이라서 반환형 불필요
		move(a, b);
		//super.move(a,b);	동일함
	}
	void setcolor(String z) {	//색상 초기화
		this.z = z;
	}
	
	void show() {	//출력함수
		System.out.println(getx()+", "+ gety()+" "+ z+"색!");
	}
}
public class Review0526A {
	public static void main(String[] args) {
		
		XYZ xyz= new XYZ(10,10, "red");
		
		xyz.setxy(20,30);
		xyz.setcolor("blue"); 
		xyz.show();		// 20, 30인 blue색!
	}
}
*/

/*
 * 6 main()를 보고 인터페이스를 작성해라. 
 * (인터페이스명은 Re, 
 * 모든 메소들들을 인터페이스안에서 선언하고 
 * show함수는 default로 설정,area는 abstract로 설정)
interface Re {
	default void show() {
		System.out.println("사각형!!");
	}
	public int area();
}
class Rec implements Re {
	int a, b;
	Rec(int a, int b){	//생성자
		this.a=a;		this.b=b;
	}
	public int area() {
		return a*b;
	}
}
public class Review0526A {
	public static void main(String[] args) {
		Re r = new Rec(10, 20);
		r.show();		//"사각형!!" 출력
		System.out.println("면적:" + r.area());
	}
}
*/

/*
 * 7 객체배열 2개 만들어 이름과 아이디를 입력받아 객체 생성해서 출력
 */
class Profile {
	String name, id;

	Profile(String n, String i){
		name = n;	id = i;
	}
}

public class Review0526A {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Profile pro[] = new Profile[2];

		for(int i=0; i<pro.length; i++) {
			System.out.println("이름:");
			String n = sc.next();
			System.out.println("ID:");
			String id = sc.next();

			pro[i] = new Profile(n, id);
		}

		for (Profile profile : pro) {
			System.out.println(profile.name+" "+profile.id);
		}

	}
}
