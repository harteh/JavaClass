package review;

import java.util.Scanner;

/*
 * 3 this() �ٸ� ������ ȣ��
 * 
class Music {
	String singer;
	String title;
	
	Music(String title, String singer){
		this.singer=singer;
		this.title=title;
	}
	Music(String title){
		this(title, "��ź");
	}
}
public class Review0524A {
	public static void main(String[] args) {
		Music m=new Music("On", "BTS");
		System.out.println(m.title+ " " +m.singer); // On , BTS ���

		Music m1=new Music("Butter");
		System.out.println(m1.title+" " +m1.singer); // Butter, ��ź ���
	}
}
*/

/*
 * 4 

class Cal {
	static int add(int a, int b){
		return (a+b);
	}
	static int div(int a, int b){
		return (a/b);
	}
}
public class Review0524A {
	public static void main(String[] args) {
		int a = Cal.add(10, 5);	//��
		int b = Cal.div(10, 5);	//��
		System.out.println(a +" "+b);
	}
}
*/

/*
 * 5 

public class Review0524A {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {			//i=0, 1, 2, 3
			for (int j = 0; j < 3-i; j++) {		//j=3, 2, 1, 0 (����)
				System.out.print(" ");
			}
			for (int j=0; j<(i*2)+1; j++) {		//j=0
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
*/

/*
 * 6

public class Review0524A {
	public static void main(String[] args) {
		int[][] grade = {{55, 60, 65}, {85, 90, 95}};
		int high;
		
		high= get(grade);
		System.out.println("���� ���� ������ " + high+ "�� �Դϴ�.");
	}

	static int get(int[][] grade) {
		int high=0;
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				if(high < grade[i][j]) {
					high = grade[i][j];
				}
			}
		}
		return high;
	}
}
*/

/*
 * 7
 * ��stop"�� �Է��ϸ� ���α׷��� ������Ѷ�. 
 * (while(true), equals() ���)

public class Review0524A {
	public static void main(String[] args) {
		String eng[] = {"student", "book", "future", "note"};
		String kor[] = {"�л�", "å", "�̷�", "��å"};
		
		Scanner sc = new Scanner(System.in);
		String str=null;
		while(true) {
			System.out.println("����ܾ� �Է�: ");
			str=sc.next();
			if(str.equals("stop")) {
				break;
			}
			
			for(int i=0; i<eng.length; i++) {
				if(str.equals(eng[i])) {
					System.out.println(kor[i]);
				}
			}
		}
	}
}



/*
 * 8
 * ������ ��й�ȣ�� ������ ���� �ʴ´�.
 * ��й�ȣ P�� 000���� 999���� ��ȣ ���� �ϳ��̴�.
 * �־����� ��ȣ K���� 1�� �����ϸ� ��й�ȣ�� Ȯ���� �� �����̴�.
 * ���� ��� ��й�ȣ P�� 123 �̰� �־����� ��ȣ K�� 100 �� ��, 
 * 100���� 123���� 24�� Ȯ���Ͽ� ��й�ȣ�� ���� �� �ִ�.
 * P�� K�� �־����� K���� �����Ͽ� �� �� ���� P�� ���� �� �ִ��� �˾ƺ���.
 * 
 * �Է����� P�� K�� �� ĭ�� ���̷� �־�����.
 * �� �� ���� ��й�ȣ�� ���� �� �ִ��� ����Ѵ�.
 *  
*/

public class Review0524A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();	//��й�ȣ	000~999
		int k = sc.nextInt();	//������ȣ
		int num=0;	//������� ���ߴ°�..
		
		for (int i=k; i<=p; i++) {
			num++;
			if(i == p) {
				System.out.println(num);
			}
		}

	}
}

