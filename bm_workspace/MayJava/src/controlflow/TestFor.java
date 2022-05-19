package controlflow;
import java.util.Scanner;
/**
 * �ݺ��� : for, while, do while
 * 
 * for(�ʱ��;���ǽ�;������){
 * 		�ݺ��ϰ� ���� ���๮
 * }
 * �ʱ�� ��������. ; �ʼ�.
 * 
 * 
 */
public class TestFor {

	public static void main(String[] args) {
		
		//0~10���� ����ϴ´� ¦���� ���
//		for (int i = 0; i <= 10; i+=2) {
//			System.out.print(i+ " ");
//		}
//		System.out.println();
		
		//1~100���� �� �߿���
		// 5�� ����̰� 6�� ����� �� ���
//		for (int i = 0; i <= 100; i++) {
//			if (i%5==0 && i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		
		//************* ������ ���ϱ� *************
//		int sum = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		for (int i = 0; i < 15; i++) {
//			System.out.print("*");
//		}
		
//		for(int i=1; i<=15; i++) {
//			System.out.print("*");
//			if(i%5==0) {
//				System.out.println();
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���?");
//		
//		int dan = sc.nextInt();
//		
//		for (int i = 9; i >=1; i--) {
//			System.out.printf("%d*%d=%d\n", dan,i,dan*i);
//		}
		
		
		// 1.	5/3 �� ������� �Ҽ��� ��° �ڸ� ���� ����ض�. (printf ���)
		System.out.printf("%.2f\n", 5/3.0);
		
		//2. Ű(double)�� �ϳ� �Է¹޾�  
		// 160���� ������ ��small��, 170���� ������ ��medium��, 180���� ������ ��large�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ��� : ");
		double height1 = sc.nextDouble();
		
		if (height1 <= 160) {
			System.out.println("small");
		} else if(height1 <= 170) {
			System.out.println("medium");
		} else {
			System.out.println("large");
		}
		
		//3. n1�� 50, n2�� 100���� �ʱ�ȭ�Ͽ� 
		//�� �� �� ū ���� �Ǻ��Ͽ� ����ض�. (���� ������ Ȱ��)
		
		int n1 = 50, n2 = 100;
		System.out.println(n1 > n2 ? n1 : n2);
		
		//4. ���̸� �������� ��øif���� ����Ͽ� ����ض�.
		//(����, Ű, ������ ���� ������ ����)
		
		System.out.println("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���: ");
		double height2 = sc.nextDouble();
		String size;
		
		/*
		if (age >= 20) { 				//20�� �̻�
			if(height2 >= 175) { 		//20�� �̻��̰� Ű 175 �̻�
				size = "L";
			} else if(height2 >= 165) { //20�� �̻��̰� Ű 165 �̻�
				size = "M";
			} else {  					//20�� �̻��̰� Ű 165 �̸�
				size = "S";
			}
		} else { 						//20�� �̸�
			if(height2 >= 170) { 		//20�� �̸��̰� Ű 170 �̻�
				size = "L";
			} else if(height2 >= 160) { //20�� �̸��̰� Ű 160 �̻�
				size = "M";
			} else {  					//20�� �̸��̰� Ű 160 �̸�
				size = "S";
			}
		}
		*/
		
		if (age<20) {	//���̰� 20�� �̸�
			if (height2<160) {
				size="S";
			} else if(height2<170) {
				size="M";
			} else {
				size="L";
			}
		} else {	//���̰� 20�� �̻�
			if (height2<165) {
				size="S";
			} else if(height2<175) {
				size="M";
			} else {
				size="L";
			}			
		}
		
		System.out.printf("����: %d, Ű: %.1f, ������: %s\n", age, height2, size);
		
		
		//5.	1���� 50������ ������ ����ض�.(for)
		for(int i=1; i <=50; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//5-1. 1~50 ���� �� 6�� ����� ����ض�.(for, if)
		for(int i=1; i <=50; i++) {
			if (i%6 ==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		
		//5-2. 1~50������ ���� ����ض�.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum+=i;
		}
		System.out.println("1���� 50������ ��: " + sum);
		
		//5-3. 1~50 ������ random�Լ��� ���� ���� �� �� 
		//������ �� �ϳ�(����)����ض�.
		int num1 = (int)Math.random()*50 +1;
		System.out.println("����: "+num1);
		
		//6.	a=10, b=20���� �ʱ�ȭ�ϰ�, 
		//������(+,-,*,/)�� �ϳ��� �Է¹޴´�. 
		//+�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸� ���� ���Ͽ� ����ض�.(switch-case�� ���)
		int a=10, b=20;
		System.out.println("������ �ϳ�(+,-,*,/)�� �Է��ϼ���: ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("�߸��Է��߽��ϴ�.");
			break;
		}
		
		//0+1+2+3+4+5+6+7+8+9+10=55
		int sum1 = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum1+=i;
			System.out.print(i);
			
			if (i==10) {
				System.out.print("=");
				System.out.print(sum1);
			} else {
				System.out.print("+");
			}
			
		}


	}

}