import java.util.Scanner;

public class Review0518 {
	
	//배열 리턴 함수
//	static int[] make() {
//		int arr[]=new int[4];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=i;
//		}
//		
//		return arr;
//	}
//
//	public static void main(String[] args) {
//
//		int arr[];	//배열 래퍼런스(참조) 변수 선언
//		arr=make();	//배열 리턴
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]+" ");
//		}
//	}
	
	
	//두 정수 입력받아 합구하기
//	public static void main(String[] args) {
//	
//		//무한루프안에 두 정수를 입력받아 합을 구하고, 
//		//실수를 입력하면 “실수는 안된다”라고 출력하고, 
//		//다시 두 정수를 입력받는 코드를 작성해라.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2;
//		while(true) {
//			try {
//				//정수 입력을 try문 안에서 입력받아야 오입력예외 처리를 할 수 있다.
//				num1=sc.nextInt();
//				num2=sc.nextInt();
//				
//				System.out.println("두 정수 입력: "+ num1 +" "+num2);
//				System.out.println("답: "+(num1+num2));
//				break;
//			} catch (Exception e) {	// 실수를 입력했을 때 예외
//				System.out.println("실수는 안된다.");
//				sc.next();
//				continue;
//			}
//			
//		}//while문 끝
//		
//	}//메인 끝
	
	
	//정수 입력받아 몫과 나머지 구하기
//	static void func(int a, int b) {
//		Scanner sc=new Scanner(System.in);
//
//		int c=a/5;
//		int d=a%5;
//		
//		System.out.println("몫: "+c+" 나머지:"+ d);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt(); 
//		int b=5;
//		func(a, b);	//a->몫, b-> 나머지
//	}
	
	
	static void func(int a, int b) {
		System.out.println("양수 입력:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		a=n/5;
		b=n%5;
		System.out.println("몫: "+a+", 나머지:"+ b);
	}
	public static void main(String[] args) {
		int a=0, b=0;
		func(a, b);
	}
	

}
