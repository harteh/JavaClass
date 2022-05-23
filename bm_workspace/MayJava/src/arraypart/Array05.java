package arraypart;

import java.util.Scanner;

/*
 * 객체를 원소로 하는 배열을 만들 수 있다.
 * 
 * 객체배열 : 객체에 대한 레퍼런스를 원소로 갖는 배열
 * Book b[];	// Book배열에 대한 레퍼런스 변수 b 선언
 * b = new Book[5];	//레퍼런스 배열 생성
 * 
 */

/*
 * 객체배열 생성
class Circle{
	int r;
	Circle(int r){
		this.r=r;
	}
	double getarea() {
		return r*r*3.14;
	}
}
public class Array05 {
	public static void main(String[] args) {

		Circle []ary = new Circle[4];
		//객체 배열: 여러개의 객체를 배열형태로 묶어줌
		
		for(int i=0; i<ary.length; i++) {
			ary[i] = new Circle(i);
			//객체 4개를 생성해서 배열 위치에 저장
			//i = 반지름
			System.out.println(ary[i].getarea());
		}
	}
}
*/

/*
 * 값을 입력받아 객체배열에 담아 출력하기
 */
class Song {
	String singer;
	String title;
	
	Song(String singer, String title){
		this.singer = singer;
		this.title = title;
	}
}
public class Array05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Song so[] = new Song[2];	//객체배열 생성
		
		//가수랑 제목 입력받기
		for (int i = 0; i < so.length; i++) {
			System.out.println("가수: ");
			String singer = s.next();
			System.out.println("제목: ");
			String title = s.next();
			
			so[i] = new Song(singer, title);	//객체 생성
		}
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i].singer+", "+so[i].title);
		}
	}
}
