import java.util.Scanner;

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

	//정수를 입력받아 출력하는 함수
//	static int in(int n) {
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		System.out.println( "in 함수출력: "+in(n) );
//	}
	
	
//	static int in() {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( "in 함수출력: "+in() );
//	}
	
	
	
	//두 정수 입력받아 평균반환받는 함수
//	static double average(int a, int b) {
//		double result = (double)(a+b)/2;
//		return result;		
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		double avg=average(x,y);
//		System.out.println( "함수출력: " + avg );
//	}
	
	
//	static double average() {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		return (x+y)/2.0; 
//	}
//	
//	public static void main(String[] args) {
//		double avg=average();
//		System.out.println( "함수출력: " + avg );
//	}
	
	
//	static void average() {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		double avg=(x+y)/2.0;
//		
//		System.out.println( "함수출력: " + avg );
//	}
//	
//	public static void main(String[] args) {
//		average();
//	}
	
	static int total(int ary[]) {
		int sum=0;
		for(int i=0; i<ary.length; i++) {
			sum+=ary[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int ary[]= {1,2,3,4,5};
		System.out.println( "함수출력: "+total(ary) );	//호출할대는 배열명만 씀.
	}
	
	
	
	

}
