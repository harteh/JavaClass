import java.util.Scanner;

/**
 * ����ó��
 * 
 * toString() �޼ҵ� : ��ü�� ���ڿ��� �����ϴ� �޼ҵ�
 * sc.next() : 
 */
public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//����ó�� 1.
//		int a,b;
//		
//		try {	//���� �߻��� ���ɼ��� �ִ� ���๮
//			System.out.println("��1 �Է�:");
//			a=sc.nextInt();
//			
//			System.out.println("��2 �Է�:");
//			b=sc.nextInt();
//			
//			System.out.println(a/b);
//		}
//		catch(Exception e) {	//���� ó����
//			System.out.println(e);
//		}
//		finally {	//���� �߻����ο� ������� ������ ����Ǵ� ���� (��������)
//			System.out.println("!!!!!!!!!!!");			
//		}
//		
//		System.out.println("����");
		
		
		//����ó�� 2.InputMismatchException
		System.out.println("���� 5�� �Է�:");
		
		int n=0, sum=0;
		for(int i=0; i<5; i++) {
			try {
				n=sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("������ �Է��ϼ���");
				System.out.println(e);
				
				sc.next();	//�Է½�Ʈ���� �ִ� ��ū(�ٷ���������)�� ������.
				i--;		//�ε����� �����ϸ� �ȵǹǷ� ���ҽ�Ų��.
				continue;	//���������� �ʰ� ��� �ݺ�
			}
			
			sum +=n;
			System.out.printf("n��:%d ��:%d / ",n,sum);
		}
		System.out.println();
		System.out.println("����="+sum);
		/*
		 * continue ���� ��
		 * ���� 5�� �Է�:
			1 2 d 3 4 5
			n��:1 ��:1 / n��:2 ��:3 / ������ �Է��ϼ���
			java.util.InputMismatchException
			n��:3 ��:6 / n��:4 ��:10 / n��:5 ��:15 / 
			����=15
		 */
		/*
		 * continue ���� ��
		 * ���� 5�� �Է�:
			1 2 �� 3 4 5
			n��:1 ��:1 / n��:2 ��:3 / ������ �Է��ϼ���
			java.util.InputMismatchException
			n��:2 ��:5 / n��:3 ��:8 / n��:4 ��:12 / n��:5 ��:17 / 
			����=17
		 */
		
		
	}

}
