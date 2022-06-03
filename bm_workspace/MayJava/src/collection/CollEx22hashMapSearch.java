package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollEx22hashMapSearch {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		
		h.put("computer", "컴퓨터");
		h.put("coffee", "커피");
		h.put("cream", "크림");
		
		//모든 키 값들을 set에 (집합형태로)받아오겠다.
		Set<String> key = h.keySet();

		//key를 기준으로 순회하며 전체 출력
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();	//Key
			String v = h.get(k);	//k에 맞는 Value
			
			System.out.println(k+":"+v);
		}
		
		//단어 검색 구현
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("찾을 답어 입력:");
			String str = sc.next();		//검색하려는 키
			String str2 = h.get(str);	//키에 맞는 값

			if(str2 == null) {
				System.out.println(str+"은 없는 단어");
			}
			else {
				System.out.println(str2);
			}
		}
		
		
	}
}
