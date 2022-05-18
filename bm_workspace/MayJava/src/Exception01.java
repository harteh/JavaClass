import java.util.Scanner;

/**
 * 예외처리
 * 
 * toString() 메소드 : 객체를 문자열로 변경하는 메소드
 * sc.next() : 
 */
public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//예외처리 1.
//		int a,b;
//		
//		try {	//예외 발생할 가능성이 있는 실행문
//			System.out.println("값1 입력:");
//			a=sc.nextInt();
//			
//			System.out.println("값2 입력:");
//			b=sc.nextInt();
//			
//			System.out.println(a/b);
//		}
//		catch(Exception e) {	//예외 처리문
//			System.out.println(e);
//		}
//		finally {	//예외 발생여부와 상관없이 무조건 실행되는 문장 (생략가능)
//			System.out.println("!!!!!!!!!!!");			
//		}
//		
//		System.out.println("종료");
		
		
		//예외처리 2.InputMismatchException
		System.out.println("정수 5개 입력:");
		
		int n=0, sum=0;
		for(int i=0; i<5; i++) {
			try {
				n=sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("정수만 입력하세요");
				System.out.println(e);
				
				sc.next();	//입력스트림에 있는 토큰(바로전데이터)을 버린다.
				i--;		//인덱스가 증가하면 안되므로 감소시킨다.
				continue;	//빠져나오지 않고 계속 반복
			}
			
			sum +=n;
			System.out.printf("n값:%d 합:%d / ",n,sum);
		}
		System.out.println();
		System.out.println("총합="+sum);
		/*
		 * continue 있을 때
		 * 정수 5개 입력:
			1 2 d 3 4 5
			n값:1 합:1 / n값:2 합:3 / 정수만 입력하세요
			java.util.InputMismatchException
			n값:3 합:6 / n값:4 합:10 / n값:5 합:15 / 
			총합=15
		 */
		/*
		 * continue 없을 때
		 * 정수 5개 입력:
			1 2 ㅇ 3 4 5
			n값:1 합:1 / n값:2 합:3 / 정수만 입력하세요
			java.util.InputMismatchException
			n값:2 합:5 / n값:3 합:8 / n값:4 합:12 / n값:5 합:17 / 
			총합=17
		 */
		
		
	}

}
