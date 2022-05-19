package review;
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
	
//	static void func(int a, int b) {
//		System.out.println("양수 입력:");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		a=n/5;
//		b=n%5;
//		System.out.println("몫: "+a+", 나머지:"+ b);
//	}
//	public static void main(String[] args) {
//		int a=0, b=0;
//		func(a, b);
//	}
	
	
	//다섯과목 점수가 저장된 배열의 값에 따라 #출력(#은 5점당 하나씩 출력하며 남는 점수는 버림)
//	static void pr(int[] score, int a) {
//		for(int i=0; i<score.length; i++) {
//			int chk=score[i] / a;
//			for (int j = 0; j < chk; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		int score[]=new int[] {58,60,86,90,84};
//		pr(score, 5);
//	}
	
	
	//반환형을 String 값으로 주고 출력해라
//	static String show(String a, int b) {
//		String result="";
//		for(int i=0; i<b; i++) {
//			//result+=a;
//			result = result.concat(a);	//문자열나열
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(show("$", 10));	//출력-> $$$$$$$$$$
//	}
	

	//"공부는 어렵지만, 재밋네요" 문자열을 str에 저장한 후,
	//","기준으로 문자열을 구분하여 출력하고,
	//인덱스 6에 있는 한 글자를 출력, "공부는" 출력
	public static void main(String[] args) {
		String str="공부는 어렵지만, 재밋네요";
		
		String[] arr=str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String a=str.substring(6,7);
		String b=str.substring(0,3);
		
		System.out.println(a);
		System.out.println(b);
	}
	

}
