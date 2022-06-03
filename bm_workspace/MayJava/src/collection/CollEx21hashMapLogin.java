package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CollEx21hashMapLogin {
	public static void main(String[] args) {

		HashMap h = new HashMap();
		h.put("suin", "123");
		h.put("chongA", "234");
		h.put("seoyoung", "345");
		
		Scanner sc = new Scanner(System.in);
		//id, pw 검색

		while(true) {
			System.out.println("id, pw 입력:");
			String id = sc.next(); 
			String pw = sc.next();

			/*
			 * 1. 둘다 맞을 경우
			 * 2. id가 해시맵에 없을 경우
			 * 3. id는 있는데 비번이 틀릴 경우
			 */
			if( !h.containsKey(id)) {	//id가 해시맵에 없을 경우
				System.out.println("없는 ID 입니다.");
				continue;	// id 다시 입력하게.
			}
			else {
				if( !h.get(id).equals(pw) ) {	//id의 pw과 입력한 pw가 같으면	
					System.out.println("비밀번호가 틀렸습니다.");
				}
				else {
					System.out.println("로그인 되었습니다.");
					break;
				}
			}
		}
		
		
	}
}
