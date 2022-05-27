package collection;

class Tt1 extends Thread {
	//��ü�� �迭
	Share s;
	String []str;
	
	Tt1(Share s, String[] str){
		this.s=s;
		this.str=str;
	}
	
	public void run() {
		for(int i=0; i<str.length; i++) {
			s.pr(str[i]);
		}
	}
}

class Share {
	synchronized void pr(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}

public class CollEx06thread {
	public static void main(String[] args) {

		Share s = new Share();
		
		String eng[] = {"java", "study", "db", "spring", "jsp"};
		String kor[] = {"�ڹ�","����","�����ͺ��̽�","������","���̿�����"};
		
		Tt1 t1 = new Tt1(s, eng);
		Thread t2 = new Tt1(s, kor);	//��ĳ����
		
		t1.start();
		t2.start();
	}
}
