import java.util.Scanner;

/**
 * ����Ʈ�� �ٸ� ��Ű������ ������ �� ����
 * public �����ڴ� �ٸ� ��Ű�������� ������ �� �ִ�.
 * 
 * ��ȯ�� �Լ���(�Ű�����)
 * 
 * n��Ʈ�� ǥ���� �� �ִ� ���������� 2�� n�� ��
 * 	"			"		��ȣ�� ������ ������ ������
 * -2�� n-1�� ~ 2�� n-1�� -1
 * 
 * 
 * 
 * 
 *
 */

public class Method02 {

	//������ �Է¹޾� ����ϴ� �Լ�
//	static int in(int n) {
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		System.out.println( "in �Լ����: "+in(n) );
//	}
	
	
//	static int in() {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( "in �Լ����: "+in() );
//	}
	
	
	
	//�� ���� �Է¹޾� ��չ�ȯ�޴� �Լ�
//	static double average(int a, int b) {
//		double result = (double)(a+b)/2;
//		return result;		
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		double avg=average(x,y);
//		System.out.println( "�Լ����: " + avg );
//	}
	
	
//	static double average() {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		return (x+y)/2.0; 
//	}
//	
//	public static void main(String[] args) {
//		double avg=average();
//		System.out.println( "�Լ����: " + avg );
//	}
	
	
//	static void average() {
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		double avg=(x+y)/2.0;
//		
//		System.out.println( "�Լ����: " + avg );
//	}
//	
//	public static void main(String[] args) {
//		average();
//	}
	
	static int total(int ary[]) {
		int sum=0;
		for(int i=0; i<ary.length; i++) {
			sum+=ary[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int ary[]= {1,2,3,4,5};
		System.out.println( "�Լ����: "+total(ary) );	//ȣ���Ҵ�� �迭�� ��.
	}
	
	
	
	

}
