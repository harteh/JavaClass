import java.util.Scanner;

public class Revie0516 {

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
		
		System.out.println("********* �迭 *********");
		//������ 10�� �Է¹޾� �迭�� �����Ѵ�.
//		int arr[]= new int[10];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//			
//			//5�� ����� ���
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
		//������ ¦���� ���
		
		for (int dan = 2; dan <= 9; dan++) {
			if(dan%2==0) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d*%d=%d ", dan,i,dan*i);
				}
			System.out.println();
			}
		}

		System.out.println("********* p.123 Q4 *********");
		//�ݺ������� * �ﰢ�� �׸���
//		int line=4;
//		int space=(line/2)+1;
//		int star=1;
//		
//		for(int i=0; i<line; i++) {
//			for (int j = 0; j < space; j++) {	//����
//				System.out.print(' ');
//			}
//			for(int j=0; j<star; j++) {	//��
//				System.out.print("*");
//			}
//			for (int j = 0; j < space; j++) {	//����
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
	

		System.out.println("********* p.123 Q5 *********");
		//7�� ������� �׸���

		
		for (int i = 0; i <7; i++) {	//��ü ����
		    if (i<4) {	//�� ����, ���� ���� //��i: 0,1,2,3,4

		        for (int j=0; j<3-i; j++) {//���� 4,3,2,1,0
		            System.out.print(" ");					
		        }
		        for (int j=0; j<(i*2)+1; j++) {//�� 1,2,3,4,5
		            System.out.print("*");
		        }

		    } else {	//�� ����, ���� ����	//��i: 5,6,7,8

		        for (int j=0; j<i-3; j++) {		//���� 1,2,3,4
		            System.out.print(" ");
		        }
		        for (int j = (7-i)*2; j >1 ; j--) {		//�� 4,3,2,1
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
