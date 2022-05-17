import java.io.IOException;

/**
 * 
 * 바이트 스트림  (바이트 단위)
 * 	1) 입력 스트림 -> ~~~InputStream
 * 	2) 출력 스트림 -> ~~~OutputStream
 * 
 * 문자 스트림 (문자 단위)
 * 	1) 입력 스트림 -> ~~~Reader
 * 	2) 출력 스트림 -> ~~~Writer
 * 
 * 
 * 1. 파일 생성(출력)
 * 	Writer(문자단위 파일생성)
 * 	OutputStream(바이트단위 파일 생성)
 * 
 *  * 주인공 vs 장식 *
 * -> Constructors의 매개변수를 보고
 * 	매개변수 안에 InputStream, OutpuStream, Reader, Writer가 보이면 장식,
 * 	(-> 스스로 파일 생성 안됨)
 * 		ex)BufferedOutputStream(OutputStream out)
 * 
 * 	없으면 주인공!(-> 스스로 파일 생성 가능)
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
 *
 */
public class Stream01 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
//		int i;
//		try {
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
