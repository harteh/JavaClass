import java.util.Scanner;

/**
 * ��������(local variable)
 * - ��� �ȿ����� ��ȿ�ϴ�.
 * 
 * ��������(global variable)
 * 
 * ** �Ű������� �迭���϶�
 * - �迭�� ȣ���Ҷ� �迭�� ������ �ȴ�.
 *
 */
public class Variable01 {

//	static void in() {
//		int a=10;	//��������
//		System.out.println(a);
//	}
//	
//	public static void main(String[] args) {
//		int a=0;	//��������
//		in();		//�Լ� ȣ��
//		System.out.println(a);
//	}
	
	
//	static int a;	//�������� : �޸� ������ �����Ǵ� ����
//	
//	static void aa() {
//		a=10;	//��������
//	}
//	
//	static void bb() {
//		int a=20;	//���������� �ٽ� �����
//		System.out.println(a);
//	}
//	
//	public static void main(String[] args) {
//		aa();
//		bb();
//		System.out.println(a);
//	}
	
	
//	static double big(double a, double b) {
//		return (a>b ? a:b);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( big(5.5, 6.5) );
//	}
	
	
	//�� ������ �Է¹޾� ���ؼ� ū �� ����ϱ�
//	static void big(int a, int b) {
//		System.out.println( (a>b ? a:b) );
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		big(a, b);
//	}
	
//	static int big(int arr1[]) {
//		int max = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			if(max < arr1[i]) {
//				max = arr1[i];
//			}
//		}
//		return max;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[7];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println( big(arr) );
		//�Լ� ȣ��� ���ÿ� ���
		//�Ű������� �迭���϶�, 
		//�迭�� ȣ���Ҷ� �迭�� ������ ��.
		
	
	public static void cal(char aa, int bb, int cc) {
		switch (aa) {
		case '+':
			System.out.println(bb + cc);
			break;
		case '-':
			System.out.println(bb - cc);
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a=sc.next().charAt(0);
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		cal(a,b,c);
		// + �� �Է��ϸ� b+c, - �Է��ϸ� b-c
		//switch-case
		
	}
		
		
		
		
		
	

}
