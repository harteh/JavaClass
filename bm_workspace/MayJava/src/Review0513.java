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


		

	}

}
