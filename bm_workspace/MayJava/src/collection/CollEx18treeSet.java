package collection;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro> {
	String a;
	int b;
	Pro(String a, int b) {
		this.a=a;	this.b=b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
	
	@Override
	public int compareTo(Pro o) {
//		return (this.b - o.b);
		//정렬기준을 정수값 b로 줌.
		//새로 추가한 값과 매개변수로 받은 값을 비교해서 내림차순으로 정렬
		if(b> o.b)
			return 1;
		else if(b < o.b)
			return -1;
		else
			return 0;
	}
}

public class CollEx18treeSet {
	public static void main(String[] args) {

		TreeSet<Pro> t = new TreeSet<Pro>();
		
		t.add(new Pro("cc", 128));
		t.add(new Pro("ee", 123));
		t.add(new Pro("bb", 125));
		
		Iterator<Pro> it = t.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
		
	}
}
