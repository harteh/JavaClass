package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class CollEx19treeSet {
	public static void main(String[] args) {

		TreeSet<Integer> grade =
				new TreeSet<Integer>();
		grade.add(30);
		grade.add(160);
		grade.add(100);
		grade.add(50);
		
		Integer i;
		i = grade.first();
		System.out.println("first() :"+i);
		
		i = grade.last();
		System.out.println("last() :"+i);
		
		i = grade.lower(new Integer(80));
		//80보다 낮은 값 중 큰값
		System.out.println("lower() :"+i);
		
		i = grade.higher(80);
		//주어진 요소보다 큰 값중, 작은 값을 반환
		System.out.println("higher() :"+i);
		
		
		Iterator<Integer> it = grade.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
