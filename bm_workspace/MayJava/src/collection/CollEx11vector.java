package collection;

import java.util.Vector;

public class CollEx11vector {
	public static void main(String[] args) {
		// List
		Vector<Integer> v = 
				new Vector<Integer>();
		
		//���� 5���� ��ü���·� �ֱ�
		v.add(new Integer(5));
		v.add(5);	//����ڽ��̿��� new Integer(5) �� �������� �ʾƵ� �ȴ�.
		v.add(10);
		v.add(0, 20);	//�ε��� 0�� 20�� �ְڴ�.
		
		System.out.println("���� ����:"+v.size());
		
		for(int i=0; i<v.size(); i++) {
			int v2 = v.get(i);	//���Ϳ��� ���� ��
			System.out.println(v2);
		}

	}
}
