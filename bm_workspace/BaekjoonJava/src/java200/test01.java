package java200;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		System.out.println("********** p.205 **********");
		//배열의 각 요소에 5,4,3,2,1 을 순서대로 대입해서 표시
		int arr[] = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=5 - i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		System.out.println();
		System.out.println("********** p.215 **********");
		//점수를 입력받아서 합계, 평균, 최고점, 최저점을 표시
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("사람 수: ");
		int n=sc.nextInt();
		int[] point=new int[n];		//인원 수 만큼의 배열
		
		for(int i=0; i<point.length; i++) {
			System.out.printf("%d 번의 점수: \n", i+1);
			point[i] = sc.nextInt();	//사람마다 점수 입력 받음
			sum += point[i];	//점수 합계
		}
		System.out.printf("점수 합계 = %d, 평균 = %.1f\n", sum, (double)(sum/n));
		
		//최고점, 최저점
		int max = point[0];
		int min = point[0];
		
		for (int i = 1; i < point.length; i++) {
			if (point[i] > max)
				max = point[i];
			if (point[i] < min)
				min = point[i];
		}
		System.out.printf("최고점 = %d점, 최저점 = %d점\n", max, min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
