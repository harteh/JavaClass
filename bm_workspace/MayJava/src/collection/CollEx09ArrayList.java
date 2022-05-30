package collection;

import java.util.ArrayList;

/*
 * 컬렉션은 가변크기의 컨테이너이다. 데이터 삽입, 삭제 시 편리하다.
 * 배열은 고정크기로 삽입삭제가 불편하다.
 * 
 ** 컬렉션 : 제네릭 기법으로 구현
 *	→ 컬렉션이 다룰 수 있는 원소의 타입을 여러 종류로 변신할 수 있도록 
 *	일반화 시키기 위해 컬렉션을 생성하고 사용할 때는 오직 한 타입 값만 저장 가능
 * 컬렉션의 요소는 객체들만 가능하다
 * int, double, char 등 기본타입의 데이터를 컬렉션의 요소로 불가능하다.
 * 
 ** ArrayList : 객체 배열을 쉽게 사용하기 위해 제공되는 객체배열클래스
 *
 */
/*
 * 1. ArrayList

public class CollEx09ArrayList {
	public static void main(String[] args) {

		//List Interface => < >
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("세종");
		a.add("정조");
		a.add("정종");
		
		for(int i=0; i<a.size(); i++) {
			String b = a.get(i);			
			System.out.print(b+ " ");
		}
	}
}
*/
/*
* 2. ArrayList
*/
class Profile {
	String id;
	int age;
	
	Profile(String i, int a){
		id=i;	age=a;
	}
}
public class CollEx09ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Profile> a = new ArrayList<Profile>();
		
		a.add(new Profile("aa", 15));
		a.add(new Profile("bb", 25));
		a.add(new Profile("cc", 35));
		
		//배열에 추가된 요소만큼 출력
		for(int i=0; i<a.size(); i++) {
			Profile p = a.get(i);
			System.out.println( p.age+" "+p.id);
		}
		
		System.out.println("== 향상된 for문 사용 ==");
		for(Profile f:a) {
			System.out.println( f.age+" "+f.id);
		}
	}
}
