package javaReview;

/*
 ** 6�� 
 * this: �ڽ��� ���۷����� ��ȯ
 * this(): �����ڿ��� �ٸ� �����ڸ� ȣ��
 * 
 ** ���� ������
 * default: ���� ��Ű�� ���� �ٸ� Ŭ������ ���� ����
 * public: ��Ű���� ������� ��� Ŭ�������� ���� ����
 * private: Ŭ���� �������� ���� ����(��ӹ޾��� ���� �ȵ�)
 * protected: ���� ��Ű�� ���� ��� Ŭ�������� ��� ����
 * 			��� ���� �ڽ� Ŭ������ �ٸ� ��Ű���� �־� ���� ����
 * 
 ** no-static ���: ��ü���� ���������� ���� ���� (�ν��Ͻ� ����)
 *		- ��ü ���� �� ��밡��
 ** static ���: ��ü�� �������� �ʰ� ��� ���� (Ŭ���� ����, static ����)
 *		- ������ Ŭ������ ��� ��ü�� ���� �����ȴ�
 *
 ** 7�� 
 * �迭�� ����� ����Ʈ �������̽��� �ִ�.
 */
/*
 ** 8�� 
 * �ڹٴ� ���߻���� �������� �ʴ´�. 
 * ����� Ƚ�� ������ ����
 * 
 * ���� Ŭ���� ��ü�� ������ �� 
 * - ���� Ŭ������ ������ ���� ���� Ŭ������ �����ڰ� ���� ȣ��ȴ�
 * - ���� Ŭ������ �����ڿ� ���� Ŭ������ �����ڰ� ��� ����ȴ�
 * -> ���� Ŭ���� �����ڿ��� super()�� �ڵ����� ȣ��ȴ�.
 * 
 * �������ε� : ���� Ŭ������ �������̵� �� �޼ҵ尡 ������ �����
 */
/*
 ** 9��
 * �߻�Ŭ���� : �߻� �޼���� �Ϲݸ޼��� ��� ���� �� �ִ�.
 * �߻� �޼���� �߻� Ŭ���� �ȿ����� ������ �� �ִ�.
 * public static final int MAX = 9999;
 * -> ���� �����ϰ�, ������ �Ұ����ϰ� ����
 * 
 * �߻�Ŭ���� ��� �̿�
 * 	: ������ �°� �߻�޼��带 �ٸ��� �����Ͽ� �������� �߱��� �� �ִ�
 */
/*
 ** 10��
 * �������̽�: �߻�޼���� ����θ� �̷�����ִ�
 */
/*
 ** 11��
 * Object Ŭ����: �ֻ��� Ŭ����
 * �ֿ� �޼���
 * 
 ** Wrapper Ŭ����
 * - �⺻Ÿ���� ��ü������ ����ؾ� �ϴ� ���.
 * - �ڽ�(Boxing): �⺻Ÿ���� ��ü������ �ٲٴ� ��
 * - ��ڽ�: ��ü���� �⺻������ ������ �� 
 * valueOf(), parseInt() : Ŭ���� �޼����� ����
 */
/*
 ** 14��
 * Exception Ŭ����: ���� Ŭ������ �ֻ��� Ŭ����
 ** ����ó�� �̷��
 *	throws: ����ó���� �޼��尡 ȣ��� �� ó���ϵ��� �̷� 
 */
/*
 ** 15��
 * InputStream : �Է� => ������ �о� ���� �� ���
 * 	
 * OutputStream : ���� => ���� ����
 */

/*
 * this
class Book{
	String a, b;
	int c;
	Book(){
		this(null,null,10);
	}
	Book(String a, int c){
		this("aa","", 33);
	}
	Book(String a, String b, int c){
		this.a=a;	this.b=b;	this.c=c;
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		Book b = new Book("aa","bb",33);
		Book b2 = new Book("cc",33);
		Book b3 = new Book();
	}
}
*/
/*
 * static
 *
class Sample {
	public int n;	//�ν��Ͻ� ����
	public void a() {
		m=20;
	}
	public void b() {
		m=30;
	}
	public static int m;	//Ŭ���� ����, s1�� s2�� ���� �����ȴ�
	public static void c() {//Ŭ���� �޼���
		m=40;
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.n=10;
		s1.a();
		s1.m=40;
		System.out.println(s1.n);
		
		Sample s2 = new Sample();
		s2.n=55;
		s2.b();
		s2.c();
		System.out.println(s2.n);
	}
}
*/
/*
 * ���
 *
class A1 {
	A1(){
		System.out.println("A");
	}
}
class B extends A1 {
	B(){
		System.out.println("B");
	}
}
class C extends B {
	C(){	//������ ȣ��. ��ӹ��� ����Ŭ������ ������ ȣ��
		System.out.println("C");
	}
}
public class TotalRe0531A2 {
	public static void main(String[] args) {
		C c = new C(); //A B C ��� �ȴ�
	}
}
*/
/*
 * Wrapper Ŭ����
 *
public class TotalRe0531A2 {
	public static void main(String[] args) {

		Integer i = new Integer(100); //100 �� ��üȭ ��Ŵ: �ڽ�(Boxing)
		int my = i.intValue(); // �⺻Ÿ������ ����: ��ڽ�
		Float f = new Float((double)3.14);
		int num = Integer.parseInt("100");
	}
}
*/
/*
 * ����ó��
 */
public class TotalRe0531A2 {
	public static void main(String[] args) {
		String[] str = {"35", "54", "234", "3.14"};
		try {
			for(int i=0; i<str.length; i++) {
				int j = Integer.parseInt(str[i]);
				//���ڿ��� ������ intŸ������ �ٲ�
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println("���ܹ߻�");
		}
	}
}
