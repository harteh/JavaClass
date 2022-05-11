import java.util.Scanner;

public class TestForWhile {

	public static void main(String[] args) {
		
		System.out.println("****** 0-9 ******");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("****** 0-100������ �� 1. ******");
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("****** 0-100������ �� 2. ******");
		int total = 0;
		for (int i = 100; i <=0 ; i--) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("****** 0~10 �� ¦���� ��� ******");
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();

		//��ø�ݺ���
		System.out.println("****** ��ø�ݺ��� 1 ******");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+" "+j+"  ");
			}
			System.out.println();
		}
		
		System.out.println("****** ��ø�ݺ��� 2 ******");
		/*
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("****** ��ø�ݺ��� 3 ******");
		/*
		 *     1			//i=0, ���� 4, ���� 1
		 *    123			//i=1, ���� 3, ���� 3
		 *   12345			//i=2, ���� 2, ���� 5
		 *  1234567			//i=3, ���� 1, ���� 7
		 * 123456789		//i=4, ���� 0, ���� 9
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

		
		System.out.println("****** 0-10 while �� ******");
		int i=0;
		while (i<=10) {
			System.out.print(i);
			i++;
		}
		
		System.out.println();
		System.out.println("****** 0-10 ¦���� while if �� ******");
		i=0;
		while (i<10) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			i++;	// ��ġ�� �߿���.
		}

		System.out.println();
		System.out.println("****** �Է¹��� ������ �� ******");
		sum = 0;
//		int n=100;	// 0�� �ƴ��� �ν��ϱ� ���ؼ� �ʱ�ȭ����.
		int n =0; //�׽�Ʈ������ӽð�
		Scanner sc = new Scanner(System.in);
		
		while (n != 0) {	// n�� 0�� �ƴҶ����� while�� �ݺ�
			System.out.println("�Է�: ");
			n = sc.nextInt();	//0�� �Է��ϸ� �����.
			sum += n;	//�Է¹��� ������ ��
		}
		System.out.println("�Է¹��� ������ ��= "+sum);

		/*
		 * ���ѷ��� 
		 * while(true){}
		 * - while������ ���� ����
		 * - ���α׷��� �������� ������ �ƴ�.
		 * ���ѷ����� ���������� ���ؼ� break ����ڰ� �ʿ��ϴ�.
		 * 
		 * break : �ݺ��� �ϳ��� ������ �������� �� ���
		 * - break���� �ϳ��� �ݺ����� ���
		 * -- ��ø �ݺ��� ��� ���� �ݺ����� break���� ����Ǹ� ���� �ݺ����� ���
		 */
		
		System.out.println("****** Ư���� �Է� �� �ݺ��� ����  ******");
		while (true) {
			System.out.println("�̸� �Է�: ");
//			String name = sc.next();
			String name = "�ؼ�"; //�׽�Ʈ������ӽð�
			
			//���ڿ��񱳴� equals
			if (name.equals("�ؼ�")) {
				System.out.println("���α׷�����");
				break;
			}
			System.out.println(name);
		}
		

		System.out.println("****** 1~6���� �����߻� ******");
		while (true) {
			n = (int)(Math.random()*6)+1;
			if (n == 6) {
				System.out.println("���α׷�����");
				break;
			} else {
				System.out.println(n);
			}
		}

		System.out.println("****** Ư���� �Է��������� ���� ī���� ******");
//		n=0;
//		while(true) {
//			if(sc.nextInt() == -1) {
//				System.out.println("���α׷�����");
//				break;
//			}
//			n++;
//		}
//		System.out.println(n);
		// -1 �Է������� �Է°��� ���� ī����
		

		System.out.println("****** 1~99 �� 2�� ����̸鼭 3�� ��� ��� (while) ******");
		int k = 1;
		while(k <100) {
			if (k%2==0 && k%3==0) {
				System.out.print(k+ " ");
			}
			k++;
		}
		
		/*
		 * continue 
		 * - �ݺ����� ���������� �ʴ´�.
		 * - �ݺ��� ���� ���� ���� �ݺ��� ����
		 */

		System.out.println();
		System.out.println("****** continue ******");
		
		sum = 0;
		for (int j = 1; j <= 100; j++) {
			if (j%2==0) {
				continue;	//¦���϶� �ݺ��� �ݺ�
			} else {
				System.out.print(j+" ");
				sum +=j;
			}
		}
		System.out.println();
		System.out.println("Ȧ���� ������= "+sum);
		
		
	}

}