package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollEx13ArrayList {
	public static void main(String[] args) {
		//String
		ArrayList<String> a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		//for ������ ���ڿ��� �Է¹޾� arraylist�� ����
		for(int i=0; i<3; i++) {
			String str = sc.next();
			a.add(str);
		}
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("***** ���� for�� *****");
		for(String s:a) {
			System.out.println(s);
		}
		
		//���� �� ���ڿ� ���
		int max=0;		//���� �񱳿� �ε��� �ʱⰪ�� 0���� ����
		for(int i=0; i<a.size(); i++) {
			if(a.get(max).length() < a.get(i).length()) {
				max = i;	//���̰� �� �ε����� �����Ѵ�.
			}
		}
		System.out.println("���� �� ���ڿ�: "+a.get(max));
		
		System.out.printf("���� �� ���ڿ��� ��ȣ: %d. ���� �� ���ڿ��� ����: %d", 
				max, a.get(max).length());

	}
}
