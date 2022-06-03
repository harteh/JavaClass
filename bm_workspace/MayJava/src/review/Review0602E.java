package review;

import java.util.Scanner;

/*
 * 3. FileOutputStream�� 
 *  �̿��Ͽ� byte[]�迭 �ӿ� ����ִ� ���̳ʸ� ���� fi.txt���Ͽ� �����ض�. 
 *  (byte b[]={1,2,3,4,5}; �� �ʱ�ȭ)
 *
public class Review0602E {
	public static void main(String[] args) throws IOException {
		
		byte b[]= {1,2,3,4,5};

		FileOutputStream out = new FileOutputStream("fi.txt");
		for(int i=0; i<b.length; i++) {
			out.write(b[i]);
		}
		out.close();
		System.out.println("��¿Ϸ�");
		
		
		FileInputStream in = new FileInputStream("fi.txt");
		int n=0, r;
		
		while((r=in.read()) != -1) {
			b[n] = (byte) r;
			n++;
		}
		for (int i = 0; i < b.length; i++) {
	        System.out.println(b[i]+" ");
	    }
	    in.close();
		
	}
}
*/

/*
 *  4 Main()�� ���� �Լ� �����ض�. ( �迭 ����� ���)
 *
public class Review0602E {
	
	static int add(int[] arr, int b){
		int sum = 0;
		for(int i=0; i<b; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		 int [] arr={1,2,3,4,5};
		 int r;
		 r=add(arr, arr.length);
		 System.out.println(r);
	}
}
*/
/*
 * 1. Ŭ���� Prob1: Rectangle 
 * �ʵ�� int �� �ʺ� (width)�� ���� (height)�� �ְ�, ���private���� �����϶�.
 * �����ڴ� �������� ���� �޼ҵ�� Ŭ�������� �ʿ��� ������ �Ǵ��Ͽ� �����϶�.
 * 
 * 2. ���� �޼ҵ忡�� �ʺ�� ���� ���� �Է¹޴´�. 
 * �Է°��� ������ �ƴ� ��� ����ó���ϰ�, ��ȿ�� ���� �Էµɶ����� �Է� �޴´�.
 * Ű���� �Է°��� ��ȿ�� ���� ��� �ش� ������ ���� Rectangle ��ü�� ����� 
 * ȭ�鿡������ Rectangle ��ü�� ������ ����ϰ� ���α׷��� �����Ѵ�.
 * 
 */
class Rectangle {
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
	void area() {
		System.out.println("����: "+ width*height);
	}
}

public class Review0602E {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();

		int width, height;
		while(true) {
			try {
				System.out.println("�ʺ�, ���� �Է�:");
				width = sc.nextInt();
				height = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.next();	//�����
				continue;
			}
		}
		
		rec.setWidth(width);
		rec.setHeight(height);
		rec.area();
	}
}

