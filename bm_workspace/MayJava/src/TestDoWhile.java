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

	}

}
