import java.util.Scanner;

public class Test0513 {

	public static void main(String[] args) {
		
		//-1이 입력될때까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
//		int n = 0;	//입력한 수 출력하기위해 저장할 변수
//		
//		while (true) {
//			if ((n=sc.nextInt())==-1) {
//				break;
//			}
//			System.out.println(n);
//		}

		System.out.println("****** 배열의 최대값 구하기 ******");
		int arr[]= {5,2,7,1,8};
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		};
		System.out.println("최대값: "+max);

		System.out.println("****** for-each 문으로 총합구하기 ******");
		int ary[] = {1,2,3,4,5};
		int sum=0;
		
		for (int i : ary) {
			sum += i;
		}
		System.out.println("합: "+sum);
		

		System.out.println("****** 2차원배열 출력 ******");
		int ary1[][] = new int[3][3];
		int ary2[][] = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2[i].length; j++) {	//해당 행의 열의 개수만큼 반복 
				System.out.print(ary2[i][j] +" ");
			}
			System.out.println();
		}
		

		System.out.println("****** 비정방형배열 출력 ******");
		int ary3[][] = {{10,11,12},
						{20,21},
						{30,31,32},
						{40,41}};
		
		for (int i = 0; i < ary3.length; i++) {
			for (int j = 0; j < ary3[i].length; j++) {
				System.out.print(ary3[i][j] + " ");
			}
			System.out.println();
		}
		


	}

}
