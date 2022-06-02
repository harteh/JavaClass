package review;

import java.util.Scanner;

/*
 * 1. 5���� 10������ �����������͸� �Է¹޾�
 * 5~10�̿��� �������� �ԷµǸ� ���ٽ��Է¡��̶�� ����Ѵ�. 
 * �Է¹��� �������� Calc class�� calculate()�Լ��� �̿��Ͽ�
 * 1���� �Է¹��� ���ڱ��� Ȧ���� ���ϴ� ���α׷��� �ۼ��ض�. 
 * (calculate()�Լ��� int�������� �Է¹޾�
 * 1���� �Է¹��� ���ڱ��� Ȧ���� ���� ���Ͽ� �����ϴ� �Լ�)
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
				System.out.println("�ٽ� �Է�");
				continue;
			}
			System.out.println(c.calculate(n));
		}
		
	}
}

/*
 * 2. ���� �Է¹޾� high��� �Լ��ȿ��� �Է��� �� �� �ִ밪 ���ض�.
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


