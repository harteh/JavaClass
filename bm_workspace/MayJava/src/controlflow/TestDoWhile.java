package controlflow;
import java.util.Scanner;
/**
 * do {
 * 		작업문 
 * } while(조건식);
 * 
 * - 무조건 최소 한번은 실행됨
 *
 */
public class TestDoWhile {

	public static void main(String[] args) {

		System.out.println("****** do~while ******");
		int i=0;	//초기식
		
		do {
			System.out.print(i+" ");
			i++;	//증감식
		} while (i<10);	//조건식
		

		System.out.println();
		System.out.println("****** 1-20까지 합 do~while ******");
		i=1;
		int sum=0;
		do {
			System.out.print(i +" ");
			sum += i;
			i++;
		} while (i<=20);
		System.out.println();
		System.out.println("합= " + sum);
		

		System.out.println("****** 문자열 입력 ******");
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("문자열을 입력하세요 :");
//			str = sc.next();
			str = "exit";	//테스트종료용임시값
			
			if(str.equals("exit")) {
				System.out.println("프로그램종료");
			} else {
				System.out.println(str);
			}
			
		} while (!str.equals("exit"));	//입력받은 문자열이 exit 아닐때까지 입력받는다.

		
		System.out.println("****** 숫자를 입력하여 정답 숫자 맞추는 게임 ******");
		/*
		 *  정답을18로 설정
		 *  입력한숫자가 정답(18)이 아닐 경우 크거나 작은지 알려준다. 
		 *  정답을맞출 때까지 숫자 입력을 반복하고 정답을 맞춘 후에는 시도한 횟수 출력
				실행결과) 숫자 입력: 25
				25보다 작다!!
				숫자 입력: 10
				10보다 크다!!
				숫자 입력: 18
				정답이다!!
				시도한 횟수는 3번이다.
		 */
		int ans = 18;
		int cnt = 0;
		
		while(true) {
			System.out.println("숫자 입력: ");
//			int num = sc.nextInt();
			int num=18;	//테스트종료용임시값
			cnt++;
			
			if (num == ans) {
				System.out.println("정답입니다.");
//				System.out.println("시도한 횟수: "+cnt);
				break;
			} else {
				System.out.println( num>ans ? num+"보다 작다!" : num+"보다 크다!"  );
			}
		}
		System.out.println("시도한 횟수: "+cnt);
		
		

		System.out.println("****** 문자 형변환 ******");
		System.out.println("한글자 문자 입력: ");
		
//		char c=sc.next().charAt(0);	//A -> 65, a -> 97, c -> 99, d -> 100
		char c='d';	//테스트종료용임시값
		
		int n = (int)c;		//내가 입력한 문자를 정수로 강제형변환한다.
		System.out.println(n);

		System.out.println("****** 문자입력 ******");
		for (int j = 97; j <= n; j++) {	//d를 입력하면: 97 ~ 100
			for(int k = j; k < n; k++) {	//a(97)부터 내가 입력한 수(n=99) 바로 전까지
				char ch = (char)k;
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		 * c: 입력받은 문자
		 * n: 입력받은 문자를 정수로 변환(정수)
		 * j: 97(a)
		 * j<=n: 97부터 입력받은 문자의 아스키코드까지의 범위
		 * j++:  97부터 상기 범위까지 증가
		 * 
		 * 'd' 입력받았을 경우(100)
		 * n=99 
		 * j=97 k=97, j=97 k=98, j=97 k=99
		 * j=98 k=98, j=98 k=99
		 * j=99 k=99
		 * 
		 */
		
		System.out.println("****** 1-10까지 합을 구하는데 합이 30이 되면 탈출 ******");
		sum = 0;
		i = 1;
		while (i<=10) {
			sum += i;
			if (sum >= 30) {
				break;
			}
			i++;
		}
		System.out.println(sum);
		

		System.out.println("****** 0~9까지 수 중에서 홀수만 출력(while, if, continue) ******");
		
		i = 0;
		while (i<=9) {
			i++;	// 0나누기 0은 짝수이므로 증감식이 if문 다음에 오면 실행이 안됨.
			if (i%2==0) {	//짝수이면 제외
				continue;
			} else {
				System.out.println(i);
			}
		}
		

	}

}
