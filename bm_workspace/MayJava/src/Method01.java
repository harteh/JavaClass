import java.util.Scanner;

/**
 * ** �Լ� **
 * ĸ��ȭ: �ڹ��� ��� �޼ҵ�� �ݵ�� Ŭ���� �ȿ� �־�� �Ѵ�.
 * 
 * ����������
 * - public, private, protected, default(���������ڰ� ������ ���)
 * 
 * main�Լ����� �����ؼ� main�Լ����� ������.
 * 
 * ��ȯ�� �Լ���(�Ű�����){}
 * 
 * static : ����
 * - Ŭ���� �ȿ��� �Լ��� ������ �� �ִ�.
 * 
 * void : ��ȯ��
 * - �������� ��
 * - ��ȯ���� void�� �Լ��� ��κ� ��¹��� ����.
 * - �ڷ����� ����.
 * 
 * return : ��ȯ ��
 * 
 * 
 * ** �Լ� ����� **
 * 1. ����� ��𿡼� �Ұ��� ����
 * 2. main���� ����� ��� �Լ����� ���ϰ��� �޾ƾ� �Ѵ�.
 * 	-> �Լ�ȣ��� ���ÿ� ���
 *  -> ������ �ָ鼭 ���ϰ��� ������ ������
 * 2-1. �Լ����� ��� �� ��� ���Ϲ��� �ʿ� ���� 
 *  -> (void)
 *
 */
public class Method01 {
	
//	static void pro(int age) {
//		System.out.println("�ȳ�");
//		System.out.println("���̴� "+age+"�̴�.");
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println("����");
//		pro(52);	//�Լ�ȣ�� -> �Լ��� ã�� { }Ȯ��
//		pro(53);	//�Լ�ȣ��
//		System.out.println("��");
//	}

	
//	public static void main(String[] args) {
//		int n=add(10, 20);		//1. add �Լ� ȣ��	3. �޾ƿ� ���ϰ��� int n�� �����Ѵ�.
//		System.out.println(n); //4. ��¹� ����
//	}
//	
//	static int add(int a, int b) {	//2. ���ϰ��� ������ main�Լ��� ���ư���.
//		return a+b;
//	}
	
	
//	public static void main(String[] args) {
//		System.out.println("���� ����: "+area(5.5));
//		System.out.println("���� �ѷ�: "+round(3.2));
//		
//		//����:3.14*������*������
//		//�ѷ�:3.14*������*2
//	}
//	
//	static double area(double r) {
//		return 3.14*r*r;
//	}
//	static double round(double r) {
//		return 3.14*r*2;
//	}
	
	
//	static void meter(int n) {
//		System.out.println( (double)n /100 );
//		System.out.println( n /100.0 );
//	}
//	
//	public static void main(String[] args) {
//		meter(176);	//�Լ�ȣ��
//		//176cm -> 1.76m
//	}
	
	
//	static double meter(int n) {
//		return n/100;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println( meter(176) );
//	}
	
	
//	static void total(int a, int b) {
//		int sum=0;
//		for(int i=a; i<=b; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//	
//	public static void main(String[] args) {
//		total(1,10);	//1���� 10���� �����
//		total(1,100);	//1���� 10���� �����
//	}
	
	
	static int multi(int a, int b) {
		int num = 1;
		// ���� ���� �ʱⰪ�� 1�� �����ؾ� ��!!
		
		for(int i=1; i<=b; i++) {	//Ƚ��
			num *= a;
		}
		return num;
		// return (int)Math.pow(a, b); -> a�� b��
	}
	
	public static void main(String[] args) {
		System.out.println( multi(2,10) );
		//2�� 10��
	}
	
	
	
	
	//�迭 ����
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		String arr[][]= {
//				{"book","å"},
//				{"water","��"},
//				{"note","��Ʈ"},
//		};
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][0]+"�� ����?");	//book�� ����?
//			String str=sc.next();	//�ѱ۷� ���� �Է���
//			
//			if(str.equals(arr[i][1])) {
//				System.out.println("����");
//			}
//			else {
//				System.out.println("������ "+arr[i][1]+" �Դϴ�.");
//			}
//		}
//		
//	}
	
	
	

}
