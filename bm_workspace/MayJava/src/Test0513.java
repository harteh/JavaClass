import java.util.Scanner;

public class Test0513 {

	public static void main(String[] args) {
		
		//-1�� �Էµɶ����� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
//		int n = 0;	//�Է��� �� ����ϱ����� ������ ����
//		
//		while (true) {
//			if ((n=sc.nextInt())==-1) {
//				break;
//			}
//			System.out.println(n);
//		}

		System.out.println("****** �迭�� �ִ밪 ���ϱ� ******");
		int arr[]= {5,2,7,1,8};
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		};
		System.out.println("�ִ밪: "+max);

		System.out.println("****** for-each ������ ���ձ��ϱ� ******");
		int ary[] = {1,2,3,4,5};
		int sum=0;
		
		for (int i : ary) {
			sum += i;
		}
		System.out.println("��: "+sum);
		

		System.out.println("****** 2�����迭 ��� ******");
		int ary1[][] = new int[3][3];
		int ary2[][] = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2[i].length; j++) {	//�ش� ���� ���� ������ŭ �ݺ� 
				System.out.print(ary2[i][j] +" ");
			}
			System.out.println();
		}
		

		System.out.println("****** ���������迭 ��� ******");
		int ary3[][] = {{10,11,12},
						{20,21},
						{30,31,32},
						{40,41}};
		
		for (int i = 0; i < ary3.length; i++) {
			for (int j = 0; j < ary3[i].length; j++) {
				System.out.print(ary3[i][j] + " ");
			}
			System.out.println();
		}
		


	}

}
