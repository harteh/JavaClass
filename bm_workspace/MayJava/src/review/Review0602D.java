package review;

import java.util.Scanner;

/*
 * 1. 5부터 10까지의 정수형데이터를 입력받아
 * 5~10이외의 정수형이 입력되면 “다시입력”이라고 출력한다. 
 * 입력받은 정수값을 Calc class의 calculate()함수를 이용하여
 * 1부터 입력받은 숫자까지 홀수만 더하는 프로그램을 작성해라. 
 * (calculate()함수는 int형정수를 입력받아
 * 1부터 입력받은 숫자까지 홀수의 합을 구하여 리턴하는 함수)
 */
class Calc {
	int calculate(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				sum+=i;
			}
		}
		return sum;
	}
}

public class Review0602D {
	public static void main(String[] args) {

		Calc c = new Calc();
		Scanner sc = new Scanner(System.in);

		int n;
		while(true) {
			n = sc.nextInt();
			if(n<5 || n>10) {
				System.out.println("다시 입력");
				continue;
			}
			System.out.println(c.calculate(n));
		}
		
	}
}

/*
 * 2. 정수 입력받아 high라는 함수안에서 입력한 수 중 최대값 구해라.
 *
public class Review0602D {

	static void high(int[][] ary, int b, int c){
		int max = ary[0][0];
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				if(max < ary[i][j]) {
					max = ary[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		int[][] ary = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = sc.nextInt();
			}
		}
		
		high(ary, 3, 3);
	}
}
*/


