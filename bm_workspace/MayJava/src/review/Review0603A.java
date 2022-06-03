package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 3 main() Prob1: main()���� �ο����� �Է¹޾� 
 * �ο����� Profile������ ��ü�迭 ������ �����Ѵ�. 
 * �̸��� ���̵� �Է¹޾� ��ü�迭�� ������ �� ����ض�
 *
class Profile0603{
	String name,id;
	
	Profile0603(String name, String id){
		this.name=name; this.id=id;
	}

	String getname(){ return name;}
	String getid(){ return id;}
}

public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο��� �Է�:");
		int num = sc.nextInt();
		
		Profile0603[] pro = new Profile0603[num];
		for(int i=0; i<pro.length; i++) {
			System.out.println("�̸��� ���̵� �Է�:");
			String name = sc.next();
			String id = sc.next();
			
			pro[i] = new Profile0603(name, id);	//��ü ����
		}
		for(Profile0603 p:pro) {
			System.out.println( p.getname()+", "+p.getid() );
		}
	}
}
*/
/*
 * 4. ArrayList�� 0~100������ ������ ���� 10���� �����ϰ� �������ض�. 
 * 	����Ҷ��� Iterator�������̽��� ����ؼ� ����ض�.
 *
public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			//int num = sc.nextInt();
			//a.add(num);
			a.add( (int)(Math.random()*100)+1 );
		}
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			int result = it.next();
			System.out.print(result+" ");
		}
	}
}
*/
/*
 * 5. Map ����� �̸�, ���� �����ؼ� �̸��� ��ġ�ϴ� ��������ض�.
 *
public class Review0603A {
	public static void main(String[] args) {
		HashMap<String, Integer> h =
				new HashMap<String, Integer>();
		h.put("����", 35);
		h.put("����", 22);
		h.put("����", 47);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�˻��� �̸��� �Է�:");
			String name = sc.next();
			
			if(!h.containsKey(name)) {
				System.out.println("���� �̸��Դϴ�.");
				continue;
			}
			else {
				System.out.println(name+"�� ����="+h.get(name));
				break;
			}
		}
	}
}
*/
/*
 * 6. HashMap���� �̸��� ���̸� �Է¹޾� 3���� ���� �����Ѵ�.
 * ������ �� ���̰� ���� ���� ����� �̸��� ����ض�. 
 *
public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> h =
				new HashMap<Integer, String>();
		
		System.out.println("���̿� �̸� �Է�:");
		for(int i=0; i<3; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			
			h.put(age, name);
		}
		
		int maxAge = 0;
		Set<Integer> ageSet = h.keySet();
		Iterator<Integer> it = ageSet.iterator();
		while(it.hasNext()) {
			int chk = it.next();
			if(maxAge < chk) {
				maxAge = chk;
			}
		}
		String chkName = h.get(maxAge);
		System.out.println(chkName);
	}
}
*/
/*
 * 6-1. HashMap���� �̸��� ���̸� �Է¹޾� 3���� ���� �����Ѵ�.
 * ������ �� ���̰� ���� ���� ����� �̸��� ����ض�. 
 */
public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h =
				new HashMap<String,Integer>();
		
		System.out.println("�̸��� ���� �Է�:");
		for(int i=0; i<3; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			h.put(name, age);
		}
		
		int maxAge = 0;
		String str = "";
		
		Set<String> ageSet = h.keySet();
		Iterator<String> it = ageSet.iterator();
		while(it.hasNext()) {
			String name1 = it.next();
			int age1 = h.get(name1);
			
			if(maxAge < age1) {
				maxAge = age1;
				str = name1;
			}
		}
		System.out.println(str+"�� ���� = "+maxAge);
	}
}
