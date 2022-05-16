import java.util.Scanner;
/**
 * do {
 * 		�۾��� 
 * } while(���ǽ�);
 * 
 * - ������ �ּ� �ѹ��� �����
 *
 */
public class TestDoWhile {

	public static void main(String[] args) {

		System.out.println("****** do~while ******");
		int i=0;	//�ʱ��
		
		do {
			System.out.print(i+" ");
			i++;	//������
		} while (i<10);	//���ǽ�
		

		System.out.println();
		System.out.println("****** 1-20���� �� do~while ******");
		i=1;
		int sum=0;
		do {
			System.out.print(i +" ");
			sum += i;
			i++;
		} while (i<=20);
		System.out.println();
		System.out.println("��= " + sum);
		

		System.out.println("****** ���ڿ� �Է� ******");
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("���ڿ��� �Է��ϼ��� :");
//			str = sc.next();
			str = "exit";	//�׽�Ʈ������ӽð�
			
			if(str.equals("exit")) {
				System.out.println("���α׷�����");
			} else {
				System.out.println(str);
			}
			
		} while (!str.equals("exit"));	//�Է¹��� ���ڿ��� exit �ƴҶ����� �Է¹޴´�.

		
		System.out.println("****** ���ڸ� �Է��Ͽ� ���� ���� ���ߴ� ���� ******");
		/*
		 *  ������18�� ����
		 *  �Է��Ѽ��ڰ� ����(18)�� �ƴ� ��� ũ�ų� ������ �˷��ش�. 
		 *  ���������� ������ ���� �Է��� �ݺ��ϰ� ������ ���� �Ŀ��� �õ��� Ƚ�� ���
				������) ���� �Է�: 25
				25���� �۴�!!
				���� �Է�: 10
				10���� ũ��!!
				���� �Է�: 18
				�����̴�!!
				�õ��� Ƚ���� 3���̴�.
		 */
		int ans = 18;
		int cnt = 0;
		
		while(true) {
			System.out.println("���� �Է�: ");
//			int num = sc.nextInt();
			int num=18;	//�׽�Ʈ������ӽð�
			cnt++;
			
			if (num == ans) {
				System.out.println("�����Դϴ�.");
//				System.out.println("�õ��� Ƚ��: "+cnt);
				break;
			} else {
				System.out.println( num>ans ? num+"���� �۴�!" : num+"���� ũ��!"  );
			}
		}
		System.out.println("�õ��� Ƚ��: "+cnt);
		
		

		System.out.println("****** ���� ����ȯ ******");
		System.out.println("�ѱ��� ���� �Է�: ");
		
//		char c=sc.next().charAt(0);	//A -> 65, a -> 97, c -> 99, d -> 100
		char c='d';	//�׽�Ʈ������ӽð�
		
		int n = (int)c;		//���� �Է��� ���ڸ� ������ ��������ȯ�Ѵ�.
		System.out.println(n);

		System.out.println("****** �����Է� ******");
		for (int j = 97; j <= n; j++) {	//d�� �Է��ϸ�: 97 ~ 100
			for(int k = j; k < n; k++) {	//a(97)���� ���� �Է��� ��(n=99) �ٷ� ������
				char ch = (char)k;
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		 * c: �Է¹��� ����
		 * n: �Է¹��� ���ڸ� ������ ��ȯ(����)
		 * j: 97(a)
		 * j<=n: 97���� �Է¹��� ������ �ƽ�Ű�ڵ������ ����
		 * j++:  97���� ��� �������� ����
		 * 
		 * 'd' �Է¹޾��� ���(100)
		 * n=99 
		 * j=97 k=97, j=97 k=98, j=97 k=99
		 * j=98 k=98, j=98 k=99
		 * j=99 k=99
		 * 
		 */
		
		System.out.println("****** 1-10���� ���� ���ϴµ� ���� 30�� �Ǹ� Ż�� ******");
		sum = 0;
		i = 1;
		while (i<=10) {
			sum += i;
			if (sum >= 30) {
				break;
			}
			i++;
		}
		System.out.println(sum);
		

		System.out.println("****** 0~9���� �� �߿��� Ȧ���� ���(while, if, continue) ******");
		
		i = 0;
		while (i<=9) {
			i++;	// 0������ 0�� ¦���̹Ƿ� �������� if�� ������ ���� ������ �ȵ�.
			if (i%2==0) {	//¦���̸� ����
				continue;
			} else {
				System.out.println(i);
			}
		}
		

	}

}