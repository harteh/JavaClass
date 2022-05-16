/**
 * 디폴트는 다른 패키지에서 접근할 수 없다
 * public 지정자는 다른 패키지에서도 접근할 수 있다.
 * 
 * 반환형 함수명(매개변수)
 * 
 * n비트로 표현할 수 있는 정수개수는 2의 n승 개
 * 	"			"		부호를 포함한 정수의 범위는
 * -2의 n-1승 ~ 2의 n-1승 -1
 * 
 * 
 * 
 * 
 *
 */

public class Method02 {
	
	/* 함수만들기 1. 
	static int add(int a, int b) {
		return a+b;
	}
	*/
	
	//함수만들기 2.
	static void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		/* 함수호출 1
		System.out.println(add(2, 3));
		
		int result = add(10,43);
		System.out.println(result);
		*/
		
		//함수호출 2
		add(13, 23);
		
		
		
	}

}
