package controlflow;
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
		//구구단 2.
//		for (int i = 2; i <= 9; i++) {		//행
//			for (int j = 1; j <= 9; j++) {	//열
//				System.out.printf("%d*%d=%d\n", i,j,i*j);
//			}
//			System.out.println("***********");
//		}
		
		
		/* 도형그리기
		 * 가변적일 경우,
		 * i값을 사용해 j값이 나오도록 공통적인 수식을 짜야함
		 */
//		for (int i=0; i<5; i++) {		//i 가 기준
//			for (int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//역삼각형
		/*
		 * i=0, j=5
		 * i=1, j=4
		 * i=2, j=3
		 */
		System.out.println("************ 역삼각 ************");
		for (int l=0; l<5; l++) {
			for (int m=0; m<5-l; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("************ 역삼각?? ************");
		
		for (int i=0; i<5; i++) {			//i: 0.1.2.3.4
			for (int j=5; j<0; j--) {		//j: 5.4.3.2.1
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("************ 공백 삼각 ************");
		/*
		 *     *	i=0  공백 j=4  별1
		 *    **	i=1  공백 j=3  별2
		 *   ***	i=2  공백 j=2  별3
		 *  ****	i=3  공백 j=1  별4
		 * *****	i=4  공백 j=0  별5
		 */
		
		for(int i=0; i<5; i++) {	//행 0,1,2,3,4
			
			for(int j=0; j<4-i; j++) {//공백 4,3,2,1,0
				System.out.print(" ");
			}
			
			for (int j=0; j<i+1; j++) {	//별 1,2,3,4,5
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println("************ 반쪽마름모 ************");
		/*
		 *     *	i=0  공백 j=4  별1
		 *    **	i=1  공백 j=3  별2
		 *   ***	i=2  공백 j=2  별3
		 *  ****	i=3  공백 j=1  별4
		 * *****	i=4  공백 j=0  별5
		 *  ****	i=5  공백 j=1  별4
		 *   ***	i=6  공백 j=2  별3
		 *    **	i=7  공백 j=3  별2
		 *     *	i=8  공백 j=4  별1
		 */
		for (int i = 0; i < 9; i++) {	
			if (i<5) {	//별 증가, 공백 감소 //행i: 0,1,2,3,4
				
				for (int j=0; j<4-i; j++) {//공백 4,3,2,1,0
					System.out.print(" ");					
				}
				for (int j=0; j<i+1; j++) {//별 1,2,3,4,5
					System.out.print("*");
				}
								
			} else {	//별 감소, 공백 증가	//행i: 5,6,7,8
				
				for (int j=0; j < i-4; j++) {		//공백 1,2,3,4
					System.out.print(" ");
				}
				for (int j=0; j < 9-i; j++) {		//별 4,3,2,1
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
