import java.util.Scanner;
/**
 * 반복문 : while, do while
 * 
 * while(조건식){
 * 		작업문
 * }
 * 
 */

public class TestWhile {

	public static void main(String[] args) {
		
//		int i=0;			//초기식
//		
//		while (i<10) {		//조건식
//			System.out.println(i);	//반복하고 싶은 실행문
//			i++;			//증감식
//		}
		
		//for문으로 바꾸기
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		//1~10 중 홀수만 1,3,5,7,9
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);				
//			i+=2;
//		}
		
		//1~10 중 홀수만 1,3,5,7,9
//		int i=1;
//		while(i<=10) { //조건식
//			if(i%2==1) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
//		int i = 10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		
		//구구단
//		System.out.println("정수를 입력 : ");
//		int n = sc.nextInt();
//		
//		switch (n) {
//		case 2:
//			System.out.printf("**** %d단 ****\n", n);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", n,i, n*i);
//			}
//			break;
//		case 3:
//			System.out.printf("**** %d단 ****\n", n);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", n,i, n*i);
//			}
//			break;
//
//		default:
//			System.out.println("잘못입력했습니다.");
//			break;
//		}
		
		//1~99(while)
//		int i = 1;
//		while (i<100) {
//			if(i%2==0 || i%3==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\n", i,j,i*j);
			}
			System.out.println("***********");
			
		}
		

	}

}
