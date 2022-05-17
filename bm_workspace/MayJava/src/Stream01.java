import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 바이트 스트림  (바이트 단위)
 * 	1) 입력 스트림 -> ~~~InputStream
 * 	2) 출력 스트림 -> ~~~OutputStream
 * 
 * 문자 스트림 (문자 단위)
 * 	1) 입력 스트림 -> ~~~Reader
 * 	2) 출력 스트림 -> ~~~Writer
 */

 /** 
 * 1. 파일 생성(출력)
 * 	Writer(문자단위 파일생성)
 * 	OutputStream(바이트단위 파일 생성)
 * 
 *  * 주인공 vs 장식 *
 * -> Constructors의 매개변수를 보고
 * 	매개변수 안에 InputStream, OutpuStream, Reader, Writer가 보이면 장식(보조스트림),
 * 	(-> 스스로 파일 생성 안됨)
 * 		ex)BufferedOutputStream(OutputStream out)
 * 
 * 	없으면 주인공!(-> 스스로 파일 생성 가능)(기반스트림)
 * 		ex)FileOutputStream(File file)
 * 
 * 2. 파일에다 값 저장
 * 	write 메소드
 * 
 * 3. 파일 읽어들임
 * 	Reader(문자단위로 읽어들임)
 * 	InputStream(바이트단위로 읽어들임)
 * 
 * 4. 파일 닫기
 * 	close()
 */

/**
 * Writer 메소드
 * -> 문자 단위로 출력하는 스트림 중 최상위 스트림
 * 
 *
 */
public class Stream01 {

	public static void main(String[] args) {
		
		//System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
//		int i;
//		try {
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
//		int i;
//		try {
//			while( (i = System.in.read()) != '\n' ) {
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//a.txt 파일 생성
//		char a='S';		//S 가 아스키코드로 변환되어 int 값으로 저장된다.
//		char b='W';
//		
//		try {
//			FileWriter out = new FileWriter("a.txt");
//			//단독으로 파일 생성 가능하다 -> FileWriter는 기반 스트림이기 때문에.
//			out.write(a);
//			out.write(b);
//			out.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		
		//저장된 SW를 읽어오고 싶다.
		char arr[]=new char[10];
		int r;
		
		try {
			FileReader in = new FileReader("a.txt");
			//파일에 저장한 문자를 읽어들여서
			try {
				r = in.read(arr, 0, arr.length);
				//배열의 0부터 길이만큼 읽어와서 r 에 저장한다.
				
				for(int i=0; i<r; i++) {
					System.out.println(arr[i]);
				}
				
			} catch (IOException e) {
				// 읽어온 데이터가 없을 때
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// 파일이 없을 때 예외처리
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
