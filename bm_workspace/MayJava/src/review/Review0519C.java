package review;

import java.util.Scanner;

public class Review0519C {

	public static void main(String[] args) {
		/*
		 * 5���� �л��� ������ �Է��Ͽ� ��ȿ������ ��� ����ϴ� ���α׷�
		 * ��ȿ������ �ְ����� �������� ������ �����̸�,
		 * ����� ��ȿ������ ����϶�.
		 * (for-if�� ��ø, continue ���)
		 * 
		 * ������)
		 * 		5�� �л� ���� �Է�: 1 2 3 4 5
		 * 		��ȿ����: 2 3 4
		 * 		���: 3.0
		 */
		
		Scanner sc = new Scanner(System.in);
		
/*�� �ڵ�		
		int[] score = new int[5];
		int sum=0;
		double avg;
		int cnt=0;
		
		System.out.print("5�� �л� ����: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		int temp;	//��ȯ�� �����
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
		
		System.out.println("��ȿ����: " );
		for (int i = 1; i < size-1; i++) {	//�迭 ���
			System.out.print(score[i] +" ");	//5�� ���� ��ü
			sum += score[i];
			cnt++;
		}
		System.out.println();
		avg = sum/(double)cnt;
		System.out.println("���: " + avg);
*/
		
		int[] score = new int[5];
		int sum=0;
		double avg;
		int max, min;
		
		System.out.print("5�� �л� ����: ");
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
		
		System.out.println("��ȿ����: ");
		for(int i=0; i<score.length; i++) {
			if(max==score[i] || min==score[i]) {
				continue;
			} else {
				sum += score[i];
			}
			System.out.print(score[i]+" ");
		}
		System.out.println();
		System.out.println("���: "+sum/3.0);
		


	}

}
