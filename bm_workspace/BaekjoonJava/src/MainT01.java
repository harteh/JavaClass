import java.util.Scanner;

public class MainT01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시간(시각, 분)을 입력하세요 : ");
		int CurrentA = sc.nextInt();	//현재 시각 (0 ≤ A ≤ 23)
		int CurrentB = sc.nextInt();	//현재 분 (0 ≤ B ≤ 59)

		System.out.println("요리하는데 걸리는 시간을 분단위로 입력하세요 : ");
		int UseC = sc.nextInt();		//요리하는데 걸리는 시간 분(0 ≤ C ≤ 1,000)
		
		
		int EndTime = CurrentB + UseC;
		System.out.printf("종료시간 = %d %d\n", CurrentA, EndTime );

	}

}
