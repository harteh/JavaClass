package review;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Review0519A {

	public static void main(String[] args) throws IOException {
		
		//1-1.
		//FileOutputStream을 이용하여 byte[] 배열 속에 들어있는 값을 test1.txt에 저장해라
//		byte b[]= {4,6,7,8,-1,24};
//		try {
//			FileOutputStream fos = new FileOutputStream("test1.txt");
//			
//			for(int i=0; i<b.length; i++) {
//				try {
//					fos.write(b[i]);
//				
//				} catch (IOException e) {
//					// 데이터가 없을 때 예외처리
//					e.printStackTrace();
//				}				
//			}
//			try {
//				fos.close();
//				
//			} catch (IOException e) {
//				// 닫히지 않았을 때 예외처리
//				e.printStackTrace();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// 파일이 없을 때 예외처리
//			e.printStackTrace();
//		}
		// -> 파일저장 간단히(예외처리는 throws)
//		byte b[]= {4,6,7,8,-1,24};
//		FileOutputStream fos = new FileOutputStream("test1.txt");
//		fos.write(b);
//		fos.close();
		
		
		
		//1-2.
		//FileInpuStream 을 이용하여 위의 test1.txt파일을 읽어 byte[] 속에 저장하고 화면에 출력하라
//		FileInputStream fis = new FileInputStream("test1.txt");
//		byte a[] =new byte[6];
//		int r, n=0;
//		
//		while((r=fis.read()) != -1) {
//			a[n] = 	(byte)r;
//			n++;
//		}
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		fis.close();
		
		
		//2.
		//복권번호와 추첨한 복권 번화 확인하여 일치하는 번호의 개수를 출력하는 프로그램
		//두 배열은 main한수에 선언, 두 배열에서 일치하는 번호를 찾아 그 개수를 반환
//		int lotto[]= {4,10,25,30,45,47};
//		int my[]= {1,4,7,26,45,48};
//		int r;
//		
//		r=same(lotto, my);
//		System.out.printf("일치하는 번호의 개수: %d\n", r);

		
		
	}//main 끝
	
	//2.
//	static int same(int[] a, int[] b){
//		int r=0;
//		for(int i=0; i<a.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				if(a[i] == b[j]) {
//					r+=1;
//				}
//			}
//		}
//		return r;
//	}
	
		
	

}//클래스 끝
