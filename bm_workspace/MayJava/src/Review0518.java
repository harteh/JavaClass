import java.util.Scanner;

public class Review0518 {
	
	//�迭 ���� �Լ�
//	static int[] make() {
//		int arr[]=new int[4];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=i;
//		}
//		
//		return arr;
//	}
//
//	public static void main(String[] args) {
//
//		int arr[];	//�迭 ���۷���(����) ���� ����
//		arr=make();	//�迭 ����
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]+" ");
//		}
//	}
	
	
	//�� ���� �Է¹޾� �ձ��ϱ�
//	public static void main(String[] args) {
//	
//		//���ѷ����ȿ� �� ������ �Է¹޾� ���� ���ϰ�, 
//		//�Ǽ��� �Է��ϸ� ���Ǽ��� �ȵȴ١���� ����ϰ�, 
//		//�ٽ� �� ������ �Է¹޴� �ڵ带 �ۼ��ض�.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2;
//		while(true) {
//			try {
//				//���� �Է��� try�� �ȿ��� �Է¹޾ƾ� ���Է¿��� ó���� �� �� �ִ�.
//				num1=sc.nextInt();
//				num2=sc.nextInt();
//				
//				System.out.println("�� ���� �Է�: "+ num1 +" "+num2);
//				System.out.println("��: "+(num1+num2));
//				break;
//			} catch (Exception e) {	// �Ǽ��� �Է����� �� ����
//				System.out.println("�Ǽ��� �ȵȴ�.");
//				sc.next();
//				continue;
//			}
//			
//		}//while�� ��
//		
//	}//���� ��
	
	
	//���� �Է¹޾� ��� ������ ���ϱ�
//	static void func(int a, int b) {
//		Scanner sc=new Scanner(System.in);
//
//		int c=a/5;
//		int d=a%5;
//		
//		System.out.println("��: "+c+" ������:"+ d);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt(); 
//		int b=5;
//		func(a, b);	//a->��, b-> ������
//	}
	
	
	static void func(int a, int b) {
		System.out.println("��� �Է�:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		a=n/5;
		b=n%5;
		System.out.println("��: "+a+", ������:"+ b);
	}
	public static void main(String[] args) {
		int a=0, b=0;
		func(a, b);
	}
	

}
