package collection;

class St<T> {
	int n;
	Object[] st;	//�迭, ��ȯ���� Object
	
	St(){
		st = new Object[3];		//�����ڿ��� ��ü(�迭)����
		n=0;
	}
	
	public void push(T item) {
		if(n==3)	//������ ���� ���ִ�. ���̻� ��Ҹ� ���� �Ұ�
			return;	//push �Լ� ����
		
		st[n] = item;	//item�� �迭�� �߰�
		n++;			//�ε��� ����
	}
	
	//���ÿ��� ������
	public T pop() {
		if(n==0)	//������ ����־� ���� �� ����.
			return null;	//��ȯ���� T �̱� ������ null
							//null : ���۷��� Ÿ���� ������ ��밡���ϴ�.
		n--;	//�ε����� �ϳ��� �پ��鼭
		return (T)st[n];	//�迭 ��ü�� ��ȯ�޴´�.
				//st[] �� Object�̹Ƿ� T ������ �ٿ�ĳ���� �ؾ��Ѵ�.
	}
}

public class CollEx15genericStack {
	public static void main(String[] args) {
		
		St<String> s = new St<String>();
		s.push("java");
		s.push("db");
		s.push("C++");
		
		for(int i=0; i<3; i++) {
			System.out.println( s.pop() );
		}
		
		System.out.println("***** Integer *****");
		//Integer�� ��üȭ���� �����ؼ� ���
		St<Integer> s1 = new St<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		for(int i=0; i<3; i++) {
			System.out.println( s1.pop() );
		}
		
		
	}
}
