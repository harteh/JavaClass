package review;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 1.������ ������ �ڵ�� �ۼ��ض�.

public class Review0530B {
	public static void main(String[] args) {

		// 1.1Boolean �� false�� ��false����� ���ڿ��� ��ȯ�ض�.
		boolean b1 = false;
		String str = Boolean.toString(b1);
		
		// 1.2 ���ڿ� ��36.5���� double Ÿ�� �Ǽ��� ��ȯ�ض�.
		String str1 = "36.5";
		//Double d1 = Double.valueOf(str1);
		double d2 = Double.parseDouble(str1);
		
		// 1.3 ���ڿ� ��35���� ���� 35�� ��ȯ�ض�.
		//int i = Integer.valueOf("35");
		int in1 = Integer.parseInt("35");
	}
}
*/
/*
 * 3 Main()�� ���� main()�� Object In, OutputStream�� �����, 
 * Ŭ������ ���� �����ض�
*/
class Person implements Serializable {
//	transient String name;	//����ȭ ��󿡼� ���ܵ�
	String name;
	String major;
	int age;
	int id;
	
	Person(String name, String major, int age, int id){
		this.name=name;		this.major=major;
		this.age=age;		this.id=id;
	}
	
	void show(){
		System.out.println(name+major+age+" "+id);
	}
	
}
public class Review0530B {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("pp.txt"));
		Person p=(Person)i.readObject();
		p.show();

		i.close();
		
//		FileOutputStream f = new FileOutputStream("pp.txt");
//		ObjectOutputStream o = new ObjectOutputStream(f);
//
//		Person p=new Person("Jack", "computer", 20, 123);
//		o.writeObject(p);
//		p.show();   //������ �� ����ϴ� �Լ�
//		
//		o.close();

	}
}

/*
 * 4 3���� Circle ��ü �迭�� ����� x, y, r���� �о� 
 * 3���� Circle��ü�� ����� show()�Լ����� �� ����ض�.
 * ������) x,y,r : 1.0 1.0 4
             x,y,r : 2.5 3.5 6
             x,y,r : 4.2 1.2 4

class Circle3{
	private double x,y;
    private int r;

    Circle3(double x, double y, int r){
    	this.x=x;  this.y=y; this.r=r;
    }

    void show(){
    	System.out.println("x,y,r : "+x + ", " +y + ", " +r);}
    }

public class Review0530B {
	public static void main(String[] args) {
		
		Circle3[] arr = new Circle3[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�:");
		
		for(int i=0; i<arr.length; i++) {
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			int r=sc.nextInt();
			
			arr[i] = new Circle3(x, y, r);
			arr[i].show();
		}
		
//		for(Circle3 ci : arr) {
//			ci.show();
//		}
	}
}
*/
