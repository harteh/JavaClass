package arraypart;
import java.util.Scanner;

/**
 * �迭(array)
 * - �ѹ��� ���� �޸� ���� ���� ����
 * - ���� Ÿ���� �����͵��� ���������� �����
 * - �迭 �ε����� 0���� ����
 * 
 * int 		ary[]	= new int[10]
 * �ڷ���	�迭��[]= new �ڷ���[�����Ͱ���];
 * -'�迭 ����' 		= '�迭 ����'
 * - int�� �����Ͱ� 10���� �迭 : 40����Ʈ
 * 
 * �迭����
 * - int a[];	//�迭�� ���� ���۷��� ���� a�� ����
 * 
 * �迭 �ʱ�ȭ
 *  int ary[] = {1,2,3};
 *  - �ʱ�ȭ�Ҷ��� []���� ������ �ȵ�.
 *  - �Է� ������� ����ȴ�.
 *  
 *  �迭 ���
 *  System.out.println(ary[0]);
 *  
 *  �迭�� ũ��
 *   - �迭��.length
 *   - �迭�� ũ��� �������� �ʴ´�. 
 *
 */

public class Array01 {

	public static void main(String[] args) {
		
		//1. ���� 5���� ������ �迭
		int ary1[] = new int[5];
		//�Ǽ� 10�� ������ �迭
		double ary2[] = new double[10];
		//�迭 ��� ���� ������ int�� �迭
		int ary3[] = new int[3];
		//�ε����� �ִ밪�� 4�� char�� �迭
		char ary4[] = new char[5];
		
		//for������ �迭 ����ϱ�
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("****** �Է¹��� ���� �迭�� ����,��� ******");
//		double ary5[] = new double[3];	//�Ǽ��� 3�� �迭 ����
//		
//		for (int i = 0; i < 3; i++) {
//			ary5[i] = sc.nextDouble();	//�Ǽ� 3���� �Է¹޾� ary5[i]�� �����Ѵ�.
//			System.out.println(ary5[i]);
//		}
		

		System.out.println("****** �Է¹��� ���� �� ******");
//		double ary6[] = new double[5];
//		int sum = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			ary6[i]=sc.nextDouble();
//			sum += ary6[i];
//			//�Ǽ��� �Է¹޾� �迭�� ����
//		}
//		System.out.println(sum/5.0);
		

		System.out.println("****** ū �� ��� ******");
		int ary7[] = new int[5];
		int max = 0;
		
//		for (int i = 0; i < 5; i++) {
//			ary7[i] = sc.nextInt();
//			if (ary7[i] > max) {	//�Է¹��� ���� �ִ밪(max)���� ũ��,
//				max = ary7[i];		//�Է°��� max�� ����
//			}
//		}
		System.out.println("���� ū ���� "+max);
		
		System.out.println("****** �迭�� ũ�� (�迭 ��հ� ���ϱ�) ******");
		int ary8[] = new int[5];
		double sum = 0;
		
		//���� 5�� �Է��ؼ� ��ձ��ϱ�
//		for (int i = 0; i < ary8.length; i++) {
//			ary8[i] = sc.nextInt();
//			sum += ary8[i];
//		}
		System.out.println("�迭�� ��հ�: "+ sum / ary8.length);
		

		System.out.println("****** �迭�� ���� ******");
		//����Ʈ(7��) �� ���� �ִ� �ο����� �Է��ϰ� ������ ���϶�
		int ary9[] = new int[7];
		int sum2 = 0;
		
//		for (int i = 0; i < ary9.length; i++) {
//			ary9[i] = sc.nextInt();	//�� ���� �ο��� �Է�
//			sum2 += ary9[i];
//		}
		System.out.println("�� �ο�: " + sum2);
		

		System.out.println("****** �Ǻ���ġ���� ******");
		int ary10[] = new int[10];	//1 2 3 5 8 13 21 34 55 89
		
		ary10[0] = 1;
		ary10[1] = 2;
		
		for(int i= 0; i< 8; i++) {
			 ary10[i+2]= ary10[i] + ary10[i+1];
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(ary10[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("****** �Է¹��� ��(4��)�� �հ� �� ******");
		int sum3 = 0;  //���պ��� 
		int multi = 1; //�Ѱ�����
		int ary[]=new int[4];
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();
			sum3 += ary[i];
			multi *= ary[i];
		}
		System.out.printf("����: %d, �Ѱ�: %d", sum3, multi);
		
		
		
	}

}
