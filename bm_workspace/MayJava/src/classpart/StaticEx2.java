package classpart;
/*
 *	�������� = ���ú���
 *	������� = �ν��Ͻ�����
 *	static ���� = Ŭ���� ���� 
 *
 *  Ŭ���� �޼���(static) ���ο��� ���������� Ŭ���������� ��� ����.
 *  ������ �ν��Ͻ� ������ ����� �� ����.!!!
 *  
 *  : static �ȿ����� static�� ��밡��..
 *  
 *  Ŭ���� �޼���(static) ���ο����� this�� �����Ѵ�.
 *  -> ��ü ���̵� ������ �� �ֱ� ������
 */
/*
 * �̱��� ���� �����
 * 1. �����ڸ� private���� �����
 * 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����Ѵ�.
 * 3. �ٿܺο��� ������ �� �ִ� public �޼��� ������
 * 4. ������ ����ϴ� �ڵ� �����
 */
/* 
 * p.192
 * static ����� Ŭ������ �ϳ��� �����ȴ�.	->��ü�� ���涧 �Բ� ����� �Բ� ��������.
 * ������ Ŭ������ ��� ��ü���� �����Ѵ�.
 * 
 * �ν��Ͻ� ������ �� ��ü���� ������ �����.	->���α׷�����, Ŭ�����ε� �� ����
 * 
 */

class Cal {
	static int max(int a, int b){
		int result = (a > b) ? a : b;
		return result; 
	}
	static int min(int a, int b){
		int result = (a > b) ? b : a;
		return result; 
	}
}

public class StaticEx2 {
	public static void main(String[] args) {

		System.out.println(Cal.max(10, 7));
		System.out.println(Cal.min(4, -2));
		
	}
}
