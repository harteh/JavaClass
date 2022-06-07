package review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 4. 배열 초기화
 *
public class Review0607D {
	static int[] make(){
//		int[] ary = new int[] {0,1,2,3,4};
//		return ary;
		
		int[] ary = new int[5];
		for(int i=0; i<ary.length; i++) {
			ary[i]= i;
		}
		return ary;
	}
	
	public static void main(String[] args) {
		int ary[];
		ary = make();
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i] + " ");
		}
	}
}
*/

/*
 * 5. HashSet에 Person객체를저장한다. 
 * 학번이같으면 동일한 Person객체라 판단하고 중복저장이 되지않도록하게 코드를 작성해라.
 *
class Person0607 {
	int num;
	String name;
	
	Person0607(int num, String name){
		this.num=num;		this.name=name;
	}
	
	public int hashCode() {
		return num;
	}
	
	public boolean equals(Object obj) {
		Person0607 p = (Person0607) obj;
		if(p.num == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

public class Review0607D {
	public static void main(String[] args) {
		
		Set<Person0607> s=new HashSet<Person0607>();
		s.add(new Person0607(12, "홍길동"));
		s.add(new Person0607(23, "김길동"));
		s.add(new Person0607(12, "이길동"));

		Iterator<Person0607> it=s.iterator();
		while(it.hasNext()){
			Person0607 p=it.next();
			System.out.println(p.num + " " + p.name);
		}
	}
}
*/
/*
 * 6. Main()을보고코드를작성해라.(c는 1~5까지 합, d는 1~10까지 합)
 */
public class Review0607D {
	
	static int add(int[] a, int b) {
		int sum=0;
		for(int i=0; i<b; i++) {
			sum+= a[i];
		}
		return sum;
	}
	
	static int add(int[] a, int b, int[] c) {
		int sum=0;
//		for(int i=0; i<b; i++) {
//			sum+= a[i];
//			sum+= c[i];
//		}
		
		for(int cc : c) {
			sum += cc;
		}
		
		return sum + add(a, b);
	}
	
	public static void main(String[] args) {

		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		
		int c=add(a,5);
		int d=add(a,5,b);
		
		System.out.println(c);
		System.out.println(d);
	}
}

