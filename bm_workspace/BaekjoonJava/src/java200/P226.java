package java200;

import java.util.Random;
import java.util.Scanner;

public class P226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("********** p.226,227 **********");
		//int형 배열에 1~10난수 대입하기
		//중복없이 생성하기
		
		int size;
		do {
			System.out.println("배열크기:");
			size = 7;
		} while( size>10);
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			int j;
			do {
				j=0;
				arr[i] = 1 + rand.nextInt(20);
				for(; j<i; j++) {
					if (arr[j] == arr[i]) break;
				}
				
			} while(j<i);
		}
		
		/* (인접요소가 중복되지 않도록 하기)
		arr[0] = (int)((Math.random()*10)+1);
		for(int i=1; i<size; i++) {
			do {
				arr[i] = (int)((Math.random()*10)+1);
			} while(arr[i]==arr[i-1]);
		} */
		
		/* p.226
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		} */
		
		for(int a:arr) {
			System.out.print(a+ " ");
		}

		System.out.println();
		System.out.println("********** p. **********");
		
		
		
	}//main end
}//P226 end
