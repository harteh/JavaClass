package arraypart;
import java.util.Scanner;

/**
 * 배열 api
 * https://docs.oracle.com/javase/8/docs/api/index.html
 * 
 * for-each문
 * - 배열의 각 요소를 순차적으로 접근한다.
 * 
 * for(int i : num){}
 * 
 *   ** 2차원 배열 **  
 * - 행렬
 * int ary[][];
 * ary = new int[2][5];
 * -> int ary[][] = new int[2][5];
 * -> 2행 5열
 * [][][][][]
 * [][][][][]
 * 
 * 2차원 배열의 개수
 * - 배열명.length -> 행의 개수
 * - 배열명[행의 인덱스].length -> 열의 개수
 * 
 *  ** 비정방형 배열 **
 *  
 *  
 *
 */
public class Array02 {

	public static void main(String[] args) {
		
		int []num= {1,2,3,4,5};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i : num) {
			System.out.print(i);
		}
		System.out.println();
		
		String fruit[] = {"바나나", "딸기", "사과"};
		for(String s : fruit) {
			System.out.print(s);
		}
		System.out.println();
		
		
		System.out.println("****** 2차원 배열 ******");
		//하나의 문자 5행 5열 구조
		char ary[][] = new char[5][5];
		//실수형 5행 2열 구조
		double ary1[][] = new double[5][2];

		
		System.out.println("****** 2차원 배열 초기화 ******");
		int c[][] = {{1,2,3},
					 {4,5,6}};
		
		for(int i=0; i<2; i++) {	//행
			for(int j=0; j<3; j++) {	//열
				System.out.println( c[i][j] );
			}
		}
		

		System.out.println("****** 실수형 2차원 2행 3열 구조 ******");
		Scanner sc = new Scanner(System.in);
		double ary2[][] = new double[2][3];
		
//		for (int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				ary2[i][j]=sc.nextDouble();
//				System.out.println( ary2[i][j]);
//			}
//		}


		System.out.println("****** 정수 10개 입력받아 5의 배수 출력(1차원배열) ******");
		int ary3[] = new int[10];
		
		for (int i=0; i<ary3.length; i++) {
			ary3[i]=sc.nextInt();
			if (ary3[i]%5==0) {
				System.out.println("5의배수:" + ary3[i]);
			}
		}
		

		
		
		

	}

}
