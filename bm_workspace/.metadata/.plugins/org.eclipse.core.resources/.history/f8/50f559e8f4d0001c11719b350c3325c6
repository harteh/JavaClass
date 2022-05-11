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

	}

}
