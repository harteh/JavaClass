package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollEx22hashMapSearch {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		
		h.put("computer", "��ǻ��");
		h.put("coffee", "Ŀ��");
		h.put("cream", "ũ��");
		
		//��� Ű ������ set�� (�������·�)�޾ƿ��ڴ�.
		Set<String> key = h.keySet();

		//key�� �������� ��ȸ�ϸ� ��ü ���
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();	//Key
			String v = h.get(k);	//k�� �´� Value
			
			System.out.println(k+":"+v);
		}
		
		//�ܾ� �˻� ����
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("ã�� ��� �Է�:");
			String str = sc.next();		//�˻��Ϸ��� Ű
			String str2 = h.get(str);	//Ű�� �´� ��

			if(str2 == null) {
				System.out.println(str+"�� ���� �ܾ�");
			}
			else {
				System.out.println(str2);
			}
		}
		
		
	}
}
