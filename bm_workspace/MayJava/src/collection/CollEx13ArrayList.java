package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollEx13ArrayList {
	public static void main(String[] args) {
		//String
		ArrayList<String> a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		//for 문으로 문자열을 입력받아 arraylist에 삽입
		for(int i=0; i<3; i++) {
			String str = sc.next();
			a.add(str);
		}
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("***** 향상된 for문 *****");
		for(String s:a) {
			System.out.println(s);
		}
		
		//가장 긴 문자열 출력
		int max=0;		//길이 비교용 인덱스 초기값을 0으로 설정
		for(int i=0; i<a.size(); i++) {
			if(a.get(max).length() < a.get(i).length()) {
				max = i;	//길이가 긴 인덱스를 저장한다.
			}
		}
		System.out.println("가장 긴 문자열: "+a.get(max));
		
		System.out.printf("가장 긴 문자열의 번호: %d. 가장 긴 문자열의 길이: %d", 
				max, a.get(max).length());

	}
}
