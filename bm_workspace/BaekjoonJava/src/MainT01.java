import java.util.Scanner;

public class MainT01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//����ð�
		System.out.println("���� �ð�(�ð�, ��)�� �Է��ϼ��� : ");
		int cA = sc.nextInt();	//���� �ð� (0 �� A �� 23)
		int cB = sc.nextInt();	//���� �� (0 �� B �� 59)

		System.out.println("�丮�ϴµ� �ɸ��� �ð��� �д����� �Է��ϼ��� : ");
		int uC = sc.nextInt();		//�丮�ϴµ� �ɸ��� �ð� ��(0 �� C �� 1,000)
		
		
//		int endA;	//���� �ð�
		int endB;	//���� ��
		
		//endB �� 59�̻��� �Ǹ� endA�� +1 �ȴ�
		
		endB = cB + uC;
		
		if (endB > 59) {
			cA += 1;
			endB -= 60;
		}
		System.out.printf("����ð��� %d : %d", cA,endB);
		

		

	}

}
