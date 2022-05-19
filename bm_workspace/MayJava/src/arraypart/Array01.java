package arraypart;
import java.util.Scanner;

/**
 * 배열(array)
 * - 한번에 많은 메모리 공간 선언 가능
 * - 같은 타입의 데이터들이 순차적으로 저장됨
 * - 배열 인덱스는 0부터 시작
 * 
 * int 		ary[]	= new int[10]
 * 자료형	배열명[]= new 자료형[데이터개수];
 * -'배열 선언' 		= '배열 생성'
 * - int형 데이터가 10개인 배열 : 40바이트
 * 
 * 배열선언
 * - int a[];	//배열에 대한 레퍼런스 변수 a를 선언
 * 
 * 배열 초기화
 *  int ary[] = {1,2,3};
 *  - 초기화할때는 []개수 적으면 안됨.
 *  - 입력 순서대로 저장된다.
 *  
 *  배열 출력
 *  System.out.println(ary[0]);
 *  
 *  배열의 크기
 *   - 배열명.length
 *   - 배열의 크기는 수정되지 않는다. 
 *
 */

public class Array01 {

	public static void main(String[] args) {
		
		//1. 정수 5개를 저장할 배열
		int ary1[] = new int[5];
		//실수 10개 저장할 배열
		double ary2[] = new double[10];
		//배열 요소 수가 세개인 int형 배열
		int ary3[] = new int[3];
		//인덱스가 최대값이 4인 char형 배열
		char ary4[] = new char[5];
		
		//for문으로 배열 출력하기
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("****** 입력받은 값을 배열에 저장,출력 ******");
//		double ary5[] = new double[3];	//실수형 3개 배열 생성
//		
//		for (int i = 0; i < 3; i++) {
//			ary5[i] = sc.nextDouble();	//실수 3번를 입력받아 ary5[i]에 저장한다.
//			System.out.println(ary5[i]);
//		}
		

		System.out.println("****** 입력받은 값의 합 ******");
//		double ary6[] = new double[5];
//		int sum = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			ary6[i]=sc.nextDouble();
//			sum += ary6[i];
//			//실수를 입력받아 배열에 저장
//		}
//		System.out.println(sum/5.0);
		

		System.out.println("****** 큰 값 출력 ******");
		int ary7[] = new int[5];
		int max = 0;
		
//		for (int i = 0; i < 5; i++) {
//			ary7[i] = sc.nextInt();
//			if (ary7[i] > max) {	//입력받은 값이 최대값(max)보다 크면,
//				max = ary7[i];		//입력값을 max에 저장
//			}
//		}
		System.out.println("가장 큰 수는 "+max);
		
		System.out.println("****** 배열의 크기 (배열 평균값 구하기) ******");
		int ary8[] = new int[5];
		double sum = 0;
		
		//정수 5개 입력해서 평균구하기
//		for (int i = 0; i < ary8.length; i++) {
//			ary8[i] = sc.nextInt();
//			sum += ary8[i];
//		}
		System.out.println("배열의 평균값: "+ sum / ary8.length);
		

		System.out.println("****** 배열의 총합 ******");
		//아파트(7층) 각 층에 있는 인원수를 입력하고 총합을 구하라
		int ary9[] = new int[7];
		int sum2 = 0;
		
//		for (int i = 0; i < ary9.length; i++) {
//			ary9[i] = sc.nextInt();	//각 층의 인원수 입력
//			sum2 += ary9[i];
//		}
		System.out.println("총 인원: " + sum2);
		

		System.out.println("****** 피보나치수열 ******");
		int ary10[] = new int[10];	//1 2 3 5 8 13 21 34 55 89
		
		ary10[0] = 1;
		ary10[1] = 2;
		
		for(int i= 0; i< 8; i++) {
			 ary10[i+2]= ary10[i] + ary10[i+1];
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(ary10[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("****** 입력받은 값(4개)의 합과 곱 ******");
		int sum3 = 0;  //총합변수 
		int multi = 1; //총곱변수
		int ary[]=new int[4];
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();
			sum3 += ary[i];
			multi *= ary[i];
		}
		System.out.printf("총합: %d, 총곱: %d", sum3, multi);
		
		
		
	}

}
