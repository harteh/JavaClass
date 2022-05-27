package review;

import java.util.Scanner;

/* 1. 클래스Grade
 * 1.1 필드는 int형english, math, science로 모두private으로선언하라. 
 * 	이필드들은영어, 수학, 과학점수를저장하는데사용한다.
 * 
 * 1.2 생성자는 기본생성자와 세필드를초기화하는 생성자두가지를구현해라. 
 * 	생성자 구현에 적어도 한가지 이상의 this() 사용을 포함시켜라
 * 
 * 1.3 메소드는 필요한 함수들을 임의로 구현하고,
 * 	세 과목의 평균을 구하는 avg메서드를 구현해라.
 * 	(avg 메서드는 double 형을 반환한다.)
 * 
 * 1.4 main메서드에서 Grade의 기본생성자와 각 과목의 점수를 초기화하는 생성자
 * 	(파라미터포함)를 사용하여 Grade 객체 두개를 생성해라. 
 * 	각 과목의 점수는 적당한 값을 프로그램(임의의값을주기)에서 지정해라. 
 * 	두 객체에 대해서 english, math, science점수와 
 * 	세과목의 평균값을 화면에 출력해라


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
		System.out.printf("영어점수: %d, 수학점수: %d,"
				+ " 과학점수: %d\n과목평균: %.2f\n",
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
 * 2. 추상클래스 Calc를 작성해라.
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
		System.out.println("두 개의 정수와 연산자를 입력:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		char chk = sc.next().charAt(0);
		
		switch(chk) {
		case '+':
			Add add = new Add();
			add.set(num1, num2);
			System.out.println("답: "+add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.set(num1, num2);
			System.out.println("답: "+sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.set(num1, num2);
			System.out.println("답: "+mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.set(num1, num2);
			System.out.println("답: "+div.calculate());
			break;
		default:
			System.out.println("바른 값을 입력하세요.");
			break;
		}
	}
}


/*
 * 3. 사용자로부터 배열의 크기를 입력받아 int형 배열을 생성한다.
 *	성적은 Math클래스의 random 메서드를 사용하여 생성한 배열에 저장한다.
 *	성적은 0-100점 사이의 값을 갖을 수 있다.
 *	생성된 성적 값을 화면에 출력한다.
 *	구현할 때 .length를 사용해라


public class Test0527 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 크기:");
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