package review;

/*
 * 1. ������) ��ȭ�� ����մϴ�.��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�.
              	������ ����մϴ�. ������ ����մϴ�. ������ ����մϴ�.
				(th2�� ���� ���ü��� ����, ������ ���)
 */
public class Review0608A {
	public static void main(String[] args) {

		   Thread th1=new MovieThread();
		   th1.start();
		   Thread th2=new Thread(new MusicThread());
		   th2.start();
	}
}
