package arraypart;

import java.util.Scanner;

/*
 * ��ü�� ���ҷ� �ϴ� �迭�� ���� �� �ִ�.
 * 
 * ��ü�迭 : ��ü�� ���� ���۷����� ���ҷ� ���� �迭
 * Book b[];	// Book�迭�� ���� ���۷��� ���� b ����
 * b = new Book[5];	//���۷��� �迭 ����
 * 
 */

/*
 * ��ü�迭 ����
class Circle{
	int r;
	Circle(int r){
		this.r=r;
	}
	double getarea() {
		return r*r*3.14;
	}
}
public class Array05 {
	public static void main(String[] args) {

		Circle []ary = new Circle[4];
		//��ü �迭: �������� ��ü�� �迭���·� ������
		
		for(int i=0; i<ary.length; i++) {
			ary[i] = new Circle(i);
			//��ü 4���� �����ؼ� �迭 ��ġ�� ����
			//i = ������
			System.out.println(ary[i].getarea());
		}
	}
}
*/

/*
 * ���� �Է¹޾� ��ü�迭�� ��� ����ϱ�
 */
class Song {
	String singer;
	String title;
	
	Song(String singer, String title){
		this.singer = singer;
		this.title = title;
	}
}
public class Array05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Song so[] = new Song[2];	//��ü�迭 ����
		
		//������ ���� �Է¹ޱ�
		for (int i = 0; i < so.length; i++) {
			System.out.println("����: ");
			String singer = s.next();
			System.out.println("����: ");
			String title = s.next();
			
			so[i] = new Song(singer, title);	//��ü ����
		}
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i].singer+", "+so[i].title);
		}
	}
}
