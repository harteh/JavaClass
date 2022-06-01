package totalRe0531;

import java.util.Scanner;

/*
 * 3 범위 초과 
 * 4 while
 * * 구구단
 * 5 입력한 숫자의 개수를 출력
 * 6 가장 큰 수 출력
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
public class PageEtc {
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

public class PageEtc {
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
 * *. 구구단
public class PageEtc {
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
 * 5. while, break문을 사용해 0이 입력될때까지 입력한 숫자의 개수를 출력
 *
public class PageEtc {
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
 * 6. 키보드로 정수 5개 입력받아 가장 큰수 출력
 */
public class PageEtc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값: "+max);
	}
}
