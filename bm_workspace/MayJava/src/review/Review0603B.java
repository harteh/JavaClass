package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 1 LinkedList에 “one”,”two”,”three”를 저장한다. 
 * 저장후 Iterator로 반복한 후(while) 
 * “three”라는 단어가 보이면(comepareTo함수사용) 삭제해라.
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
 * 2 HashMap에 (1,”one”),(2,”two”),(3,”three”)를 저장하여 
 * 키, 값을 다 출력한다. 
 * 출력후, 1을 입력하면 one, 
 * 2를 입력하면 two, 
 * 3을입력하면 three가 출력될 수 있게끔 코드를 작성해라. 
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
