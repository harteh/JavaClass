package review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 4. �迭 �ʱ�ȭ
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
 * 5. HashSet�� Person��ü�������Ѵ�. 
 * �й��̰����� ������ Person��ü�� �Ǵ��ϰ� �ߺ������� �����ʵ����ϰ� �ڵ带 �ۼ��ض�.
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
		s.add(new Person0607(12, "ȫ�浿"));
		s.add(new Person0607(23, "��浿"));
		s.add(new Person0607(12, "�̱浿"));

		Iterator<Person0607> it=s.iterator();
		while(it.hasNext()){
			Person0607 p=it.next();
			System.out.println(p.num + " " + p.name);
		}
	}
}
*/
/*
 * 6. Main()�������ڵ带�ۼ��ض�.(c�� 1~5���� ��, d�� 1~10���� ��)
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

