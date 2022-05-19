package arraypart;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		//1.	1~10까지 합을 구해라. (for, while, do~while)
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum += i;			
		}
		System.out.println("1-1.합:" + sum);
		
		int i=1;
		sum = 0;
		while(i<=10) {
			sum+=i;
			i++;		// 증감식!!
		}
		System.out.println("1-2.합:" + sum);
		
		i=1;
		sum=0;
		do {
			sum+=i;
			i++;
		} while (i<=10);
		
		System.out.println("1-3.합:" + sum);
		System.out.println("************");
		
		//2. while문을 이용하여 정수를 여러 개 입력받고 평균 출력해라. (0이 입력되면 입력이 종료된다.)
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		sum = 0;
		
//		int num;	//입력받는 값
//		while ((num=sc.nextInt())!=0) {
//			sum+=num;
//			cnt++;
//		}
		System.out.printf("합: %d 평균: %.1f\n", sum, sum/(double)cnt);

		
//		while(true) {
//			int num=sc.nextInt();	
//			//while문 안에서 입력 받아야 함!
//			//반복문 밖에서 입력받으면 반복문과 상관없이 계속 입력받게 된다.
//			
//			if (num == 0) {
//				break;
//			} 
//			sum+=num;
//			cnt++;
//		}
//		
//		System.out.printf("합: %d 평균: %d\n", sum, (sum/(double)cnt));
		System.out.println("************");

			i=0; sum=0;
			while( i<10){
				i=i+2;
				sum +=i;
			}
			System.out.println("문제 합:"+sum);

		//3-1. while(true)와 break를 사용하여 바꿔라.
		i=0;		sum=0;
		while(true) {
			i=i+2;
			sum+=i;
			if(i>=10) {	//등호주위! 반복문이 멈추는 조건
				break;
			};
		}
		System.out.println("3-1 합: "+sum);
		
		//3-2. do~while문, continue을 사용하여 바꿔라.
		i=0;		sum=0;
		do {
			i+=1;			//+1 로 변경하면 증감식의 위치도 변경해야한다.
			if(i%2 != 0) {	//짝수가 아니면 건너뛰기.
				continue;
			}
			sum+=i;
		} while(i<10);			//반복문이 진행되는 조건
		
		System.out.println("3-2 합 :"+sum);
		System.out.println("************");
		
		//4-1) 10개의 문자를 가지는 배열 a를 선언하고 생성해라.
		char a[] = new char[10];
		
		//4-2) 0~4까지 정수형으로 초기화된 배열 b를 선언하고 생성해라.
		int b[] = {0,1,2,3,4};
		
		//4-3) “java”, “c”, “c++”로 초기화된 배열 c를 선언하고 생성해라.
//		String c[] = {"java", "c", "c++"};
		String c[] = new String[] {"java", "c", "c++"};
		
		//4-4) 인덱스의 최대값이 9인 정수형 배열 d를 선언하고 생성해라.
		int d[] = new int[10];

		//1-100까지 중 5의배수이고 10의 배수의 합(while, do-while, for)
		
		i = 1;	sum = 0;
		while(i <= 100) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("5-1.합: "+sum);
		
		i=0;		sum=0;
		do {
			i++;
			if (i%5==0 && i%10==0) {
				sum+=i;
			}
		} while(i<=100);
		System.out.println("5-2.합: "+sum);
		
		sum=0;
		for(i=0;i<=100;i++) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
		}System.out.println(sum);
		
		
		
	}

}
