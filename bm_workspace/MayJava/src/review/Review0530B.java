package review;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 1.다음을 한줄의 코드로 작성해라.

public class Review0530B {
	public static void main(String[] args) {

		// 1.1Boolean 값 false를 “false”라는 문자열로 변환해라.
		boolean b1 = false;
		String str = Boolean.toString(b1);
		
		// 1.2 문자열 “36.5”를 double 타입 실수로 변환해라.
		String str1 = "36.5";
		//Double d1 = Double.valueOf(str1);
		double d2 = Double.parseDouble(str1);
		
		// 1.3 문자열 “35”를 정수 35로 변환해라.
		//int i = Integer.valueOf("35");
		int in1 = Integer.parseInt("35");
	}
}
*/
/*
 * 3 Main()를 보고 main()에 Object In, OutputStream을 만들고, 
 * 클래스도 따로 구현해라
*/
class Person implements Serializable {
//	transient String name;	//직렬화 대상에서 제외됨
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
//		p.show();   //데이터 다 출력하는 함수
//		
//		o.close();

	}
}

/*
 * 4 3개의 Circle 객체 배열을 만들고 x, y, r값을 읽어 
 * 3개의 Circle객체를 만들어 show()함수에서 다 출력해라.
 * 실행결과) x,y,r : 1.0 1.0 4
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
		System.out.println("값 입력:");
		
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
