import java.util.Scanner;

public class MainT01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//오븐시계
		System.out.println("현재 시간(시각, 분)을 입력하세요 : ");
		int cA = sc.nextInt();	//현재 시각 (0 ≤ A ≤ 23)
		int cB = sc.nextInt();	//현재 분 (0 ≤ B ≤ 59)

		System.out.println("요리하는데 걸리는 시간을 분단위로 입력하세요 : ");
		int uC = sc.nextInt();		//요리하는데 걸리는 시간 분(0 ≤ C ≤ 1,000)
		
		
//		int endA;	//종료 시각
		int endB;	//종료 분
		
		//endB 가 59이상이 되면 endA가 +1 된다
		
		endB = cB + uC;
		
		if (endB > 59) {
			cA += 1;
			endB -= 60;
		}
		System.out.printf("종료시간은 %d : %d", cA,endB);
		

		

	}

}
