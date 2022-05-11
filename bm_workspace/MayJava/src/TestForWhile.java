
public class TestForWhile {

	public static void main(String[] args) {
		
		System.out.println("****** 0-9 ******");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("****** 0-100까지의 합 1. ******");
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("****** 0-100까지의 합 2. ******");
		int total = 0;
		for (int i = 100; i <=0 ; i--) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("****** 0~10 중 짝수만 출력 ******");
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();

		//중첩반복문
		System.out.println("****** 중첩반복문 1 ******");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}
		
		System.out.println("****** 중첩반복문 2 ******");
		/*
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("****** 중첩반복문 3 ******");
		/*
		 *     1			//i=0, 공백 4, 숫자 1
		 *    123			//i=1, 공백 3, 숫자 3
		 *   12345			//i=2, 공백 2, 숫자 5
		 *  1234567			//i=3, 공백 1, 숫자 7
		 * 123456789		//i=4, 공백 0, 숫자 9
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		

		
		
		
	}

}
