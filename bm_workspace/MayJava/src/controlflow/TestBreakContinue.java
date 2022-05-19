package controlflow;
import java.util.Scanner;

public class TestBreakContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** ������ ¦���ܸ� ��� (continue) ******");
		for (int i = 2; i < 9; i++) {	//2�ܺ��� 9�ܱ���
			for (int j = 1; j < 9; j++) {
				if (i%2==0) {
					System.out.printf("%d*%d=%d ", i,j,i*j);
				}
				continue;
			}
			System.out.println();	//�� ����
		}
		
		for (int i = 2; i < 9; i++) {	//2�ܺ��� 9�ܱ���
			for (int j = 1; j < 9; j++) {
				if (i%2==1) {
					continue;
				} else {
					System.out.printf("%d*%d=%d ", i,j,i*j);
				}
			}
			System.out.println();	//�� ����
		}
		
		System.out.println();
		System.out.println("****** (continue) ******");
//		System.out.println("���� 5�� �Է�: ");
//		
//		for (int i = 0; i < 5; i++) {	//Ƚ��
//			int n = sc.nextInt();
//			if (n<0) {
//				continue;	//����(�ö󰡼� �ݺ��� �ٽ� ����
//			} else {
//				System.out.print(n+" ");
//			}
//		}
		System.out.println("���α׷�����");

		System.out.println("****** (1) ******");
		/*
		 * 1. �� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�
		 * (������Ҽ��� ���� ù°�ڸ����� ���)
			��� ���) �� ���������� : 70 80
			��� : 75.0
		 */
		System.out.println("�� ���� ������ �Է�: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		int num1=64, num2=98;	//�׽�Ʈ������ӽð�
		double avg = (double)(num1 + num2) / 2;
		System.out.println(avg);
		
		System.out.printf("�� ���� ����: %d, %d\n�������: %.1f\n",
				num1, num2, (double)(num1+num2)/2);
		

		System.out.println("****** (2) ******");
		/*
		 * 2. �ð��� ���� ������ �ݾ� �������ִ� ���α׷�
			(�� �ݾ��� 10�������� ����, �ð������� ������ �Է¹ޱ�)
			
			14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� �����̸� 5%�� ����
			18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� �����̸� 10%�� ����
			20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� �����̸� 20%�� ����
		 */
		
//		System.out.println("�湮�ð��� �Է�: ");
//		int s = sc.nextInt();	//�ð�
//		System.out.println("���Ű����� �Է�: ");
//		int c = sc.nextInt();	//����
		int s = 14, c = 5;	//�׽�Ʈ������ӽð�
		int money = 100000;		//�� �ݾ�
		
		if (s==14 && c<=3) {
			money *= 0.95;
		} else if(s==18 && c<=5) {
			money *= 0.9;
		} else if(s==20 && c<=10) {
			money *= 0.8;
		} else {
			System.out.println("���ξ���");
		}
		System.out.println(money);
		

		System.out.println("****** (3) ******");
		//��ø �ݺ������� 5�ܺ��� 9�ܱ��� ���
		for (int i = 5; i <= 9; i++) {
			System.out.print(i+"��  ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d ", i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println("****** (4) ******");
		//while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
		
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i%5 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1. 5�� ����� ��= "+sum);
		
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i%5 != 0) {	//5�� ����� �ƴϸ� i�� ������Ű�� �ݺ����� �����.
				i++;
				continue;
			} else {
				sum += i;
			}
			i++;
		}
		System.out.println("2. 5�� ����� ��= "+sum);
		
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i%5 == 0) {	//5�� ����̸� sum�� �����Ѵ�.
				sum += i;
			}
			i++;
			continue;
		}
		System.out.println("3. 5�� ����� ��= "+sum);
		

		System.out.println("****** (5) ******");
		/*
		 * while, random()�� �̿��ؼ� (x,y)���·� ����ϴµ� 
		 * x+y���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�. 
		 * 5�� �ƴϸ� ���� ��� �߻���Ű����� (x,y ������ 1���� 5����)
		 */
		while(true) {
			int x = (int)(Math.random()*5)+1;
			int y = (int)(Math.random()*5)+1;
			
			if (x+y==5) {
				System.out.println("���α׷�����");
				break;
			}
			System.out.println(x +" "+y);
		}
		
		

		
		
		

	}

}