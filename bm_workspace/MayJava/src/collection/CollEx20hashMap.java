package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollEx20hashMap {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		
		h.put("��", "water");
		h.put("Ŀ��", "coffee");
		h.put("Ƽ", "tea");
		
		System.out.println( h.get("Ŀ��") );
		//Ű�� �������� ���� �̾Ƴ�
		
		Set<String> keys = h.keySet();	//��, Ŀ��, Ƽ
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String a = it.next();	//Ű
			String b = h.get(a);	//a�κ��� value ��������
			
			System.out.println(a+" "+b);
		}
		
	}
}
