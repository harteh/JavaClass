package classpart;
/*
 *	지역변수 = 로컬변수
 *	멤버변수 = 인스턴스변수
 *	static 변수 = 클래스 변수 
 *
 *  클래스 메서드(static) 내부에서 지역변수와 클래스변수는 사용 가능.
 *  하지만 인스턴스 변수는 사용할 수 없다.!!!
 *  
 *  : static 안에서는 static만 사용가능..
 *  
 *  클래스 메서드(static) 내부에서는 this를 사용못한다.
 *  -> 객체 없이도 존재할 수 있기 때문에
 */
/*
 * 싱글톤 패턴 만들기
 * 1. 생성자를 private으로 만들기
 * 2. 클래스 내부에 static으로 유일한 인스턴스 생성한다.
 * 3. ☆외부에서 참조할 수 있는 public 메서드 만들기☆
 * 4. 실제로 사용하는 코드 만들기
 */
/* 
 * p.192
 * static 멤버는 클래스당 하나만 생성된다.	->객체가 생길때 함께 생기고 함께 없어진다.
 * 동일한 클래스의 모든 객체들이 공유한다.
 * 
 * 인스턴스 변수는 각 객체마다 별도로 생긴다.	->프로그램시작, 클래스로딩 시 생성
 * 
 */

class Cal {
	static int max(int a, int b){
		int result = (a > b) ? a : b;
		return result; 
	}
	static int min(int a, int b){
		int result = (a > b) ? b : a;
		return result; 
	}
}

public class StaticEx2 {
	public static void main(String[] args) {

		System.out.println(Cal.max(10, 7));
		System.out.println(Cal.min(4, -2));
		
	}
}
