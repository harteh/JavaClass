package totalRe0531;

import java.util.Scanner;

/*
 * 3 ���� �ʰ� 
 * 4 while
 * * ������
 * 5 �Է��� ������ ������ ���
 * 6 ���� ū �� ���
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
public class PageEtc {
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
 * *. ������
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
 * 5. while, break���� ����� 0�� �Էµɶ����� �Է��� ������ ������ ���
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
 * 6. Ű����� ���� 5�� �Է¹޾� ���� ū�� ���
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
		System.out.println("�ִ밪: "+max);
	}
}
