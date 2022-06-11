package review;

import java.util.Arrays;
import java.util.HashSet;

/*
 public class Review0610A {
	public static void main(String[] args) {
		
	}
}
 */

/*
 * 1. 이름과 id를입력받아 Person클래스작성하고입력한값다출력해라.(객체배열의개수는 3개)
	1.2 1번에이어다음과같은실행결과가나오도록코드를추가해라. (Person객체배열사용해라.)
	
	실행결과)
	이름, id입력: 홍길동 111
	이름, id입력: 김길동 222
	이름, id입력: 박길동 333

	이름뭐니? 홍길동
	답: 111
	이름뭐니? 최길동
	이름없다.
	이름뭐니? Stop
*
class Person0610 {
	String name;
	int id;
	
	Person0610(String name, int id){
		this.name=name;	this.id=id;
	}
	
	public String toString() {
		return name+" "+id;
	}
}

public class Review0610A {
	public static void main(String[] args) {
		
		// 1
		Person0610 p[] = new Person0610[3];
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++) {
			System.out.println("이름과 아이디 입력:");
			String name = sc.next();
			int id = sc.nextInt();
			
			p[i] = new Person0610(name, id);
			// 세종 123	정조 345 태조 543
			
			//2
			h.put(name, id);
		}
		//객체배열 전체 출력
		for(Person0610 pp : p) {
			System.out.println(pp);
		}
		
		//2
		while(true) {
			System.out.println("이름 뭐니?");
			String answer = sc.next();
			
			if(h.containsKey(answer)) {
				System.out.println("답:"+h.get(answer));
			}
			else if(answer.equals("stop")) {
				break;
			} 
			else {
				System.out.println("이름 없음");
			}
		}
		
	}
}
*/
/*
 * 3.
 */
class AA {
	String str;
	AA (String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
	public int hashCode() {
		return Integer.parseInt(str);
	}
	
	public boolean equals(Object obj) {
		AA a = (AA)obj;
		if(a.str == str) {
			return true;
		}
		return false;
	}
}

public class Review0610A {
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		
		int idx = Arrays.binarySearch(arr, 2);
		System.out.println(idx);
		
		/* for(int aa: arr2) { System.out.print(aa+" "); }  */
		
		System.out.println(Arrays.toString(arr));
		int[][] arr3 = {
					{1,2}, {3,4},
					{7,8}, {5,6} };
		System.out.println(Arrays.deepToString(arr3));
		System.out.println("===============");
		
		HashSet<AA> c = new HashSet<>();
		HashSet<String> cc = new HashSet<>();
		c.add(new AA("11"));		c.add(new AA("22"));		c.add(new AA("11"));
		cc.add("11");		cc.add("22");		cc.add("11");
		System.out.println(c);
		System.out.println(cc);
		System.out.println("===============");
		
	}
}
