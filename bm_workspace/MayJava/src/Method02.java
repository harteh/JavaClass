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

	
//	static int total(int ary[]) {
//		int sum=0;
//		for(int i=0; i<ary.length; i++) {
//			sum+=ary[i];
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		int ary[]= {1,2,3,4,5};
//		System.out.println( "�Լ����: "+total(ary) );	//ȣ���Ҷ��� �迭�� ��.
//	}
	
	
//	static int total(int ary[][]) {
//		int sum=0;
//		for(int i=0; i<ary.length; i++) {
//			for (int j=0; j<ary[i].length; j++) {
//				sum+=ary[i][j];
//			}
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		int ary[][]= {{1,2,3},{4,5,6}};
//		System.out.println( "�Լ����: "+total(ary) );
//	}
	
	
	/*�ݺ��� ����
	public static void main(String[] args) {
		
		//1~10������ �Ѱ��� ����ض�.(while)
		int multi = 1;
		int i=1;
		while(i<=10) {
			multi *=i;
			i++;
		}
		System.out.println(multi);
		
		
		//�������� ¦���ܸ� ����ϸ鼭 �ش�Ǵ� ���� ��������
		//(2���� 2*2, 4���� 4*4, 6���� 6*6, 8���� 8*8)����ض�.(break)
		
		for(int dan=2; dan<=9; dan++) {
			if(dan%2==0) {	//¦���ܸ� ���
				for(int j=1; j<=9; j++) {
					System.out.printf("%d*%d=%d ", dan,j,dan*j);
					if(dan==j) {
						break;
					}
				}
				System.out.println();
			}
		}
		

		System.out.println("****** break ��� ******");
		multi=1;
		
		for(i=2; i<=9; i+=2 ) {
			for(int j=1; j<=9; j++) {
				multi = i*j;
				System.out.print(i+"*"+j+"="+multi+" ");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		

		//2.
		for(i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i%2==0 && i>=j) {
					System.out.println(i+"X"+j+"="+i*j);
				}else {
					break;
				}
			}
		}
		
		
	}
	*/
	
	//�Լ� ����
//	static int adder(int a, int b) {
//		return a+b;
//	}
//	
//	static double exp(double a) {
//		return a*=a;
//	}
//	
//	public static void main(String[] args) {
//		
//		int result=adder(10,20); //�� ���� �� ���
//		System.out.println(result);
//		System.out.println(exp(3.5)); //3.5�� ������ �� ��� 
//	}
	
	
	//���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ带 ������.
	//4-1. main���� ���
	
//	static double avg(double r) {
//		return r*r*3.14;
//	}
//	
//	public static void main(String[] args) {
//		double result = avg(3);		//�Լ��� ��ȯ���� �����ؼ�
//		System.out.println(result);	//���
//	}
	
	//4-2. �޼ҵ忡�� ���
	static void avg(double r) {
		double result=r*r*3.14;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		avg(3);
	}
	
	

}
