import java.util.Iterator;
import java.util.Scanner;

/**
 * * �ҽ� -> ������ -> ����
 * .java -> .class
 * 
 * JVM : �÷����� �������̴�.
 * JDK : �ڹٰ��ߵ���
 * jre : �ڹ� ����ȯ��
 * 
 * �⺻�� Ÿ�� 8����
 * �������� ����
 * 
 * ���׿�����
 * �ݺ���
 * 
 */
public class Review0513 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int i = sc.nextInt();
//		switch (i) {
//		case 1:
//			System.out.println("!");
//			break;
//		case 2:
//			System.out.println("@");
//			break;
//		default:
//			System.out.println("*");
//			break;
//		}
		
		System.out.println("****** �ݺ��� ******");
		System.out.println("���� 5�� �Է�");
		
//		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {	//���� ����
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {	//�迭 ���
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		
		System.out.println("****** continue ******");
//		for(int i=0; i<5; i++) {
//			int n = sc.nextInt();
//			if (n <= 0) {
//				continue;	//������ 0�� ������, ����� �̴´�.
//			} else {
//				System.out.println(n);
//			}
//		}

		
		System.out.println("****** 50+11.8�� ����� �Ҽ����� ������ ����ض�. ******");
		System.out.printf("%.0f\n", 50+11.8);	//�ݿø���
		System.out.println((int)(50+11.8));		//�ݿø��ȵ�
		
		System.out.println("****** 0~30���� �� �߿��� 5�� ����� �����ϰ� ��� ******");
		//���� �ݺ����� break, continue
		
		int i=0;
		while(true) {
			if (i==0) {
				System.out.print(i+" ");
			}
			i++;
			if (i>30) {
				break;
			}
			if(i%5==0) {
				continue;
			} else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//for�� ���ѹݺ���
//		i=0;
//		for(;;) {
//			i++;
//			if (i%5==0) {
//				continue;
//			} else if (i==30) {
//				System.out.println("break");
//				break;
//			}
//		}
//		System.out.print(i+" ");
		
		i=0;
		while (true) {
			System.out.print(i+" ");
			i++;
			if (i>30) {
				break;
			} else if (i%5==0) {
				i++;
				continue;
			}
		}
		System.out.println();

		i=0;
		while (true) {
			if (!(i%5==0)) {
				System.out.print(i+" ");
			}
			i++;
			if (i<=30) {
				continue;
			} else {
				break;
			}
		}
		

		System.out.println();
		System.out.println("****** ���� 10���� �Է¹޾� ��� ��� ******");
		//(�迭, length�ʵ� ���)
		
//		int arr[] = new int[10];
//		int sum=0;
//		
//		for (int j = 0; j < arr.length; j++) {	//���� ����
//			arr[j] = sc.nextInt();
//			sum += arr[j];
//		}
//		System.out.println( (double)sum / arr.length );
		//��� Ƚ���� �迭�� ���̸� ����ϸ� �Ǵϱ� ���� �����ȸ��� ��..
		
		

		System.out.println("****** ���� 10���� �Է¹޾� 7�� ����� ��� ******");
		// (�迭)
		
//		int arr1[] = new int[10];
//		
//		for(int h = 0; h<arr1.length; h++) {
//			arr1[h] = sc.nextInt();
//		}
//		for (int j : arr1) {
//			if (j%7==0) {
//				System.out.print(j +" ");
//			}
//		}
		
		/* 
		Scanner s = new Scanner(System.in);
		int []a=new int[10];
		int sum=0;
		
		System.out.println("���� 10�� �Է�");
		for(i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			if(a[i]%7==0) {
				System.out.println(a[i]);
			}
			//sum+=a[i];
		}
		//System.out.println((double)sum/a.length);
		 * ����� �ڵ�
		 */

/*
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		for( i=0; i<4 ;i++) 
		sum+=ary[i];
		System.out.println(sum);	//7.0
*/

		System.out.println("****** while�� ******");
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		i = 0;
		while(i<ary.length) {
			sum += ary[i];
			i++;
		}
		System.out.println("while��: "+sum);
		
		System.out.println("****** do-while�� ******");
		sum=0.0;
		i = 0;
		do {
			sum += ary[i];
			i++;
		} while (i<ary.length);
		System.out.println("do-while��: "+sum);
		
		
		System.out.println("****** for-each�� ******");
		sum=0.0;
		
		//�迭 �����Ͱ� double���̱� ������ double ������ ����
		for(double j : ary) {
//			sum += ary[(int)j];	-> for-each���� �ε����� �ʿ����!!
			sum += j;
		}
		System.out.println("for-each��: "+sum);
		

		System.out.println("****** 3�� 3�� �迭�� 0~8���������� �ʱ�ȭ ******");
		int arr [][] = {{0,1,2},
				{3,4,5},
				{6,7,8}};
		

		System.out.println("****** 2�� 3�� �迭�� a~f�������ڷ� �ʱ�ȭ ******");
		char c[][]= {{'a','b'},{'c','d'},{'e','f'}};
		
		
		System.out.println("****** 2���� �迭�� �� ******");
		/*
		 * 3�� 4���������� �迭�� �����Ͽ� 0~9 ������������ �����ϰ� ����
		 * ������ 2���� �迭�� ���� ���
		 * ������) 5 4 1 5
		 * 			 0 5 3 5
		 *           7 8 1 4
		 *           ���� 48 
		 */
		
		int arr2[][] = new int[3][4];
		sum = 0;
		for (int j = 0; j < arr2.length; j++) {
			for (int j2 = 0; j2 < arr2[j].length; j2++) {
				arr2[j][j2] = (int)(Math.random()*10);
				System.out.print(arr2[j][j2]+" ");
				sum+=arr2[j][j2];
			}
			System.out.println();
		}
		System.out.println("���� "+(int)sum);
		


		
		
		

	}

}
