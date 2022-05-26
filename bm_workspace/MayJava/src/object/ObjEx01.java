package object;

/*
 * 1 toString()

class In {
	private int num;
	In(int num){
		this.num = num;
	}
	
	public String toString() {	//������ �Ͽ�
		return num +" ";		//���ڿ� ��ȯ
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		In i = new In(4);
		System.out.println(i);
	}
}
*/

/*
 * 2 toString()

class Po {
	private int a, b;
	Po(int a, int b){
		this.a = a;		this.b = b;
	}
	
	public String toString() {
		return a+" "+b;
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		
		Po p = new Po(3,4);
		System.out.println(p.getClass().getName());	//��ü�� Ŭ���� �̸� ���
		System.out.println(p.hashCode());		//�ؽ��ڵ��� 16���� ��
		System.out.println(p.toString());		//Ŭ������+�ּҰ�
		
		System.out.println(p.toString());	//toString() �������ϸ� 3, 4�� ��µ�
	}
}
*/

/*
 * 3 .equals()

class Po {
	private int a, b;
	Po(int a, int b){
		this.a = a;		this.b = b;
	}
	
	public boolean equals(Po p) {
		if(this.a==p.a && this.b==p.b) {	
			//�ڱ��ڽ��� a�� �Ű������� ���޹��� �� ��
			return true;
		}
		else
			return false;
	}
	
}

public class ObjEx01 {
	public static void main(String[] args) {
		
		Po p = new Po(3,4);
		Po p1 = new Po(2,3);
		Po p2 = new Po(3,4);
		
		if(p==p1) {
			System.out.println("p==p1");	//�ּҰ��� �ٸ���
		}
		if(p.equals(p1)) {		
			// ��ü p�� �ڱ��ڽ�..(-> line 64), p1�� �Ű�����
			System.out.println("p�� p1�� ����");			
		}
		if(p.equals(p2)) {
			System.out.println("p�� p2�� ����");			
		}
	}
}
*/

/*
 * 4. p.386 Q4

class MyDog{
	String a, b;
	MyDog(String a, String b){
		this.a=a;	this.b=b;
	}
	public String toString() {
		return b+" "+a;
	}
}

public class ObjEx01 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("�۸���", "������");
		System.out.println(dog);
	}
}
*/

public class ObjEx01 {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String ("Hello");
		String e = new String ("Java");
		String f = new String ("Java");
		
		System.out.println(f.equals(e));
		System.out.println(f == c);
		System.out.println("****************");

	}
}

