import java.util.Scanner;

/*
 * 예외 처리 미루기
 * - 예외 처리를 해당 메서드에서 처리하지 않고, 
 * 	메서드를 호출하여 사용하는 부분에서 예외를 처리한다.
 *
 * 
 */

/*
 * 1. 사용자 정의 예외 p.506
 
class Num extends Exception {
	Num(){
		super("잘못된 값!!");	//Exception(String message) 생성자를 호출함
	}
}

public class ThrowsEx1 {
	
	static int in() throws Num {	//예외발생하면 catch 부분에서 받는다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<0) {
			Num num = new Num();	//생성자 호출
			throw num;
			//객체를 던져서 Num 클래스에서 처리하라.
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("양수 입력: ");
		try {
			int n = in();	//정수 입력하는 함수
			System.out.println("입력한 값:"+n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
*/

/*
 * p.509
 */
public class ThrowsEx1 {
	public static void main(String[] args) {
		
	}
}
