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

	
//	static int total(int ary[]) {
//		int sum=0;
//		for(int i=0; i<ary.length; i++) {
//			sum+=ary[i];
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		int ary[]= {1,2,3,4,5};
//		System.out.println( "함수출력: "+total(ary) );	//호출할때는 배열명만 씀.
//	}
	
	
//	static int total(int ary[][]) {
//		int sum=0;
//		for(int i=0; i<ary.length; i++) {
//			for (int j=0; j<ary[i].length; j++) {
//				sum+=ary[i][j];
//			}
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		int ary[][]= {{1,2,3},{4,5,6}};
//		System.out.println( "함수출력: "+total(ary) );
//	}
	
	
	/*반복문 연습
	public static void main(String[] args) {
		
		//1~10까지의 총곱을 출력해라.(while)
		int multi = 1;
		int i=1;
		while(i<=10) {
			multi *=i;
			i++;
		}
		System.out.println(multi);
		
		
		//구구단의 짝수단만 출력하면서 해당되는 단의 범위까지
		//(2단은 2*2, 4단은 4*4, 6단은 6*6, 8단은 8*8)출력해라.(break)
		
		for(int dan=2; dan<=9; dan++) {
			if(dan%2==0) {	//짝수단만 출력
				for(int j=1; j<=9; j++) {
					System.out.printf("%d*%d=%d ", dan,j,dan*j);
					if(dan==j) {
						break;
					}
				}
				System.out.println();
			}
		}
		

		System.out.println("****** break 사용 ******");
		multi=1;
		
		for(i=2; i<=9; i+=2 ) {
			for(int j=1; j<=9; j++) {
				multi = i*j;
				System.out.print(i+"*"+j+"="+multi+" ");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		

		//2.
		for(i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i%2==0 && i>=j) {
					System.out.println(i+"X"+j+"="+i*j);
				}else {
					break;
				}
			}
		}
		
		
	}
	*/
	
	//함수 연습
//	static int adder(int a, int b) {
//		return a+b;
//	}
//	
//	static double exp(double a) {
//		return a*=a;
//	}
//	
//	public static void main(String[] args) {
//		
//		int result=adder(10,20); //두 수의 합 출력
//		System.out.println(result);
//		System.out.println(exp(3.5)); //3.5의 제곱한 값 출력 
//	}
	
	
	//원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드를 만들어라.
	//4-1. main에서 출력
	
//	static double avg(double r) {
//		return r*r*3.14;
//	}
//	
//	public static void main(String[] args) {
//		double result = avg(3);		//함수의 반환값을 저장해서
//		System.out.println(result);	//출력
//	}
	
	//4-2. 메소드에서 출력
	static void avg(double r) {
		double result=r*r*3.14;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		avg(3);
	}
	
	

}
