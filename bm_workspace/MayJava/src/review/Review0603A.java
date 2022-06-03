package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 3 main() Prob1: main()에서 인원수를 입력받아 
 * 인원수를 Profile에대한 객체배열 개수로 설정한다. 
 * 이름과 아이디도 입력받아 객체배열에 저장한 후 출력해라
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
		System.out.println("인원수 입력:");
		int num = sc.nextInt();
		
		Profile0603[] pro = new Profile0603[num];
		for(int i=0; i<pro.length; i++) {
			System.out.println("이름과 아이디 입력:");
			String name = sc.next();
			String id = sc.next();
			
			pro[i] = new Profile0603(name, id);	//객체 생성
		}
		for(Profile0603 p:pro) {
			System.out.println( p.getname()+", "+p.getid() );
		}
	}
}
*/
/*
 * 4. ArrayList에 0~100사이의 임의의 정수 10개를 삽입하고 모두출력해라. 
 * 	출력할때는 Iterator인터페이스를 사용해서 출력해라.
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
 * 5. Map 만들어 이름, 나이 저장해서 이름과 일치하는 나이출력해라.
 *
public class Review0603A {
	public static void main(String[] args) {
		HashMap<String, Integer> h =
				new HashMap<String, Integer>();
		h.put("세종", 35);
		h.put("정조", 22);
		h.put("세조", 47);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("검색할 이름을 입력:");
			String name = sc.next();
			
			if(!h.containsKey(name)) {
				System.out.println("없는 이름입니다.");
				continue;
			}
			else {
				System.out.println(name+"의 나이="+h.get(name));
				break;
			}
		}
	}
}
*/
/*
 * 6. HashMap으로 이름과 나이를 입력받아 3명의 값을 저장한다.
 * 저장한 후 나이가 가장 많은 사람의 이름을 출력해라. 
 *
public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> h =
				new HashMap<Integer, String>();
		
		System.out.println("나이와 이름 입력:");
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
 * 6-1. HashMap으로 이름과 나이를 입력받아 3명의 값을 저장한다.
 * 저장한 후 나이가 가장 많은 사람의 이름을 출력해라. 
 */
public class Review0603A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h =
				new HashMap<String,Integer>();
		
		System.out.println("이름과 나이 입력:");
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
		System.out.println(str+"의 나이 = "+maxAge);
	}
}
