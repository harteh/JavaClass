import java.util.Scanner;
/**
 * break 는 반복문과 사용해야한다.
 * - if 문과 사용 시 에러발생 
 *
 */
public class TestForWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		double sum=0;
//		int i = 0;
//		
//		// 입력받은 값의 누적합을 구하고
//		// 입력받은 횟수로 나눈 값
//		while ((i=sc.nextInt()) != 0) { //0을 입력하면 프로그램 종료
//			sum += i;
//			num++;	//내가 입력한 정수의 개수
//		}
//		System.out.println(num+" "+sum/num);
		

		System.out.println("****** 1-20까지 do-while ******");
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		} while (i<=20);
		
		
		System.out.println();
		System.out.println("****** a-z  ******");
		char a='a';	//a=97
		
		do {
			System.out.print(a);
			a=(char)(a+1);	//97+1 '98'을 문자로 형변환한다.
		} while (a <= 'z'); // a가 z가 될때까지
		

		System.out.println();
		System.out.println("****** a-z  ******");
		

	}

}
