package collection;
/*
 * ���׸� �޼���
 * public <�ڷ��� �Ű�����> ��ȯ�� �޼��� �̸�(�ڷ��� �Ű����� ...){}
 * 
 */

class AA {
	public String toString() {	
		//line 19. ��ü ����� ���ڿ��� �ϱ� ���� �������̵���.
		return "AA";
	}
}
class BB {
	public String toString() {	//�������̵�
		return "BB";
	}
}
class In {
	<T> void show(T t) {	//���׸� �޼���
		System.out.println(t);
	}
	void show() {	//�����ε�
		System.out.println("generic");
	}
}

public class CollEx08generic {
	public static void main(String[] args) {

		AA a = new AA();
		BB b = new BB();
		In i = new In();
		
		i.show();	//generic
		i.<AA>show(a);	//AA t = a;
		i.<BB>show(b);	//BB
		
	}
}
