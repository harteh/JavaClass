package arraypart;
import java.util.Scanner;

/**
 * �迭 api
 * https://docs.oracle.com/javase/8/docs/api/index.html
 * 
 * for-each��
 * - �迭�� �� ��Ҹ� ���������� �����Ѵ�.
 * 
 * for(int i : num){}
 * 
 *   ** 2���� �迭 **  
 * - ���
 * int ary[][];
 * ary = new int[2][5];
 * -> int ary[][] = new int[2][5];
 * -> 2�� 5��
 * [][][][][]
 * [][][][][]
 * 
 * 2���� �迭�� ����
 * - �迭��.length -> ���� ����
 * - �迭��[���� �ε���].length -> ���� ����
 * 
 *  ** �������� �迭 **
 *  
 *  
 *
 */
public class Array02 {

	public static void main(String[] args) {
		
		int []num= {1,2,3,4,5};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i : num) {
			System.out.print(i);
		}
		System.out.println();
		
		String fruit[] = {"�ٳ���", "����", "���"};
		for(String s : fruit) {
			System.out.print(s);
		}
		System.out.println();
		
		
		System.out.println("****** 2���� �迭 ******");
		//�ϳ��� ���� 5�� 5�� ����
		char ary[][] = new char[5][5];
		//�Ǽ��� 5�� 2�� ����
		double ary1[][] = new double[5][2];

		
		System.out.println("****** 2���� �迭 �ʱ�ȭ ******");
		int c[][] = {{1,2,3},
					 {4,5,6}};
		
		for(int i=0; i<2; i++) {	//��
			for(int j=0; j<3; j++) {	//��
				System.out.println( c[i][j] );
			}
		}
		

		System.out.println("****** �Ǽ��� 2���� 2�� 3�� ���� ******");
		Scanner sc = new Scanner(System.in);
		double ary2[][] = new double[2][3];
		
//		for (int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				ary2[i][j]=sc.nextDouble();
//				System.out.println( ary2[i][j]);
//			}
//		}


		System.out.println("****** ���� 10�� �Է¹޾� 5�� ��� ���(1�����迭) ******");
		int ary3[] = new int[10];
		
		for (int i=0; i<ary3.length; i++) {
			ary3[i]=sc.nextInt();
			if (ary3[i]%5==0) {
				System.out.println("5�ǹ��:" + ary3[i]);
			}
		}
		

		
		
		

	}

}
