package totalQuestion0606;

/*
 * 11.	Boolean �� false�� ��false����� ���ڿ��� ��ȯ�ض�.
 * 12.  ���ڿ� ��36.5���� double Ÿ�� �Ǽ��� ��ȯ�ض�.
 * 13.  ���ڿ� ��35���� ���� 35�� ��ȯ�ض�.
 */
public class Q11to13 {
	public static void main(String[] args) {
		// 11
		Boolean b1 = false;
		String str = b1.toString();
		System.out.println(str + str);	//falsefalse

		// 12
		String str1 = "36.5";
		Double d1 = Double.parseDouble(str1);
		System.out.println(str1 + str1);	//36.536.5
		System.out.println(d1 + d1);		//73.0
		
		// 13
		String str2 = "36";
		Integer i1 = Integer.parseInt(str2);
		System.out.println(i1 + i1);		//72
	}
}
