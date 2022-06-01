package totalRe0531;

/* Q1
public class Page123 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 10;
		char operator = '/';
		
		double sum=0;
		if(operator == '+') {
			sum = num1 + num2;
		}
		else if (operator == '-') {
			sum = num1 - num2;
		}
		else if (operator == '*') {
			sum = num1 * num2;
		}
		else if (operator == '/') {
			sum = (double)num1 / num2;
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
		}
		System.out.println(sum);
		
		switch(operator) {
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '/':
			sum = (double)num1 / num2;
			break;
		}
		System.out.println(sum);
	}
}
*/
/*
 * Q2
 *
public class Page123 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			if(i%2==1) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d ", i,j, i*j);
			}
			System.out.println();
		}
	}
}
*/
/*
 * Q3
 *
public class Page123 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j > i) {
					break;
				}
				System.out.printf("%dx%d=%d ", i,j, i*j);
			}
			System.out.println();
		}
	}
}
*/
/*
 * Q4
 *
public class Page123 {
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {	//전체 4행	i = 0,1,2,3
			for(int j=0; j<3-i; j++) {	//공백	j = 3,2,1,0
				System.out.print(' ');
			}
			for(int j=0; j<i*2 +1; j++) {	// *j = 1,3,5,7
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
*/
/*
 * Q5
 */
public class Page123 {
	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {	//전체 7행	i = 0,1,2,3
			if(i<4) {
				for(int j=0; j<3-i; j++) {	//공백	j = 3,2,1,0
					System.out.print(' ');
				}
				for(int j=0; j<i*2 +1; j++) {	// *j = 1,3,5,7
					System.out.print('*');
				}
			} else {						//중간 i = 4,5,6
				for(int j=0; j<i-3; j++) {	//공백 j = 1,2,3
					System.out.print(' ');
				}
				for(int j=(7-i)*2; j>1; j--) {	//	 *j = 5,3,1
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}

