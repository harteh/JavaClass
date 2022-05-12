import java.util.Scanner;

/**
 * ���ڿ�
 * 
 * split(String regex)
 * - split �޼ҵ�� ���ڿ��� Ư�� �����ڷ� �и��ϴ� �޼ҵ��̴�.
 * - Splits this string around matches of the given regular expression.
 * 
 * substring(int beginIndex, int endIndex)
 * - substring�� ���ڿ� �� Ư�� �κ��� �̾Ƴ� ��쿡 ����Ѵ�
 * - Returns a string that is a substring of this string.
 * 
 * replace(char oldChar, char newChar)
 * - ���ڿ� ��ü
 * - Returns a string resulting from replacing all occurrences of oldChar 
 *   in this string with newChar.
 * 
 * concat(String str)
 * - ���ڿ� ����
 * - Concatenates the specified string to the end of this string. 
 * 
 * length()
 * - ���ڿ� ����
 * - Returns the length of this string.
 * 
 * compareTo(String anotherString)
 * - �� ���ڿ��� ��
 * - Compares two strings lexicographically.
 *
 */
public class String01 {

	public static void main(String[] args) {

		String str = "������ �����, �����ϰ� Ƽ��!!";
		
		System.out.println("****** split ******");
		String a[] = str.split(",");	// , �� �������� ���ڿ��� �߶� �迭a�� �����Ѵ�.
		System.out.println(a[0]);	//������
		
		for(String b : a) {
			System.out.println(b);
		}
		
		System.out.println("****** substring ******");
		String c=str.substring(4,7);	//�ε��� 4���� 6���� ���
		System.out.println(c);	//�����
		
		System.out.println("****** replace ******");
		String b=str.replace("����", "study");
		System.out.println(b);
		
		System.out.println("****** concat ******");
		String str1 = str.concat("������ �ݿ���");	//���ڿ� ����
		System.out.println(str1);
		
		
		System.out.println("****** .length() ******");
		
		Scanner sc = new Scanner(System.in);
//		String d = sc.next();
//		String e = sc.next();
//		
//		if(d.length() < e.length()) {
//			System.out.println(e);
//		} else {
//			System.out.println(d);
//		}
		
		
		System.out.println("****** compareTo ******");
		String f = "c apple";
		String g = "banana";
		
		if (f.compareTo(g) > 0) {		// f>g : f�� g���� (������)���߿� ����
			System.out.println(f);
		} else if (f.compareTo(g) < 0) {// g�� f���� (������)���߿� ����
			System.out.println(g);
		} else { //0�̸� ���� ���ڿ�
			System.out.println("���� ���ڿ�");
		}
		
		
		
		
	}

}
