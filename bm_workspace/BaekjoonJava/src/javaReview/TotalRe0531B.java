package javaReview;

import java.util.Scanner;

/*
 * 제출용 (6/3)
 * .java 파일을 Archive File 로 export 혹은 폴더를 압축
 * p.53
 * p.65, 68
 * 3.4.5
 * p.117, 121
 * p.123 문제풀기 - 새파일(TotalRe0531C)로 저장
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
 * 참고 : https://do-shinny-it.tistory.com/10
 * byte는 8비트, 
 * 8비트의 2진수로 표현할 수 있는 값의 개수-> 2의 8승
 * -> 256개 = (부호없는 정수) 0부터 255까지의 정수를 나타낼 수 있다.
 * -> =128 ~ 127까지의 범위를 가진다.
 * 
 * 답인 227은 범위를 넘어가게 된다. -> 오버플로우 발생
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
 * 4. p.109참고
 * while문 이용해서 입력받은 값의 합을 출력.
 * 0이 입력되면 종료하고 합을 출력

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
 * 5. 구구단
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
 * while, break문을 사용해 0이 입력될때까지 
 * 입력한 숫자의 개수를 출력
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
 * 키보드로 정수 5개 입력받아 가장 큰수 출력
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