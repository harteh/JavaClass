import java.util.Scanner;
/**
 * break �� �ݺ����� ����ؾ��Ѵ�.
 * - if ���� ��� �� �����߻� 
 *
 */
public class TestForWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		double sum=0;
//		int i = 0;
//		
//		// �Է¹��� ���� �������� ���ϰ�
//		// �Է¹��� Ƚ���� ���� ��
//		while ((i=sc.nextInt()) != 0) { //0�� �Է��ϸ� ���α׷� ����
//			sum += i;
//			num++;	//���� �Է��� ������ ����
//		}
//		System.out.println(num+" "+sum/num);
		

		System.out.println("****** 1-20���� do-while ******");
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
			a=(char)(a+1);	//97+1 '98'�� ���ڷ� ����ȯ�Ѵ�.
		} while (a <= 'z'); // a�� z�� �ɶ�����
		

		System.out.println();
		System.out.println("****** a-z  ******");
		

	}

}
