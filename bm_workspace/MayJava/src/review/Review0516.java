package review;
import java.util.Scanner;

public class Review0516 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		double arr[][] = new double[3][2];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j]=sc.nextDouble();
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//for-each
		boolean []b= {true,false,true,true};
		
		for(boolean a:b) {
			System.out.println(a);
		}
		
		System.out.println("********* 배열 *********");
		//정수를 10개 입력받아 배열에 저장한다.
//		int arr[]= new int[10];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//			
//			//5의 배수만 출력
//			if(arr[i] %5==0) {
//				System.out.println(arr[i]);
//			}
//		}
		

		System.out.println("********* p.123 Q1 *********");
		//Q1. if-else
		
//		int num1 = 10;
//		int num2 = 2;
//		char operator = '+';
//		
//		if (operator=='+') {
//			System.out.println(num1 + num2);
//		} else if (operator=='-') {
//			System.out.println(num1 - num2);
//		} else if (operator=='*') {
//			System.out.println(num1 * num2);
//		} else if (operator=='/') {
//			System.out.println(num1 / num2);
//		}
//		
//		//Q2. switch-case
//		
//		switch(operator) {
//		case '+':
//			System.out.println(num1 + num2);
//			break;
//		case '-':
//			System.out.println(num1 - num2);
//			break;
//		case '*':
//			System.out.println(num1 * num2);
//			break;
//		case '/':
//			System.out.println(num1 / num2);
//			break;
//		}
		

		System.out.println("********* p.123 Q2 *********");
		//구구단 짝수만 출력
		
		for (int dan = 2; dan <= 9; dan++) {
			if(dan%2==0) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d*%d=%d ", dan,i,dan*i);
				}
			System.out.println();
			}
		}

		System.out.println("********* p.123 Q4 *********");
		//반복문으로 * 삼각형 그리기
//		int line=4;
//		int space=(line/2)+1;
//		int star=1;
//		
//		for(int i=0; i<line; i++) {
//			for (int j = 0; j < space; j++) {	//공백
//				System.out.print(' ');
//			}
//			for(int j=0; j<star; j++) {	//별
//				System.out.print("*");
//			}
//			for (int j = 0; j < space; j++) {	//공백
//				System.out.print(' ');
//			}
//			space-=1;
//			star+=2;
//			System.out.println();
//		}

		System.out.println("********* p.123 Q4 *********");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

		System.out.println("********* p.123 Q5-1 *********");
		//7줄 마름모꼴 그리기

		
		for (int i = 0; i <7; i++) {	//전체 라인
		    if (i<4) {	//별 증가, 공백 감소 //행i: 1,2,3,4

		        for (int j=0; j<3-i; j++) {//공백 3,2,1,0
		            System.out.print(" ");					
		        }
		        for (int j=0; j<(i*2)+1; j++) {//별 1,3,5,7
		            System.out.print("*");
		        }

		    } else {	//별 감소, 공백 증가	//행i: 5,6,7

		        for (int j=0; j<i-3; j++) {		//공백 1,2,3
		            System.out.print(" ");
		        }
		        for (int j=(7-i)*2; j >1 ; j--) {	//별 5,3,1
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		}
		
		System.out.println("********* p.123 Q5-2 *********");
		for (int i = 1; i <= 7; i++) {
			
			int k = (i <= 4) ? 4 - i : i - 4;
			
			for (int j = 1; j <= k; j++) {
				System.out.print(' ');
			}
			
			for (int j = 1; j <= 7 - 2 * k; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		

		System.out.println("********* p.230 Q2 *********");
		
		for (int i=0;i<7;i++){
			for (int j=0; j<7;j++)
			{
				if (i<=7/2)
				{
					if (i+j<=7/2-1)
						System.out.print(" ");
					else if (j-i>=7/2+1) 
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else if (i>7/2) 
				{
					if (i-j>=7/2+1) 
						System.out.print(" ");
					else if (i+j>=7/2*3+1)
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("********* p.230 Q2 *********");
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;	//아스키값으로 각 요소에 저장
		}
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = (char)(alphabets[i]+32);
		}
		//alphabets[0]='a'
		//alphabets[1]='b'
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i] +","+ (int)alphabets[i]);
		}
		
		
//		for(int i=0; i<alphabets.length; i++) {
//			System.out.println(alphabets[i] +","+ (int)alphabets[i]);
//		}
//		
//		for(int i=0; i<alphabets.length; i++) {
//			System.out.println((char)(alphabets[i]+32) +","+ (int)(alphabets[i]+32));
//		}
		

		
	}

}
