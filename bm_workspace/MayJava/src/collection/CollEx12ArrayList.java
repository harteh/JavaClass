package collection;

import java.util.ArrayList;

class XY {
	private int x, y;
	public XY(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return x+" "+y;
	}
}

public class CollEx12ArrayList {
	public static void main(String[] args) {

		ArrayList<XY> a = new ArrayList<XY>();
		a.add(new XY(3, 4));
		a.add(new XY(4, 5));
		a.add(new XY(2, 9));	//객체에 추가, 생성
		
		a.remove(1);	//인덱스 1 객체 삭제
		
		
		for(int i=0; i<a.size(); i++) {
			XY x = a.get(i);
			System.out.println(x);
		}
		
		System.out.println("== 향상된 for문 사용 ==");
		for(XY x:a) {
			System.out.println(x);
		}
		
		
		/*
		ArrayList<Integer> v = new ArrayList();
		v.add(1);
		v.add(2);
		v.add(new Integer(3));	//auto unboxing
		
		v.add(2, 4);
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		*/
		
	}
}
