package test0613;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

//1 - 6

class Circle {
	private double r;
	Circle(double r){
	      this.r=r;
	}
	double area(){
	   return 3.14*r*r;
	} 
}

class Num {
	int num3; 
	int max3;
	int sum3=0;
	
	Num(){
		this(0);
	}
	Num(int n){
		num3=n;
	}
	
	int add(int n) {
//		num3 = n;
		sum3+=n;
		return sum3;
	}
	
	int getSum(){
		return sum3;
	}
	
	int getMax() {
		if(num3 <max3) {
			max3 = num3;
		}
		return max3;
	}
}

class Student implements Serializable {
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String id;
	int age;
	
	Student(String name, String id, int age){
		this.name=name; this.id=id; this.age=age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		System.out.println(getName()+" "+getId()+" "+getAge());
	}
	
}

public class JavaTest extends JFrame {
	public static void main(String[] args) throws IOException {

		//1.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수 두개를 입력하시오:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 = num1+num2;
		System.out.println("두 정수의 합: "+ sum1);

		//2.
		Circle[] ci = new Circle[5];
		System.out.println("2. 원지름 5개 입력:");
		double r2;
		int sum2=0;
		for(int i=0; i<5; i++) {
			r2 = sc.nextDouble();
			ci[i] = new Circle(r2);
			sum2 += ci[i].area();
		}
		System.out.println(sum2);
		
		//3.
		Num nb = new Num();
		nb.add(7);		nb.add(-1);		nb.add(20);		nb.add(5);
		System.out.println("3. Sum = "+ nb.getSum());
		System.out.println("3. Max = "+ nb.getMax());
		
		//3-C
		Num nb1 = new Num();
		Num nb2 = new Num(5);
		nb1.add(10);
		System.out.println("3. Sum = "+ nb2.getSum());
		
		//4.
		HashMap<String, Double> h = new HashMap<String, Double>();
		h.put("세종", 11.1);
		h.put("태종", 21.1);
		h.put("정종", 31.1);
		
		System.out.println("찾을 단어:");
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String str = sc.next();
			double resultNum = h.get(str);
			
			System.out.println(resultNum);
		}
		
		//5.
		new JavaTest();
		
		//6.
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream(new FileOutputStream("java.txt"));
			
			Student s= new Student("jack","123",20);
			s.show();      //모든 데이터 출력
			
			os.writeObject(s);
			
		} catch (Exception e) {
			System.out.println("파일 생성 오류");
		}
		os.close();
		
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream("java.txt"));
			
			Student s = (Student)in.readObject();
			
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
		} catch (Exception e) {
			System.out.println("파일 읽어오기 오류");
		}
		in.close();
		
		
	}

		//5
		JavaTest(){
			Container c = getContentPane();
			c.setLayout(new GridLayout(3, 3));
			
			for(int i=0; i<9; i++) {
				String str = Integer.toString(i+1);
				JButton jb = new JButton(str);
				c.add(jb);			
			}
			
			setTitle("Dial");
			setSize(250, 250);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
