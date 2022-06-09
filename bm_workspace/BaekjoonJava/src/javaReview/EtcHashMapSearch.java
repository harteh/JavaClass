package javaReview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 /**
 * HashMap 을 만든다.
 * HashMap에 데이터 추가한다.
 * 
 ** 출력 
 * 모든 키 값들을 (집합형태로) 받아온다
 * 키를 기준으로 순회하며 전체를 출력한다.
 * 
 ** 단어검색
 * 반복문을 이용해서 검색 구현
 * 검색어 입력받기
 * 검색어(키) 에 해당하는 값(Value)를 받아와 저장한다
 * 
 * 값이 없으면 "없는 단어"를 출력하고
 * 있으면 값을 출력한다.
 */
public class EtcHashMapSearch {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		h.put("커피", "coffee");
		h.put("홍차", "(black)tea");
		h.put("맥주", "beer");
		
		//목록 출력
		System.out.println("검색가능한 단어 목록:");
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.print(k+" ");
		}
		System.out.println();
		
		//단어검색
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("'종료'를 입력하면 멈춥니다.");
			System.out.println("찾을 단어 입력:");
			String sch = sc.next();
			String result = h.get(sch);
			
			if(result == null) {
				if(sch.equals("종료")) {
					break;
				}
				System.out.println("없는 단어 입니다.");
			}
			else {
				System.out.println(sch+" = "+result);
			}
			
		}
		
	}
}
