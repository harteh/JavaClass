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

class PasswordException extends Exception {
	PasswordException(String message){
		super("�����Դϴ�.");
	}
}

public class ThrowsEx1 {
	
	private String userPass;
	
	public String getUserPass() {
		return userPass;
	}
	
	void setUserPass(String userPass) throws PasswordException {
		if(userPass == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(userPass.length() < 5 ) {
			throw new PasswordException("��й�ȣ�� 5�� �̻��Դϴ�.");
		}
		else if(userPass.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڸ� �����ؾ� �մϴ�.");
		}
		
		this.userPass = userPass;
		
	}
	
	
	public static void main(String[] args) {
		
		ThrowsEx1 te = new ThrowsEx1();

		String userPass = null;
		try {
			te.setUserPass(userPass);
			System.out.println("��������");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPass = "abcd";
		try {
			te.setUserPass(userPass);
			System.out.println("��������");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPass = "abcde";
		try {
			te.setUserPass(userPass);
			System.out.println("��������");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
