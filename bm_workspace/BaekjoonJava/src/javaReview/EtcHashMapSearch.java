package javaReview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * HashMap �� �����.
 * HashMap�� ������ �߰��Ѵ�.
 * 
 ** ��� 
 * ��� Ű ������ (�������·�) �޾ƿ´�
 * Ű�� �������� ��ȸ�ϸ� ��ü�� ����Ѵ�.
 * 
 ** �ܾ�˻�
 * �ݺ����� �̿��ؼ� �˻� ����
 * �˻��� �Է¹ޱ�
 * �˻���(Ű) �� �ش��ϴ� ��(Value)�� �޾ƿ� �����Ѵ�
 * 
 * ���� ������ "���� �ܾ�"�� ����ϰ�
 * ������ ���� ����Ѵ�.
 */
public class EtcHashMapSearch {
	public static void main(String[] args) {

		HashMap<String, String> h =
				new HashMap<String, String>();
		h.put("Ŀ��", "coffee");
		h.put("ȫ��", "(black)tea");
		h.put("����", "beer");
		
		//��� ���
		System.out.println("�˻������� �ܾ� ���:");
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.print(k+" ");
		}
		System.out.println();
		
		//�ܾ�˻�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("'����'�� �Է��ϸ� ����ϴ�.");
			System.out.println("ã�� �ܾ� �Է�:");
			String sch = sc.next();
			String result = h.get(sch);
			
			if(result == null) {
				if(sch.equals("����")) {
					break;
				}
				System.out.println("���� �ܾ� �Դϴ�.");
			}
			else {
				System.out.println(sch+" = "+result);
			}
			
		}
		
	}
}
