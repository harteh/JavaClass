package java200;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		System.out.println("********** p.205 **********");
		//�迭�� �� ��ҿ� 5,4,3,2,1 �� ������� �����ؼ� ǥ��
		int arr[] = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=5 - i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		System.out.println();
		System.out.println("********** p.215 **********");
		//������ �Է¹޾Ƽ� �հ�, ���, �ְ���, �������� ǥ��
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("��� ��: ");
		int n=sc.nextInt();
		int[] point=new int[n];		//�ο� �� ��ŭ�� �迭
		
		for(int i=0; i<point.length; i++) {
			System.out.printf("%d ���� ����: \n", i+1);
			point[i] = sc.nextInt();	//������� ���� �Է� ����
			sum += point[i];	//���� �հ�
		}
		System.out.printf("���� �հ� = %d, ��� = %.1f\n", sum, (double)(sum/n));
		
		//�ְ���, ������
		int max = point[0];
		int min = point[0];
		
		for (int i = 1; i < point.length; i++) {
			if (point[i] > max)
				max = point[i];
			if (point[i] < min)
				min = point[i];
		}
		System.out.printf("�ְ��� = %d��, ������ = %d��\n", max, min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
