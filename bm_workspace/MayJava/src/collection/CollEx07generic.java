package collection;

/*
 * ���׸�(������) -> ���ø�(������)
 * generic <> angle blanket
 * 
 * �÷��� �����ӿ�ũ(Vector, ArrayList, Map, Set)
 * 
 * � ������ Ÿ���̵� ����� �� �ֵ���, 
 * �޼��峪 Ŭ������ ������ ������ �� �ִ�. �Ϲ�ȭ �۾�
 * 
 * �ϳ��� ������ �������� ���� ���� �� �ֵ��� �ϴ� ���.
 * 
 */

class Java {
	String title;
	Java(String t) { title = t; }
	void show() { System.out.println(title); }
}
class DB {
	int n;
	DB(int n) { this.n = n;	}
	void pr() { System.out.println(n); }
}

class Program<T> {	//������ <> : ���׸� ��ȣ
	
	T t;	//T:Ŭ���� �� t:��������  (Java, DB �� �� �� �ִ�..)
	void in(T t) {
		this.t = t;	//�ʱ�ȭ
	}
	
	T get() {
		return t;
	}
}

public class CollEx07generic {
	public static void main(String[] args) {
		
		//T ��üȭ
		Program <Java> p =
				new Program<Java>();
		p.in(new Java("�ڹ��Դϴ�."));	//Java p = new Java("java");
		
		Java j = p.get();
		j.show();
		
		//
		Program <DB> d = 
				new Program<>();
		d.in(new DB(30));
		DB db = d.get();
		db.pr();
		
	}
}
