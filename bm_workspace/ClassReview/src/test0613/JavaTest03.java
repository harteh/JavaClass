package test0613;

/*
 * 3.	
A) 입력된 숫자의 합과 입력 숫자 중 최대값을 구하는 Num 라는 이름의 클래스를 만들어라. 
	이 클래스는 add(int n) 라는 메소드를 가지고 있고, 
	이 함수가 호출될 때마다 매개변수n 의 값이 합에 누적된다. (10점)
B) 이 클래스는 getSum() 과 getMax() 라는 메소드를 가지는데, 이 메소드는 더해진 숫자의 합 반환, 현재까지 더해진 숫자 중 최대값을 반환한다. Num 클래스를 사용하는 main()은 다음과 같다. (10점)
	public static void main(String[] args) {
		Num nb = new Num();
		nb.add(7); nb.add(-1); nb.add(20); nb.add(5); // 4개 숫자를 입력
		System.out.println("Sum = " + nb.getSum());   // 4개 숫자의 합계
		System.out.println("Max = " + nb.getMax());   // 4개 숫자 중 최대값
	}}
		실행 결과) Sum=31  
		Max=20  
C)	위에 있는 Num 클래스에 두 개의 생성자를 추가하라. 
	파리미터가 없는 생성자와 하나의 파라미터를 가진 생성자를 만들어 
	파라미터가 없는 생성자는 초기값(n)이 0 이 되도록 하며, 
	정수값 n 을 파라미터로 가지는 생성자는 필드에 값을 초기화해라. 
	그 후 main함수에서 다시 객체 하나 생성하여 getSum(), getMax() 함수를 오버로딩해라.(10점)
 */
class Num03 {
	int num3;
	int max3;
	int sum3=0;
	
	Num03(){
		num3=0;
	}
	Num03(int n){
		this.num3=n;
		sum3+=n;
		if(max3 < n) {
			max3 = n;
		}
	}
	Num03(int n, int m){
		this.num3=n;
		sum3 =sum3+n+m;
		if(n < m) {
			n = m;
			if(max3 < n) {
				max3 = n;
			}
		}
	}
	
	void add(int n) {
		this.num3=n;
		// 최대값 비교 위치 중요!!!
		if(max3 < n) {
			max3 = n;
		}
		sum3+=n;
	}
	
	int getSum(){
		return sum3;
	}

	int getMax() {
		return max3;
	}
}

public class JavaTest03 {
	public static void main(String[] args) {

		Num03 nb = new Num03();
		nb.add(7);		nb.add(-1);		nb.add(20);		nb.add(5);
		System.out.println("3. Sum = "+ nb.getSum());
		System.out.println("3. Max = "+ nb.getMax());
		
		//3-C
		Num03 nb1 = new Num03();
		nb1.add(10);
		nb1.add(20);
		System.out.println("3-1. Sum = "+ nb1.getSum());
		System.out.println("3-1. Max ="+ nb1.getMax());
		
		Num03 nb2 = new Num03(8);
		System.out.println("3-2. Sum = "+ nb2.getSum());
		System.out.println("3-2. Max ="+ nb2.getMax());
		
		Num03 nb3 = new Num03(8, 10);
		System.out.println("3-3. Sum = "+ nb3.getSum());
		System.out.println("3-3. Max ="+ nb3.getMax());
	}

}
