package controlflow;
import java.util.Scanner;

public class TestBreakContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** 구구단 짝수단만 출력 (continue) ******");
		for (int i = 2; i < 9; i++) {	//2단부터 9단까지
			for (int j = 1; j < 9; j++) {
				if (i%2==0) {
					System.out.printf("%d*%d=%d ", i,j,i*j);
				}
				continue;
			}
			System.out.println();	//단 구별
		}
		
		for (int i = 2; i < 9; i++) {	//2단부터 9단까지
			for (int j = 1; j < 9; j++) {
				if (i%2==1) {
					continue;
				} else {
					System.out.printf("%d*%d=%d ", i,j,i*j);
				}
			}
			System.out.println();	//단 구별
		}
		
		System.out.println();
		System.out.println("****** (continue) ******");
//		System.out.println("정수 5개 입력: ");
//		
//		for (int i = 0; i < 5; i++) {	//횟수
//			int n = sc.nextInt();
//			if (n<0) {
//				continue;	//제외(올라가서 반복문 다시 실행
//			} else {
//				System.out.print(n+" ");
//			}
//		}
		System.out.println("프로그램종료");

		System.out.println("****** (1) ******");
		/*
		 * 1. 두 과목 점수를 입력하여 평균 출력하는 프로그램
		 * (평균은소수점 이하 첫째자리까지 출력)
			출력 결과) 두 과목의점수 : 70 80
			평균 : 75.0
		 */
		System.out.println("두 과목 점수를 입력: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		int num1=64, num2=98;	//테스트종료용임시값
		double avg = (double)(num1 + num2) / 2;
		System.out.println(avg);
		
		System.out.printf("각 과목 점수: %d, %d\n과목평균: %.1f\n",
				num1, num2, (double)(num1+num2)/2);
		

		System.out.println("****** (2) ******");
		/*
		 * 2. 시간과 물건 개수로 금액 할인해주는 프로그램
			(총 금액은 10만원으로 설정, 시간과물건 개수는 입력받기)
			
			14시에 마트를 방문하고 물건 개수가 3개 이하이면 5%로 할인
			18시에 마트를 방문하고 물건 개수가 5개 이하이면 10%로 할인
			20시에 마트를 방문하고 물건 개수가 10개 이하이면 20%로 할인
		 */
		
//		System.out.println("방문시간을 입력: ");
//		int s = sc.nextInt();	//시간
//		System.out.println("구매개수를 입력: ");
//		int c = sc.nextInt();	//개수
		int s = 14, c = 5;	//테스트종료용임시값
		int money = 100000;		//총 금액
		
		if (s==14 && c<=3) {
			money *= 0.95;
		} else if(s==18 && c<=5) {
			money *= 0.9;
		} else if(s==20 && c<=10) {
			money *= 0.8;
		} else {
			System.out.println("할인없음");
		}
		System.out.println(money);
		

		System.out.println("****** (3) ******");
		//중첩 반복문으로 5단부터 9단까지 출력
		for (int i = 5; i <= 9; i++) {
			System.out.print(i+"단  ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d ", i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println("****** (4) ******");
		//while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
		
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i%5 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1. 5의 배수의 합= "+sum);
		
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i%5 != 0) {	//5의 배수가 아니면 i를 증가시키고 반복문을 벗어난다.
				i++;
				continue;
			} else {
				sum += i;
			}
			i++;
		}
		System.out.println("2. 5의 배수의 합= "+sum);
		
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i%5 == 0) {	//5의 배수이면 sum에 대입한다.
				sum += i;
			}
			i++;
			continue;
		}
		System.out.println("3. 5의 배수의 합= "+sum);
		

		System.out.println("****** (5) ******");
		/*
		 * while, random()을 이용해서 (x,y)형태로 출력하는데 
		 * x+y합이 5이면 실행을 멈추는 코드를 작성. 
		 * 5가 아니면 난수 계속 발생시키고출력 (x,y 범위는 1부터 5까지)
		 */
		while(true) {
			int x = (int)(Math.random()*5)+1;
			int y = (int)(Math.random()*5)+1;
			
			if (x+y==5) {
				System.out.println("프로그램종료");
				break;
			}
			System.out.println(x +" "+y);
		}
		
		

		
		
		

	}

}
