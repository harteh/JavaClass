package stringex;

import java.util.StringTokenizer;

public class StrEx01token {
	public static void main(String[] args) {

		String str="id=123#name=gildong#addr=seoul";
		//#�� �������� ���ڿ� ������
		
		StringTokenizer s = new StringTokenizer(str, "#");
		int n = s.countTokens();	//�����ڷ� ���� ����
		System.out.println(n);
		
		while(s.hasMoreTokens()) {
			String a = s.nextToken();
			System.out.println(a);
		}
		
//		String arr[] = str.split("#");
//		for (String s1 : arr) {
//			System.out.println(s1 +"");
//		}
		
	}
}
