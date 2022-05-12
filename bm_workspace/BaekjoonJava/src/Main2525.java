import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//오븐시계
		System.out.println("현재 시간(시각, 분)을 입력하세요 : ");
		int A = sc.nextInt();	//현재 시각 (0 ≤ A ≤ 23)
		int B = sc.nextInt();	//현재 분 (0 ≤ B ≤ 59)

		System.out.println("요리하는데 걸리는 시간을 분단위로 입력하세요 : ");
		int C = sc.nextInt();		//요리하는데 걸리는 시간 분(0 ≤ C ≤ 1,000)
		
		if (B + C > 59) {
			A += 1;
			B = (B+C) - 60;
		}
		if (A > 23 && B > 59) {
			A = 0;
			B = 0;
		}
		System.out.printf("종료시간은 %d : %d", A,B);
		

		

	}

}
