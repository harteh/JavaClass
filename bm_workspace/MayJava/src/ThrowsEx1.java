import java.util.Scanner;

/*
 * ���� ó�� �̷��
 * - ���� ó���� �ش� �޼��忡�� ó������ �ʰ�, 
 * 	�޼��带 ȣ���Ͽ� ����ϴ� �κп��� ���ܸ� ó���Ѵ�.
 *
 * 
 */

/*
 * 1. ����� ���� ���� p.506
 
class Num extends Exception {
	Num(){
		super("�߸��� ��!!");	//Exception(String message) �����ڸ� ȣ����
	}
}

public class ThrowsEx1 {
	
	static int in() throws Num {	//���ܹ߻��ϸ� catch �κп��� �޴´�.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<0) {
			Num num = new Num();	//������ ȣ��
			throw num;
			//��ü�� ������ Num Ŭ�������� ó���϶�.
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("��� �Է�: ");
		try {
			int n = in();	//���� �Է��ϴ� �Լ�
			System.out.println("�Է��� ��:"+n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
*/

/*
 * p.509
 */
public class ThrowsEx1 {
	public static void main(String[] args) {
		
	}
}
