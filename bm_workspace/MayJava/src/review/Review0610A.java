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
 * 1. �̸��� id���Է¹޾� PersonŬ�����ۼ��ϰ��Է��Ѱ�������ض�.(��ü�迭�ǰ����� 3��)
	1.2 1�����̾���������������������������ڵ带�߰��ض�. (Person��ü�迭����ض�.)
	
	������)
	�̸�, id�Է�: ȫ�浿 111
	�̸�, id�Է�: ��浿 222
	�̸�, id�Է�: �ڱ浿 333

	�̸�����? ȫ�浿
	��: 111
	�̸�����? �ֱ浿
	�̸�����.
	�̸�����? Stop
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
			System.out.println("�̸��� ���̵� �Է�:");
			String name = sc.next();
			int id = sc.nextInt();
			
			p[i] = new Person0610(name, id);
			// ���� 123	���� 345 ���� 543
			
			//2
			h.put(name, id);
		}
		//��ü�迭 ��ü ���
		for(Person0610 pp : p) {
			System.out.println(pp);
		}
		
		//2
		while(true) {
			System.out.println("�̸� ����?");
			String answer = sc.next();
			
			if(h.containsKey(answer)) {
				System.out.println("��:"+h.get(answer));
			}
			else if(answer.equals("stop")) {
				break;
			} 
			else {
				System.out.println("�̸� ����");
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
