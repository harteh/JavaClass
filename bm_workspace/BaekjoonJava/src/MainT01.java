import java.util.Scanner;

public class MainT01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//����ð�
		System.out.println("���� �ð�(�ð�, ��)�� �Է��ϼ��� : ");
		int A = sc.nextInt();	//���� �ð� (0 �� A �� 23)
		int B = sc.nextInt();	//���� �� (0 �� B �� 59)

		System.out.println("�丮�ϴµ� �ɸ��� �ð��� �д����� �Է��ϼ��� : ");
		int C = sc.nextInt();		//�丮�ϴµ� �ɸ��� �ð� ��(0 �� C �� 1,000)
		
		if (B + C > 59) {
			A += 1;
			B -= 60;
		}
		System.out.printf("����ð��� %d : %d", A,B);
		

		

	}

}
