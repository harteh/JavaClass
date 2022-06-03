package review;

import java.util.Scanner;

/*
 * 3. FileOutputStream을 
 *  이용하여 byte[]배열 속에 들어있는 바이너리 값을 fi.txt파일에 저장해라. 
 *  (byte b[]={1,2,3,4,5}; 로 초기화)
 *
public class Review0602E {
	public static void main(String[] args) throws IOException {
		
		byte b[]= {1,2,3,4,5};

		FileOutputStream out = new FileOutputStream("fi.txt");
		for(int i=0; i<b.length; i++) {
			out.write(b[i]);
		}
		out.close();
		System.out.println("출력완료");
		
		
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
 *  4 Main()을 보고 함수 구현해라. ( 배열 요소합 출력)
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
 * 1. 클래스 Prob1: Rectangle 
 * 필드는 int 형 너비 (width)와 높이 (height)가 있고, 모두private으로 선언하라.
 * 생성자는 구현하지 말고 메소드는 클래스에서 필요한 내용을 판단하여 구현하라.
 * 
 * 2. 메인 메소드에서 너비와 높이 값을 입력받는다. 
 * 입력값이 정수가 아닌 경우 예외처리하고, 유효한 값이 입력될때까지 입력 받는다.
 * 키보드 입력값이 유효한 값인 경우 해당 내용을 갖는 Rectangle 객체를 만들고 
 * 화면에생성한 Rectangle 객체의 면적을 출력하고 프로그램을 종료한다.
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
		System.out.println("넓이: "+ width*height);
	}
}

public class Review0602E {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();

		int width, height;
		while(true) {
			try {
				System.out.println("너비, 높이 입력:");
				width = sc.nextInt();
				height = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.next();	//지우기
				continue;
			}
		}
		
		rec.setWidth(width);
		rec.setHeight(height);
		rec.area();
	}
}

