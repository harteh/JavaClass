package abstractex;

import java.util.Scanner;


abstract class Circle {
	protected double r;
	
	Circle(double r){
		this.r = r;
	}
	
	abstract double get();
}

class Cir extends Circle {
	
	Cir(double r){
		super(r);
	}
	
	double get() {
		return r;
	}
}

public class AbstEx03 {
	public static void main(String[] args) {

		//��ü�迭
		Circle c[] = new Circle[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<c.length; i++) {
			double r = sc.nextDouble();	//������ �Է¹���
			c[i] = new Cir(r);	//��ü ����, ��ĳ����

			System.out.println(c[i].get());
			//2.3 5.7 12.3 51.0 21.1
		}
		
	}
}
