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


		

	}

}
