package review;

import java.util.Scanner;

public class Review0519C {

	public static void main(String[] args) {
		/*
		 * 5명의 학생의 점수를 입력하여 유효점수와 평균 출력하는 프로그램
		 * 유효점수는 최고점과 최저점을 제외한 점수이며,
		 * 평균은 유효점수로 계산하라.
		 * (for-if문 중첩, continue 사용)
		 * 
		 * 실행결과)
		 * 		5명 학생 점수 입력: 1 2 3 4 5
		 * 		유효점수: 2 3 4
		 * 		평균: 3.0
		 */
		
		Scanner sc = new Scanner(System.in);
		
/*내 코드		
		int[] score = new int[5];
		int sum=0;
		double avg;
		int cnt=0;
		
		System.out.print("5명 학생 점수: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		int temp;	//교환용 빈공간
		int size = score.length; //5
		
		for(int i=0; i<size; i++) {
			for(int j=0; j< size-i-1; j++) {
				if(score[j] > score[j+1]) {
					temp = score[j+1];
					score[j+1] = score[j];
					score[j] = temp;		
				}
			}
		}
		
		System.out.println("유효점수: " );
		for (int i = 1; i < size-1; i++) {	//배열 출력
			System.out.print(score[i] +" ");	//5명 점수 전체
			sum += score[i];
			cnt++;
		}
		System.out.println();
		avg = sum/(double)cnt;
		System.out.println("평균: " + avg);
*/
		
		int[] score = new int[5];
		int sum=0;
		double avg;
		int max, min;
		
		System.out.print("5명 학생 점수: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();	//90 100 84 70 85
		}
		
		max=min=score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("유효점수: ");
		for(int i=0; i<score.length; i++) {
			if(max==score[i] || min==score[i]) {
				continue;
			} else {
				sum += score[i];
			}
			System.out.print(score[i]+" ");
		}
		System.out.println();
		System.out.println("평균: "+sum/3.0);
		


	}

}
