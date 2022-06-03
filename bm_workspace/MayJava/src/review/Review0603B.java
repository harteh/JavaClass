package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 1 LinkedList�� ��one��,��two��,��three���� �����Ѵ�. 
 * ������ Iterator�� �ݺ��� ��(while) 
 * ��three����� �ܾ ���̸�(comepareTo�Լ����) �����ض�.
 *
public class Review0603B {
	public static void main(String[] args) {
		
		LinkedList<String> a = new LinkedList<String>();
		a.add("one");
		a.add("two");
		a.add("three");
		
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.compareTo("three") == 0) {
				it.remove();
			}
		}
		
		it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
*/

/*
 * 2 HashMap�� (1,��one��),(2,��two��),(3,��three��)�� �����Ͽ� 
 * Ű, ���� �� ����Ѵ�. 
 * �����, 1�� �Է��ϸ� one, 
 * 2�� �Է��ϸ� two, 
 * 3���Է��ϸ� three�� ��µ� �� �ְԲ� �ڵ带 �ۼ��ض�. 
 */
public class Review0603B {
	public static void main(String[] args) {
		
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "one");
		a.put(2, "two");
		a.put(3, "three");
		
		Set<Integer> key = a.keySet();
		Iterator<Integer> it = key.iterator();
		
		Scanner sc = new Scanner(System.in);
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
//		int num = sc.nextInt();
		System.out.println(a.get(sc.nextInt()));
		
		
		
	}
}
