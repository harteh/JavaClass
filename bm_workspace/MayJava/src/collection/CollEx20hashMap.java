package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollEx20hashMap {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		
		h.put("물", "water");
		h.put("커피", "coffee");
		h.put("티", "tea");
		
		System.out.println( h.get("커피") );
		//키를 기준으로 값을 뽑아냄
		
		Set<String> keys = h.keySet();	//물, 커피, 티
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String a = it.next();	//키
			String b = h.get(a);	//a로부터 value 가져오기
			
			System.out.println(a+" "+b);
		}
		
	}
}
