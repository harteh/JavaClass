package beakjoonJava;
import java.util.Scanner;

/**
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 * 
 * ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
 * ������İ� ���� N*1���� N*9���� ����Ѵ�.
 *
 */
public class Main2739 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", n,i,n*i);
		}

	}

}
