import java.util.Scanner;

/**
 * 이차원배열
 * - 출력은 for문으로 i(행), j(열)을 반복하며 출력한다..
 *
 */
public class Array04 {

	public static void main(String[] args) {

		System.out.println("****** ary의 데이터를 ary1에 복사 ******");
//		int ary[][] = {{1,2,3,4},
//					   {5,6,7,8}};		//2행 4열
//		
//		int ary1[][] = new int[4][2];	//4행 2열
//		
//		//범위설정하고 
//		for(int i=0; i<2; i++) {		//2행
//			for(int j=0; j<4; j++) {	//4열
//				ary1[j][i]=ary[i][j];
//			}
//		}
//		
		System.out.println("****** 4행 2열 ary1에 저장되어 있는 데이터 다 출력 ******");
//		for(int i=0; i<4; i++) {
//			for (int j=0; j<2; j++) {
//				System.out.print(ary1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** 2행3열에 정수를 입력해 입력한 정수 총합 출력 ******");
//		int ary[][] = new int[2][3];
//		int sum=0;
//		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				ary[i][j] = sc.nextInt();	//배열 좌표의 데이터 값 각각 1개씩임..
//				sum += ary[i][j];
//			}
//		}
//		System.out.println(sum);
		
//		int ary[] = new int[5];
//		int n = ary.length;	//배열의 개수
//		System.out.println(n);
		
		System.out.println("****** 2차원 배열의 개수 ******");
		int ary[][] = new int[2][5];
		int n = ary.length;
		System.out.println(n);	//2차원 배열의 행의 개수 (배열명.length)
		
		int m = ary[0].length;	//2차원 배열의 열의 개수 (배열명[0].length)
		System.out.println(m);
		
		
		System.out.println("****** 비정방형 배열 ******");
		String s[][] = {
				{"java"},
				{"c","c++"},
				{"html","css","python"}
		};
		
		for (int i = 0; i < s.length; i++) {
			for(int j=0; j<s[i].length; j++ ) {
				System.out.print(s[i][j]+" ");
			}
		}
		System.out.println();
		
		System.out.println("****** 배열 평균 구하기 ******");
		int ary1[][] = { {90, 90, 110, 110}, 
						{120, 110, 100, 110}, 
		                {120, 140, 130, 150}};
		
		double sum = 0;
		int cnt = 0;
		for(int i=0; i<ary1.length; i++) {
			for(int j=0; j<ary1[i].length; j++) {
				sum += ary1[i][j];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/ary1.length);	//행 기준 평균
		System.out.println(sum/cnt);			//개수 기준 평균
		
		
		
		
		
	}

}
