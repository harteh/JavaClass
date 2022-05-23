package inheritance;
/*
 * 1.	�������迭
class Score {
	int sum = 0;
	int cnt=0;
	void show(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			cnt += a[i].length;
		}
		System.out.println("��� :" + ((double)sum/cnt));
	}

}

public class InherEx4 {
	public static void main(String[] args) {
		int [][] grade= 
			{
				{90,100,80},
				{70,95,87},
				{80,90,70},
				{90,100,100}
			};
		Score s = new Score();
		s.show(grade);	//�������迭�� ��� ���
	}
}
*/
/*
 * 2	final 
class Car {
	public int gas;	//�ʵ�
	public void up() {
		gas+=1;
		System.out.println("gas: "+gas);
	}
	public final void stop() {
		//final �޼���� �ڽ� Ŭ�������� �������̵�(������) �� �� ����.
		System.out.println("stop");
		gas=0;
	}
}
class SportsCar extends Car {
	public void up() {	//������ -> �������̵�!
		gas+=100;
		System.out.println("gas: "+gas);
	}
}

public class InherEx4 {
	public static void main(String[] args) {
		Car c = new Car();
		c.gas=0;
		c.stop();
		c.up();
		
		SportsCar s = new SportsCar();
		s.up();
		s.stop();
	}
}
*/
/*
 * 3 	�������迭
public class InherEx4 {
	public static void main(String[] args) {
		int[][] arr= new int[3][4];
		int n=0;
		for (int i = 0; i < arr.length; i++) {
			n=i;	//���� ù��° ���� ����
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
*/
public class InherEx4 {
	public static void main(String[] args) {
		int[][] arr= new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+j;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
