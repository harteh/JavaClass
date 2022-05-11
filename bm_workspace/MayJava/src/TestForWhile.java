import java.util.Scanner;

public class TestForWhile {

	public static void main(String[] args) {
		
		System.out.println("****** 0-9 ******");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("****** 0-100까지의 합 1. ******");
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("****** 0-100까지의 합 2. ******");
		int total = 0;
		for (int i = 100; i <=0 ; i--) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("****** 0~10 중 짝수만 출력 ******");
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();

		//중첩반복문
		System.out.println("****** 중첩반복문 1 ******");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+" "+j+"  ");
			}
			System.out.println();
		}
		
		System.out.println("****** 중첩반복문 2 ******");
		/*
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("****** 중첩반복문 3 ******");
		/*
		 *     1			//i=0, 공백 4, 숫자 1
		 *    123			//i=1, 공백 3, 숫자 3
		 *   12345			//i=2, 공백 2, 숫자 5
		 *  1234567			//i=3, 공백 1, 숫자 7
		 * 123456789		//i=4, 공백 0, 숫자 9
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

		
		System.out.println("****** 0-10 while 문 ******");
		int i=0;
		while (i<=10) {
			System.out.print(i);
			i++;
		}
		
		System.out.println();
		System.out.println("****** 0-10 짝수만 while if 문 ******");
		i=0;
		while (i<10) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			i++;	// 위치가 중요함.
		}

		System.out.println();
		System.out.println("****** 입력받은 값들의 합 ******");
		sum = 0;
//		int n=100;	// 0이 아님을 인식하기 위해서 초기화해줌.
		int n =0; //테스트종료용임시값
		Scanner sc = new Scanner(System.in);
		
		while (n != 0) {	// n이 0이 아닐때까지 while문 반복
			System.out.println("입력: ");
			n = sc.nextInt();	//0을 입력하면 종료됨.
			sum += n;	//입력받은 값들의 합
		}
		System.out.println("입력받은 값들의 합= "+sum);

		/*
		 * 무한루프 
		 * while(true){}
		 * - while문에서 많이 쓰임
		 * - 프로그램의 정상적인 실행이 아님.
		 * 무한루프를 빠져나오기 위해서 break 제어문자가 필요하다.
		 * 
		 * break : 반복문 하나를 완전히 빠져나갈 때 사용
		 * - break문은 하나의 반복문만 벗어남
		 * -- 중첩 반복의 경우 안쪽 반복문의 break문이 실행되면 안쪽 반복문만 벗어남
		 */
		
		System.out.println("****** 특정값 입력 시 반복문 종료  ******");
		while (true) {
			System.out.println("이름 입력: ");
//			String name = sc.next();
			String name = "준수"; //테스트종료용임시값
			
			//문자열비교는 equals
			if (name.equals("준수")) {
				System.out.println("프로그램종료");
				break;
			}
			System.out.println(name);
		}
		

		System.out.println("****** 1~6까지 난수발생 ******");
		while (true) {
			n = (int)(Math.random()*6)+1;
			if (n == 6) {
				System.out.println("프로그램종료");
				break;
			} else {
				System.out.println(n);
			}
		}
		
		
		
		
	}

}
