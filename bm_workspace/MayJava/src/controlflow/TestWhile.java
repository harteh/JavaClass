package controlflow;
import java.util.Scanner;
/**
 * �ݺ��� : while, do while
 * 
 * while(���ǽ�){
 * 		�۾���
 * }
 * 
 */

public class TestWhile {

	public static void main(String[] args) {
		
//		int i=0;			//�ʱ��
//		
//		while (i<10) {		//���ǽ�
//			System.out.println(i);	//�ݺ��ϰ� ���� ���๮
//			i++;			//������
//		}
		
		//for������ �ٲٱ�
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		//1~10 �� Ȧ���� 1,3,5,7,9
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);				
//			i+=2;
//		}
		
		//1~10 �� Ȧ���� 1,3,5,7,9
//		int i=1;
//		while(i<=10) { //���ǽ�
//			if(i%2==1) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
//		int i = 10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		
		//������
//		System.out.println("������ �Է� : ");
//		int n = sc.nextInt();
//		
//		switch (n) {
//		case 2:
//			System.out.printf("**** %d�� ****\n", n);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", n,i, n*i);
//			}
//			break;
//		case 3:
//			System.out.printf("**** %d�� ****\n", n);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", n,i, n*i);
//			}
//			break;
//
//		default:
//			System.out.println("�߸��Է��߽��ϴ�.");
//			break;
//		}
		
		//1~99(while)
//		int i = 1;
//		while (i<100) {
//			if(i%2==0 || i%3==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//
		//������ 2.
//		for (int i = 2; i <= 9; i++) {		//��
//			for (int j = 1; j <= 9; j++) {	//��
//				System.out.printf("%d*%d=%d\n", i,j,i*j);
//			}
//			System.out.println("***********");
//		}
		
		
		/* �����׸���
		 * �������� ���,
		 * i���� ����� j���� �������� �������� ������ ¥����
		 */
//		for (int i=0; i<5; i++) {		//i �� ����
//			for (int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//���ﰢ��
		/*
		 * i=0, j=5
		 * i=1, j=4
		 * i=2, j=3
		 */
		System.out.println("************ ���ﰢ ************");
		for (int l=0; l<5; l++) {
			for (int m=0; m<5-l; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("************ ���ﰢ?? ************");
		
		for (int i=0; i<5; i++) {			//i: 0.1.2.3.4
			for (int j=5; j<0; j--) {		//j: 5.4.3.2.1
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("************ ���� �ﰢ ************");
		/*
		 *     *	i=0  ���� j=4  ��1
		 *    **	i=1  ���� j=3  ��2
		 *   ***	i=2  ���� j=2  ��3
		 *  ****	i=3  ���� j=1  ��4
		 * *****	i=4  ���� j=0  ��5
		 */
		
		for(int i=0; i<5; i++) {	//�� 0,1,2,3,4
			
			for(int j=0; j<4-i; j++) {//���� 4,3,2,1,0
				System.out.print(" ");
			}
			
			for (int j=0; j<i+1; j++) {	//�� 1,2,3,4,5
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println("************ ���ʸ����� ************");
		/*
		 *     *	i=0  ���� j=4  ��1
		 *    **	i=1  ���� j=3  ��2
		 *   ***	i=2  ���� j=2  ��3
		 *  ****	i=3  ���� j=1  ��4
		 * *****	i=4  ���� j=0  ��5
		 *  ****	i=5  ���� j=1  ��4
		 *   ***	i=6  ���� j=2  ��3
		 *    **	i=7  ���� j=3  ��2
		 *     *	i=8  ���� j=4  ��1
		 */
		for (int i = 0; i < 9; i++) {	
			if (i<5) {	//�� ����, ���� ���� //��i: 0,1,2,3,4
				
				for (int j=0; j<4-i; j++) {//���� 4,3,2,1,0
					System.out.print(" ");					
				}
				for (int j=0; j<i+1; j++) {//�� 1,2,3,4,5
					System.out.print("*");
				}
								
			} else {	//�� ����, ���� ����	//��i: 5,6,7,8
				
				for (int j=0; j < i-4; j++) {		//���� 1,2,3,4
					System.out.print(" ");
				}
				for (int j=0; j < 9-i; j++) {		//�� 4,3,2,1
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}