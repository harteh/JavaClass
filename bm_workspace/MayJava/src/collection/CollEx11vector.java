package collection;

import java.util.Vector;

public class CollEx11vector {
	public static void main(String[] args) {
		// List
		Vector<Integer> v = 
				new Vector<Integer>();
		
		//정수 5개를 객체형태로 넣기
		v.add(new Integer(5));
		v.add(5);	//오토박싱이여서 new Integer(5) 로 저장하지 않아도 된다.
		v.add(10);
		v.add(0, 20);	//인덱스 0에 20을 넣겠다.
		
		System.out.println("벡터 개수:"+v.size());
		
		for(int i=0; i<v.size(); i++) {
			int v2 = v.get(i);	//벡터에서 꺼낼 때
			System.out.println(v2);
		}

	}
}
