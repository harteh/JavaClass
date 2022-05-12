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
 *
 */

public class TestArray01 {

	public static void main(String[] args) {
		
		//1. 정수 5개를 저장할 배열
		int arr1[] = new int[5];
		//실수 10개 저장할 배열
		double arr2[] = new double[10];
		//배열 요소 수가 세개인 int형 배열
		int arr3[] = new int[3];
		//인덱스가 최대값이 4인 char형 배열
		char arr4[] = new char[5];
		
		//for문으로 배열 출력하기
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("****** 입력받은 값을 배열에 저장,출력 ******");
//		double arr5[] = new double[3];	//실수형 3개 배열 생성
//		
//		for (int i = 0; i < 3; i++) {
//			arr5[i] = sc.nextDouble();	//실수 3번를 입력받아 arr5[i]에 저장한다.
//			System.out.println(arr5[i]);
//		}
		

		System.out.println("****** 입력받은 값의 합 ******");
//		double arr6[] = new double[5];
//		int sum = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			arr6[i]=sc.nextDouble();
//			sum += arr6[i];
//			//실수를 입력받아 배열에 저장
//		}
//		System.out.println(sum/5.0);
		

		System.out.println("****** 큰 값 출력 ******");
		int arr7[] = new int[5];
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			arr7[i] = sc.nextInt();
			if (arr7[i] > max) {	//입력받은 값이 최대값(max)보다 크면,
				max = arr7[i];		//입력값을 max에 저장
			}
		}
		System.out.println("가장 큰 수는 "+max);
		

		System.out.println("******  ******");
		int arr8[] = {10,20,30,40,50};
		
		

	}

}
