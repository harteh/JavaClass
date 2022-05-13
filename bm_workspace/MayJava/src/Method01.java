import java.util.Scanner;

/**
 * ** 함수 **
 * 캡슐화: 자바의 모든 메소드는 반드시 클래스 안에 있어야 한다.
 * 
 * 접근지정자
 * - public, private, protected, default(접근지정자가 생략된 경우)
 * 
 * main함수에서 시작해서 main함수에서 끝난다.
 * 
 * 반환형 함수명(매개변수){}
 * 
 * static : 공유
 * - 클래스 안에서 함수를 공유할 수 있다.
 * 
 * void : 반환형
 * - 돌려받을 값
 * - 반환형이 void인 함수는 대부분 출력문이 들어간다.
 * - 자료형이 들어간다.
 * 
 * return : 반환 값
 * 
 * 
 * ** 함수 만들기 **
 * 1. 출력을 어디에서 할건지 결정
 * 2. main에서 출력할 경우 함수에서 리턴값을 받아야 한다.
 * 	-> 함수호출과 동시에 출력
 *  -> 변수를 주면서 리턴값을 저장할 것인지
 * 2-1. 함수에서 출력 할 경우 리턴문이 필요 없음 
 *  -> (void)
 *
 */
public class Method01 {
	
//	static void pro(int age) {
//		System.out.println("안녕");
//		System.out.println("나이는 "+age+"이다.");
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println("시작");
//		pro(52);	//함수호출 -> 함수를 찾아 { }확인
//		pro(53);	//함수호출
//		System.out.println("끝");
//	}

	
//	public static void main(String[] args) {
//		int n=add(10, 20);		//1. add 함수 호출	3. 받아온 리턴값을 int n에 저장한다.
//		System.out.println(n); //4. 출력문 실행
//	}
//	
//	static int add(int a, int b) {	//2. 리턴값을 가지고 main함수로 돌아간다.
//		return a+b;
//	}
	
	
//	public static void main(String[] args) {
//		System.out.println("원의 넓이: "+area(5.5));
//		System.out.println("원의 둘레: "+round(3.2));
//		
//		//넓이:3.14*반지름*반지름
//		//둘레:3.14*반지름*2
//	}
//	
//	static double area(double r) {
//		return 3.14*r*r;
//	}
//	static double round(double r) {
//		return 3.14*r*2;
//	}
	
	
//	static void meter(int n) {
//		System.out.println( (double)n /100 );
//		System.out.println( n /100.0 );
//	}
//	
//	public static void main(String[] args) {
//		meter(176);	//함수호출
//		//176cm -> 1.76m
//	}
	
	
//	static double meter(int n) {
//		return n/100;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( meter(176) );
//	}
	
	
//	static void total(int a, int b) {
//		int sum=0;
//		for(int i=a; i<=b; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//	
//	public static void main(String[] args) {
//		total(1,10);	//1부터 10까지 합출력
//		total(1,100);	//1부터 10까지 합출력
//	}
	
	
	static int multi(int a, int b) {
		int num = 1;
		// 누적 곱은 초기값을 1로 설정해야 함!!
		
		for(int i=1; i<=b; i++) {	//횟수
			num *= a;
		}
		return num;
		// return (int)Math.pow(a, b); -> a의 b승
	}
	
	public static void main(String[] args) {
		System.out.println( multi(2,10) );
		//2의 10승
	}
	
	
	
	
	//배열 연습
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		String arr[][]= {
//				{"book","책"},
//				{"water","물"},
//				{"note","노트"},
//		};
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][0]+"의 뜻은?");	//book의 뜻은?
//			String str=sc.next();	//한글로 답을 입력함
//			
//			if(str.equals(arr[i][1])) {
//				System.out.println("정답");
//			}
//			else {
//				System.out.println("정답은 "+arr[i][1]+" 입니다.");
//			}
//		}
//		
//	}
	
	
	

}
