package controlflow;
import java.util.Scanner;
/**
 * 반복문 : for, while, do while
 * 
 * for(초기식;조건식;증감식){
 * 		반복하고 싶은 실행문
 * }
 * 초기식 삭제가능. ; 필수.
 * 
 * 
 */
public class TestFor {

	public static void main(String[] args) {
		
		//0~10까지 출력하는대 짝수만 출력
//		for (int i = 0; i <= 10; i+=2) {
//			System.out.print(i+ " ");
//		}
//		System.out.println();
		
		//1~100까지 수 중에서
		// 5의 배수이고 6의 배수인 수 출력
//		for (int i = 0; i <= 100; i++) {
//			if (i%5==0 && i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		
		//************* 누적합 구하기 *************
//		int sum = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		for (int i = 0; i < 15; i++) {
//			System.out.print("*");
//		}
		
//		for(int i=1; i<=15; i++) {
//			System.out.print("*");
//			if(i%5==0) {
//				System.out.println();
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇단?");
//		
//		int dan = sc.nextInt();
//		
//		for (int i = 9; i >=1; i--) {
//			System.out.printf("%d*%d=%d\n", dan,i,dan*i);
//		}
		
		
		// 1.	5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
		System.out.printf("%.2f\n", 5/3.0);
		
		//2. 키(double)를 하나 입력받아  
		// 160보다 작으면 “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		double height1 = sc.nextDouble();
		
		if (height1 <= 160) {
			System.out.println("small");
		} else if(height1 <= 170) {
			System.out.println("medium");
		} else {
			System.out.println("large");
		}
		
		//3. n1을 50, n2를 100으로 초기화하여 
		//두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
		
		int n1 = 50, n2 = 100;
		System.out.println(n1 > n2 ? n1 : n2);
		
		//4. 나이를 기준으로 중첩if문을 사용하여 출력해라.
		//(나이, 키, 사이즈 각각 변수를 선언)
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요: ");
		double height2 = sc.nextDouble();
		String size;
		
		/*
		if (age >= 20) { 				//20세 이상
			if(height2 >= 175) { 		//20세 이상이고 키 175 이상
				size = "L";
			} else if(height2 >= 165) { //20세 이상이고 키 165 이상
				size = "M";
			} else {  					//20세 이상이고 키 165 미만
				size = "S";
			}
		} else { 						//20세 미만
			if(height2 >= 170) { 		//20세 미만이고 키 170 이상
				size = "L";
			} else if(height2 >= 160) { //20세 미만이고 키 160 이상
				size = "M";
			} else {  					//20세 미만이고 키 160 미만
				size = "S";
			}
		}
		*/
		
		if (age<20) {	//나이가 20세 미만
			if (height2<160) {
				size="S";
			} else if(height2<170) {
				size="M";
			} else {
				size="L";
			}
		} else {	//나이가 20세 이상
			if (height2<165) {
				size="S";
			} else if(height2<175) {
				size="M";
			} else {
				size="L";
			}			
		}
		
		System.out.printf("나이: %d, 키: %.1f, 사이즈: %s\n", age, height2, size);
		
		
		//5.	1부터 50까지의 정수를 출력해라.(for)
		for(int i=1; i <=50; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//5-1. 1~50 정수 중 6의 배수를 출력해라.(for, if)
		for(int i=1; i <=50; i++) {
			if (i%6 ==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		
		//5-2. 1~50까지의 총합 출력해라.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum+=i;
		}
		System.out.println("1에서 50까지의 합: " + sum);
		
		//5-3. 1~50 정수를 random함수로 범위 설정 한 후 
		//무작위 수 하나(난수)출력해라.
		int num1 = (int)Math.random()*50 +1;
		System.out.println("난수: "+num1);
		
		//6.	a=10, b=20으로 초기화하고, 
		//연산자(+,-,*,/)중 하나를 입력받는다. 
		//+이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
		int a=10, b=20;
		System.out.println("연산자 하나(+,-,*,/)를 입력하세요: ");
		char op = sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
		
		//0+1+2+3+4+5+6+7+8+9+10=55
		int sum1 = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum1+=i;
			System.out.print(i);
			
			if (i==10) {
				System.out.print("=");
				System.out.print(sum1);
			} else {
				System.out.print("+");
			}
			
		}


	}

}
