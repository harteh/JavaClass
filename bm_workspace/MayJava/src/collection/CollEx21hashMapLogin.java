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
		//id, pw �˻�

		while(true) {
			System.out.println("id, pw �Է�:");
			String id = sc.next(); 
			String pw = sc.next();

			/*
			 * 1. �Ѵ� ���� ���
			 * 2. id�� �ؽøʿ� ���� ���
			 * 3. id�� �ִµ� ����� Ʋ�� ���
			 */
			if( !h.containsKey(id)) {	//id�� �ؽøʿ� ���� ���
				System.out.println("���� ID �Դϴ�.");
				continue;	// id �ٽ� �Է��ϰ�.
			}
			else {
				if( !h.get(id).equals(pw) ) {	//id�� pw�� �Է��� pw�� ������	
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				else {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
			}
		}
		
		
	}
}
