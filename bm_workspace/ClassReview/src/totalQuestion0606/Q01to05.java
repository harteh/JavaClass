package totalQuestion0606;

public class Q01to05 {
	public static void main(String[] args) {
		//Q1.
		System.out.printf("Q1. 10/4 = %f\n", ((double)10/4));
		
		//Q2. while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
		int sum = 0, num = 0;
		while(num <=100) {
			num++;
			if(num%5 == 1) {
				continue;
			}
			sum+=num;
		}
		System.out.printf("Q2. 5의 배수의 합 = %d\n", sum);
		
		//Q3. 0부터 30까지 중에서 5의 배수를 제외하고 출력(무한반복문, break, continue 다 사용)
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
		
		//Q4. main함수를 보고 adder, exp 함수를 작성하시오
		int result = adder(10, 20);		//두 수의 합 출력
		System.out.println(result);
		System.out.println( exp(3.4) );	//제곱값 출력
		
		//Q5. equals(두 원의 면적이 같은지 비교), 
		// toString메소드를 사용하여 완성시켜라. (반지름이 30임)
		Circle a = new Circle(30);
		Circle b = new Circle(30);
		
		System.out.println("반지름: "+a);
		System.out.println("반지름: "+b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("다른 원");
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
