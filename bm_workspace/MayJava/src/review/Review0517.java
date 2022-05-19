package review;
import java.util.Scanner;

public class Review0517 {

	public static void main(String[] args) {
		
		//정수 10개를 입력받아 배열에 저장한 후, 
		//배열을 검색하여 4의 배수만 골라 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//			if( arr[i]%4==0 ) {
//				System.out.println(arr[i]);
//			}
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if( arr[i]%4==0 ) {
//				System.out.println(arr[i]);
//			}			
//		}
		
		
		//정수 a=50, b=150으로 초기화해서 
		//a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력
		//(삼항 조건 연산자 활용)
		
		int a=50, b=150;
		int result = a>b ? a*b : a/b;
		System.out.println("2: "+result);
		
		
		//100이하의 자연수 중에서 2의 배수이고 7의 배수인 숫자를 출력하고, 
		//출력된 숫자의 합을 출력(while문 이용)
		
		int sum=0;
		int i=1;
		while(i<=100) {
			if(i%2==0 && i%7==0) {
				System.out.print(i+ " ");
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.println("3: "+sum);
		
		
		//정수를 입력받아 짝수이면 “짝수”, 홀수이면 “홀수” 라고 출력
		//정수를 입력하지 않은 경우에는 프로그램을 종료시켜라.(try-catch 사용)
		
		System.out.println("정수입력:");
		
		try {
			int num=sc.nextInt();
			System.out.println(num%2==0 ? "짝수" : "홀수");
			
		} catch (Exception e) { 
			// 정수를 입력하지 않았을 때의 예외
			System.out.println("오입력");
			return;
		}
		
		
		
		
		
		
		
		

	}

}
