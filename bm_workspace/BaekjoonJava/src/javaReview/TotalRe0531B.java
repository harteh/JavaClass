package javaReview;

import java.util.Scanner;

/*
 * ����� (6/3)
 * .java ������ Archive File �� export Ȥ�� ������ ����
 * p.53
 * p.65, 68
 * 3.4.5
 * p.117, 121
 * p.123 ����Ǯ�� - ������(TotalRe0531C)�� ����
 * p.157, 158
 * p.172, 173
 * p.175-179 (?)
 * p.182, 183
 * p.207, 208, 209, 210, 218
 * p.260
 * P.279 Q5
 ** p.298 ~ 304
 * p.322-325
 * p.354, 356
 * p.506-507
 * p.525, 531, 536, 538. 551
 */

/*
 * 3. 
 * ���� : https://do-shinny-it.tistory.com/10
 * byte�� 8��Ʈ, 
 * 8��Ʈ�� 2������ ǥ���� �� �ִ� ���� ����-> 2�� 8��
 * -> 256�� = (��ȣ���� ����) 0���� 255������ ������ ��Ÿ�� �� �ִ�.
 * -> =128 ~ 127������ ������ ������.
 * 
 * ���� 227�� ������ �Ѿ�� �ȴ�. -> �����÷ο� �߻�
 * 
public class TotalRe0531B {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println((byte)(b+i));
	}
}
 */
/*
 * 4. p.109����
 * while�� �̿��ؼ� �Է¹��� ���� ���� ���.
 * 0�� �ԷµǸ� �����ϰ� ���� ���

public class TotalRe0531B {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int sum=0, i=0;
		
		while((i=sc.nextInt()) !=0) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
*/
/*
 * 5. ������
public class TotalRe0531B {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i +" * "+ j +" = "+ (i*j));
			}
			System.out.println();
		}
	}
}
 */
/*
 * 121
public class TotalRe0531B {
	public static void main(String[] args) {
		int sum=0;
		int num=0;
		for(num=0; ; num++) {
			sum+=num;
			if(sum>=100)
				break;
		}
		System.out.println("num: "+num+", sum: "+ sum);
	}
}
 */
/*
 * while, break���� ����� 0�� �Էµɶ����� 
 * �Է��� ������ ������ ���
public class TotalRe0531B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(true) {
			if(sc.nextInt() == 0) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
 */
/*
 * Ű����� ���� 5�� �Է¹޾� ���� ū�� ���
 *
public class TotalRe0531B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int[] arr = new int[5];
	}
}
*/
/*
 * 
 */
public class TotalRe0531B {
	public static void main(String[] args) {
	}
}