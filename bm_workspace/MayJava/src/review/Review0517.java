package review;
import java.util.Scanner;

public class Review0517 {

	public static void main(String[] args) {
		
		//���� 10���� �Է¹޾� �迭�� ������ ��, 
		//�迭�� �˻��Ͽ� 4�� ����� ��� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//			if( arr[i]%4==0 ) {
//				System.out.println(arr[i]);
//			}
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if( arr[i]%4==0 ) {
//				System.out.println(arr[i]);
//			}			
//		}
		
		
		//���� a=50, b=150���� �ʱ�ȭ�ؼ� 
		//a�� b���� ũ�� a�� b�� ��, �ƴϸ� a�� b�� ������ ���� ������ ���
		//(���� ���� ������ Ȱ��)
		
		int a=50, b=150;
		int result = a>b ? a*b : a/b;
		System.out.println("2: "+result);
		
		
		//100������ �ڿ��� �߿��� 2�� ����̰� 7�� ����� ���ڸ� ����ϰ�, 
		//��µ� ������ ���� ���(while�� �̿�)
		
		int sum=0;
		int i=1;
		while(i<=100) {
			if(i%2==0 && i%7==0) {
				System.out.print(i+ " ");
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.println("3: "+sum);
		
		
		//������ �Է¹޾� ¦���̸� ��¦����, Ȧ���̸� ��Ȧ���� ��� ���
		//������ �Է����� ���� ��쿡�� ���α׷��� ������Ѷ�.(try-catch ���)
		
		System.out.println("�����Է�:");
		
		try {
			int num=sc.nextInt();
			System.out.println(num%2==0 ? "¦��" : "Ȧ��");
			
		} catch (Exception e) { 
			// ������ �Է����� �ʾ��� ���� ����
			System.out.println("���Է�");
			return;
		}
		
		
		
		
		
		
		
		

	}

}
