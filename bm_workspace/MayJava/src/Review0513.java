import java.util.Iterator;
import java.util.Scanner;

/**
 * * 소스 -> 컴파일 -> 기계어
 * .java -> .class
 * 
 * JVM : 플랫폼에 독립적이다.
 * JDK : 자바개발도구
 * jre : 자바 개발환경
 * 
 * 기본형 타입 8가지
 * 변수선언 이유
 * 
 * 삼항연산자
 * 반복문
 * 
 */
public class Review0513 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int i = sc.nextInt();
//		switch (i) {
//		case 1:
//			System.out.println("!");
//			break;
//		case 2:
//			System.out.println("@");
//			break;
//		default:
//			System.out.println("*");
//			break;
//		}
		
		System.out.println("****** 반복문 ******");
		System.out.println("정수 5개 입력");
		
//		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {	//정수 저장
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {	//배열 출력
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		
		System.out.println("****** continue ******");
//		for(int i=0; i<5; i++) {
//			int n = sc.nextInt();
//			if (n <= 0) {
//				continue;	//음수와 0은 버리고, 양수만 뽑는다.
//			} else {
//				System.out.println(n);
//			}
//		}

		
		System.out.println("****** 50+11.8의 결과를 소수점을 버리고 출력해라. ******");
		System.out.printf("%.0f\n", 50+11.8);	//반올림됨
		System.out.println((int)(50+11.8));		//반올림안됨
		
		System.out.println("****** 0~30까지 수 중에서 5의 배수를 제외하고 출력 ******");
		//무한 반복문과 break, continue
		
		int i=0;
		while(true) {
			if (i==0) {
				System.out.print(i+" ");
			}
			i++;
			if (i>30) {
				break;
			}
			if(i%5==0) {
				continue;
			} else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//for문 무한반복문
//		i=0;
//		for(;;) {
//			i++;
//			if (i%5==0) {
//				continue;
//			} else if (i==30) {
//				System.out.println("break");
//				break;
//			}
//		}
//		System.out.print(i+" ");
		
		i=0;
		while (true) {
			System.out.print(i+" ");
			i++;
			if (i>30) {
				break;
			} else if (i%5==0) {
				i++;
				continue;
			}
		}
		System.out.println();

		i=0;
		while (true) {
			if (!(i%5==0)) {
				System.out.print(i+" ");
			}
			i++;
			if (i<=30) {
				continue;
			} else {
				break;
			}
		}
		

		System.out.println();
		System.out.println("****** 정수 10개를 입력받아 평균 출력 ******");
		//(배열, length필드 사용)
		
//		int arr[] = new int[10];
//		int sum=0;
//		
//		for (int j = 0; j < arr.length; j++) {	//정수 저장
//			arr[j] = sc.nextInt();
//			sum += arr[j];
//		}
//		System.out.println( (double)sum / arr.length );
		//계산 횟수는 배열의 길이를 사용하면 되니까 따로 변수안만들어도 됨..
		
		

		System.out.println("****** 정수 10개를 입력받아 7의 배수만 출력 ******");
		// (배열)
		
//		int arr1[] = new int[10];
//		
//		for(int h = 0; h<arr1.length; h++) {
//			arr1[h] = sc.nextInt();
//		}
//		for (int j : arr1) {
//			if (j%7==0) {
//				System.out.print(j +" ");
//			}
//		}
		
		/* 
		Scanner s = new Scanner(System.in);
		int []a=new int[10];
		int sum=0;
		
		System.out.println("정수 10개 입력");
		for(i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			if(a[i]%7==0) {
				System.out.println(a[i]);
			}
			//sum+=a[i];
		}
		//System.out.println((double)sum/a.length);
		 * 강사님 코드
		 */

/*
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		for( i=0; i<4 ;i++) 
		sum+=ary[i];
		System.out.println(sum);	//7.0
*/

		System.out.println("****** while문 ******");
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		i = 0;
		while(i<ary.length) {
			sum += ary[i];
			i++;
		}
		System.out.println("while문: "+sum);
		
		System.out.println("****** do-while문 ******");
		sum=0.0;
		i = 0;
		do {
			sum += ary[i];
			i++;
		} while (i<ary.length);
		System.out.println("do-while문: "+sum);
		
		
		System.out.println("****** for-each문 ******");
		sum=0.0;
		
		//배열 데이터가 double형이기 때문에 double 변수를 생성
		for(double j : ary) {
//			sum += ary[(int)j];	-> for-each문은 인덱스가 필요없다!!
			sum += j;
		}
		System.out.println("for-each문: "+sum);
		

		System.out.println("****** 3행 3열 배열을 0~8까지정수로 초기화 ******");
		int arr [][] = {{0,1,2},
				{3,4,5},
				{6,7,8}};
		

		System.out.println("****** 2행 3열 배열을 a~f까지문자로 초기화 ******");
		char c[][]= {{'a','b'},{'c','d'},{'e','f'}};
		
		
		System.out.println("****** 2차원 배열과 합 ******");
		/*
		 * 3행 4열의정수형 배열을 생성하여 0~9 범위의정수를 랜덤하게 저장
		 * 저장후 2차원 배열과 합을 출력
		 * 실행결과) 5 4 1 5
		 * 			 0 5 3 5
		 *           7 8 1 4
		 *           합은 48 
		 */
		
		int arr2[][] = new int[3][4];
		sum = 0;
		for (int j = 0; j < arr2.length; j++) {
			for (int j2 = 0; j2 < arr2[j].length; j2++) {
				arr2[j][j2] = (int)(Math.random()*10);
				System.out.print(arr2[j][j2]+" ");
				sum+=arr2[j][j2];
			}
			System.out.println();
		}
		System.out.println("합은 "+(int)sum);
		


		
		
		

	}

}
