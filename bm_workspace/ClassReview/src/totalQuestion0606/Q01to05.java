package totalQuestion0606;

public class Q01to05 {
	public static void main(String[] args) {
		//Q1.
		System.out.printf("Q1. 10/4 = %f\n", ((double)10/4));
		
		//Q2. while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
		int sum = 0, num = 0;
		while(num <=100) {
			num++;
			if(num%5 == 1) {
				continue;
			}
			sum+=num;
		}
		System.out.printf("Q2. 5�� ����� �� = %d\n", sum);
		
		//Q3. 0���� 30���� �߿��� 5�� ����� �����ϰ� ���(���ѹݺ���, break, continue �� ���)
		num=0;
		while(true) {
			num++;
			if(num>30)
				break;
			if(num%5 == 0)
				continue;
			else
				
				
				System.out.print(num+" ");
		}
		System.out.println();
		
		//Q4. main�Լ��� ���� adder, exp �Լ��� �ۼ��Ͻÿ�
		int result = adder(10, 20);		//�� ���� �� ���
		System.out.println(result);
		System.out.println( exp(3.4) );	//������ ���
		
		//Q5. equals(�� ���� ������ ������ ��), 
		// toString�޼ҵ带 ����Ͽ� �ϼ����Ѷ�. (�������� 30��)
		Circle a = new Circle(30);
		Circle b = new Circle(30);
		
		System.out.println("������: "+a);
		System.out.println("������: "+b);
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("�ٸ� ��");
		}


	}//main end
	
	//Q4.
	static int adder(int a, int b) {
		return a+b;
	}
	static double exp(double a) {
		return a*a;
	}
	
}//Q01to05 class end

//Q5.
class Circle {
	int r;
	Circle(int r){
		this.r=r;
	}
	
	public String toString() {
		return r+"";
	}
	
	public boolean equals(Object obj) {
		 Circle ci = (Circle)obj;
		 if(ci.r == r)
			 return true;
		 else
			 return false;
	}
}
