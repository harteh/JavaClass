import java.util.Scanner;

/**
 * 지역변수(local variable)
 * - 블록 안에서만 유효하다.
 * 
 * 전역변수(global variable)
 * 
 * ** 매개변수가 배열명일때
 * - 배열을 호출할때 배열명만 적으면 된다.
 *
 */
public class Variable01 {

//	static void in() {
//		int a=10;	//지역변수
//		System.out.println(a);
//	}
//	
//	public static void main(String[] args) {
//		int a=0;	//지역변수
//		in();		//함수 호출
//		System.out.println(a);
//	}
	
	
//	static int a;	//전역변수 : 메모리 공간에 공유되는 변수
//	
//	static void aa() {
//		a=10;	//전역변수
//	}
//	
//	static void bb() {
//		int a=20;	//지역변수로 다시 선언됨
//		System.out.println(a);
//	}
//	
//	public static void main(String[] args) {
//		aa();
//		bb();
//		System.out.println(a);
//	}
	
	
//	static double big(double a, double b) {
//		return (a>b ? a:b);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( big(5.5, 6.5) );
//	}
	
	
	//두 정수를 입력받아 비교해서 큰 값 출력하기
//	static void big(int a, int b) {
//		System.out.println( (a>b ? a:b) );
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		big(a, b);
//	}
	
//	static int big(int arr1[]) {
//		int max = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			if(max < arr1[i]) {
//				max = arr1[i];
//			}
//		}
//		return max;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[7];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println( big(arr) );
		//함수 호출과 동시에 출력
		//매개변수가 배열명일때, 
		//배열을 호출할때 배열명만 적으면 됨.
		
	
	public static void cal(char aa, int bb, int cc) {
		switch (aa) {
		case '+':
			System.out.println(bb + cc);
			break;
		case '-':
			System.out.println(bb - cc);
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a=sc.next().charAt(0);
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		cal(a,b,c);
		// + 를 입력하면 b+c, - 입력하면 b-c
		//switch-case
		
	}
		
		
		
		
		
	

}
