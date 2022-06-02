package review;

import java.util.Scanner;

/*
 * 1.
 *
class Book {
	private String name;
	private int price;
	
	Book(String name, int price){
		this.name=name;		this.price = price;
	}
	Book(String name){
		this(name, 40000);
	}
	Book(){}
	
	void title () {
		System.out.println(name + " "+price+"원");
	}
}
public class Review0602A {
	public static void main(String[] args) {
		Book b1=new Book("자바"); 
		b1.title();            //자바는 40000원
		Book b2=new Book("파이썬", 30000);
		b2.title();           //파이썬 30000원
	}
}
*/

/*
 * 2.2. 1~100안의 정수를입력받아 
 * 3,6,9 중 하나가 있는 경우 “짝”, 두 개 있는 경우 “짝짝”,
 * 하나도 없으면 “땡”을출력해라.
 * (정수값이 39라고 할 때, n/10=3, n%10=9 이 나온다.   (/, % 연산자 활용))
 *    실행 결과) 입력:39
 *    짝짝
 */
public class Review0602A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	//정수를 입력받음
		int chk1 = num/10;	//체크용 변수
		int chk2 = num%10;	//체크용 변수
		
		if(chk1==3 || chk1==6 || chk1==9) {
			System.out.print("짝");
		}
		if(chk2==3 || chk2==6 || chk2==9) {
			System.out.print("짝");
		}
		else {
			System.out.println("땡");
		}
	}
}
