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
 *
 */

public class TestArray01 {

	public static void main(String[] args) {
		
		//1. ���� 5���� ������ �迭
		int arr1[] = new int[5];
		//�Ǽ� 10�� ������ �迭
		double arr2[] = new double[10];
		//�迭 ��� ���� ������ int�� �迭
		int arr3[] = new int[3];
		//�ε����� �ִ밪�� 4�� char�� �迭
		char arr4[] = new char[5];
		
		//for������ �迭 ����ϱ�
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("****** �Է¹��� ���� �迭�� ����,��� ******");
//		double arr5[] = new double[3];	//�Ǽ��� 3�� �迭 ����
//		
//		for (int i = 0; i < 3; i++) {
//			arr5[i] = sc.nextDouble();	//�Ǽ� 3���� �Է¹޾� arr5[i]�� �����Ѵ�.
//			System.out.println(arr5[i]);
//		}
		

		System.out.println("****** �Է¹��� ���� �� ******");
//		double arr6[] = new double[5];
//		int sum = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			arr6[i]=sc.nextDouble();
//			sum += arr6[i];
//			//�Ǽ��� �Է¹޾� �迭�� ����
//		}
//		System.out.println(sum/5.0);
		

		System.out.println("****** ū �� ��� ******");
		int arr7[] = new int[5];
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			arr7[i] = sc.nextInt();
			if (arr7[i] > max) {	//�Է¹��� ���� �ִ밪(max)���� ũ��,
				max = arr7[i];		//�Է°��� max�� ����
			}
		}
		System.out.println("���� ū ���� "+max);
		

		System.out.println("******  ******");
		int arr8[] = {10,20,30,40,50};
		
		

	}

}
