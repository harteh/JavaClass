package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx16Iterator {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(8);
		a.add(0);

		Iterator<Integer> it = a.iterator();	//Iterator ��ȯ
		
		while(it.hasNext()) {
			int n = it.next();	//���� �����͸� n�� ����
			System.out.println(n);
		}
	}
}
