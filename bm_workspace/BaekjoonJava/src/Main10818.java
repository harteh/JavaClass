import java.util.Scanner;

/**
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
 * ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 * 
 * ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 *
 */
public class Main10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1. �迭�� ũ�� n �� �Է¹޴´�.
		int n = sc.nextInt();
		//2. nũ���� �迭�� �����Ѵ�.
		int ary[] = new int[n];
		
		//3. n���� ���� �Է¹޾� �迭�� �����Ѵ�.
		for (int i=0; i<n-1; i++) {
			ary[i] = sc.nextInt();
			System.out.println( ary[i] );
		}
		
		
	}

}
