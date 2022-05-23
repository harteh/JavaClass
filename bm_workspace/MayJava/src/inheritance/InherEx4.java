package inheritance;
/*
 * 1.	이차원배열
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
		System.out.println("평균 :" + ((double)sum/cnt));
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
		s.show(grade);	//이차원배열의 평균 출력
	}
}
*/
/*
 * 2	final 
class Car {
	public int gas;	//필드
	public void up() {
		gas+=1;
		System.out.println("gas: "+gas);
	}
	public final void stop() {
		//final 메서드는 자식 클래스에서 오버라이드(재정의) 할 수 없다.
		System.out.println("stop");
		gas=0;
	}
}
class SportsCar extends Car {
	public void up() {	//재정의 -> 오버라이딩!
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
 * 3 	이차원배열
public class InherEx4 {
	public static void main(String[] args) {
		int[][] arr= new int[3][4];
		int n=0;
		for (int i = 0; i < arr.length; i++) {
			n=i;	//행의 첫번째 값에 들어갈거
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
