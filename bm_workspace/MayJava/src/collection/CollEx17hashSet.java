package collection;

import java.util.HashSet;
import java.util.Iterator;

class Num {
	int a;
	Num(int a) {
		this.a=a;
	}
	
	public String toString() {
		return a+"";
	}
	
	@Override
	public int hashCode() {
		return a%3;		//1. 기준을 정해서 그룹핑, 0~2
	}

	@Override
	public boolean equals(Object obj) {
		Num num = (Num)obj;		//다운캐스팅
		if(num.a == a) {
			//매개변수로 받은 a와 자신의 a가 같으면 true를 반환한다.
			return true;
		}
		else {
			return false;
		}
	}
}

public class CollEx17hashSet {
	public static void main(String[] args) {

		HashSet<Num> h = new HashSet<Num>();
		
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(60));
		h.add(new Num(60));
		
		System.out.println(h);
		
		Iterator<Num> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
