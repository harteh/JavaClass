package review;

import java.util.Scanner;

/* 1. Ŭ����Grade
 * 1.1 �ʵ�� int��english, math, science�� ���private���μ����϶�. 
 * 	���ʵ��������, ����, ���������������ϴµ�����Ѵ�.
 * 
 * 1.2 �����ڴ� �⺻�����ڿ� ���ʵ带�ʱ�ȭ�ϴ� �����ڵΰ����������ض�. 
 * 	������ ������ ��� �Ѱ��� �̻��� this() ����� ���Խ��Ѷ�
 * 
 * 1.3 �޼ҵ�� �ʿ��� �Լ����� ���Ƿ� �����ϰ�,
 * 	�� ������ ����� ���ϴ� avg�޼��带 �����ض�.
 * 	(avg �޼���� double ���� ��ȯ�Ѵ�.)
 * 
 * 1.4 main�޼��忡�� Grade�� �⺻�����ڿ� �� ������ ������ �ʱ�ȭ�ϴ� ������
 * 	(�Ķ��������)�� ����Ͽ� Grade ��ü �ΰ��� �����ض�. 
 * 	�� ������ ������ ������ ���� ���α׷�(�����ǰ����ֱ�)���� �����ض�. 
 * 	�� ��ü�� ���ؼ� english, math, science������ 
 * 	�������� ��հ��� ȭ�鿡 ����ض�


class Grade {
	private int english, math, science;
	
	Grade(){}
	Grade(int english, int math, int science){
		this.english=english;
		this.math=math;
		this.science=science;
	}
	
	double avg() {
		int sum = english + math + science;
		return sum/3.0;
	}
	
	void show() {
		System.out.printf("��������: %d, ��������: %d,"
				+ " ��������: %d\n�������: %.2f\n",
				english, math, science, avg());
	}
}

public class Test0527 {
	public static void main(String[] args) {
		Grade g1 = new Grade();
		Grade g2 = new Grade(70, 65, 50);
		g1.show();
		g2.show();
	}
}
*/

/*
 * 2. �߻�Ŭ���� Calc�� �ۼ��ض�.
*/
abstract class Calc {
	double op1, op2;
	
	void set(double op1, double op2) {
		this.op1 = op1;		this.op2=op2;
	}
	
	abstract double calculate();
}

class Add extends Calc{
	double calculate() {
		return op1 + op2;
	}
}
class Sub extends Calc {
	double calculate() {
		return op1 - op2;
	}
}
class Mul extends Calc {
	double calculate() {
		return op1 * op2;
	}
}
class Div extends Calc {
	double calculate() {
		return op1 / op2;
	}
}

public class Test0527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �����ڸ� �Է�:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		char chk = sc.next().charAt(0);
		
		switch(chk) {
		case '+':
			Add add = new Add();
			add.set(num1, num2);
			System.out.println("��: "+add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.set(num1, num2);
			System.out.println("��: "+sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.set(num1, num2);
			System.out.println("��: "+mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.set(num1, num2);
			System.out.println("��: "+div.calculate());
			break;
		default:
			System.out.println("�ٸ� ���� �Է��ϼ���.");
			break;
		}
	}
}


/*
 * 3. ����ڷκ��� �迭�� ũ�⸦ �Է¹޾� int�� �迭�� �����Ѵ�.
 *	������ MathŬ������ random �޼��带 ����Ͽ� ������ �迭�� �����Ѵ�.
 *	������ 0-100�� ������ ���� ���� �� �ִ�.
 *	������ ���� ���� ȭ�鿡 ����Ѵ�.
 *	������ �� .length�� ����ض�


public class Test0527 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ũ��:");
		int size = sc.nextInt();
		
		int[] score = new int[size];
		for(int i=0; i<score.length; i++) {
			score[i] = (int) (Math.random()*100);
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] +" ");
		}

	}
}
 */