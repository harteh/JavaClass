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
		System.out.println(p);	//3, 4異쒕젰
	}
}
*/

/*
 * 2 二쇰�쇰쾲�샇 ��841111-1234560�앹쓣 珥덇린�솕�븯�뿬 �뿬�꽦�씤吏� �궓�꽦�씤吏� 異쒕젰
 * (7踰덉㎏ �닽�옄媛� 1�씠硫� �궓�꽦, 2�씠硫댁뿬�꽦 �� switch case�궗�슜)

public class Review0526A {
	public static void main(String[] args) {
		String num = "841111-1234560";

		switch (num.charAt(7)) {
		case '1':
			System.out.println("�궓�꽦");
			break;
		case '2':
			System.out.println("�뿬�꽦");

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
 * 3	Tv�겢�옒�뒪��main()瑜� 蹂닿퀬 Tv�겢�옒�뒪瑜� �긽�냽諛쏆� Tv1�겢�옒�뒪瑜쇱옉�꽦
 
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
		System.out.println(name+" "+ getsize() +"�씤移� Tv");
	}
}

public class Review0526A {
	public static void main(String[] args) {
		Tv1 t = new Tv1(20, "�궪�꽦");
		t.show();		//�궪�꽦 20�씤移� Tv 異쒕젰
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
 * 5	main(), XY�겢�옒�뒪瑜� 蹂닿퀬 XY瑜� �긽�냽諛쏅뒗 XYZ �겢�옒�뒪瑜� �옉�꽦

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
	protected void move(int x, int y){	//珥덇린�솕�븯�뒗 �븿�닔
		this.x=x;
		this.y=y;
	}
}

class XYZ extends XY {
	private String z;
	
	XYZ(int a, int b, String z){
		super(a, b);	//遺�紐� �깮�꽦�옄 �샇異�
		this.z=z;		//z 珥덇린�솕
	}
	
	void setxy(int a, int b) {	//�꽭�똿�씠�씪�꽌 諛섑솚�삎 遺덊븘�슂
		move(a, b);
		//super.move(a,b);	�룞�씪�븿
	}
	void setcolor(String z) {	//�깋�긽 珥덇린�솕
		this.z = z;
	}
	
	void show() {	//異쒕젰�븿�닔
		System.out.println(getx()+", "+ gety()+" "+ z+"�깋!");
	}
}

public class Review0526A {
	public static void main(String[] args) {
		
		XYZ xyz= new XYZ(10,10, "red");
		
		xyz.setxy(20,30);
		xyz.setcolor("blue"); 
		xyz.show();		// 20, 30�씤 blue�깋!
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
		System.out.println("�궗媛곹삎!!");
	}
	public int area();
}

class Rec implements Re {
	int a, b;
	Rec(int a, int b){	//�깮�꽦�옄
		this.a=a;		this.b=b;
	}
	public int area() {
		return a*b;
	}
}

public class Review0526A {
	public static void main(String[] args) {
		Re r = new Rec(10, 20);
		r.show();		//"�궗媛곹삎!!" 異쒕젰
		System.out.println("硫댁쟻:" + r.area());
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
			System.out.println("�씠由�:");
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
