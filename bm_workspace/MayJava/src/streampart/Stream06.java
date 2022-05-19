package streampart;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Stream06 {

	public static void main(String[] args) throws IOException {
		
		// 1,2,3,4,5를 읽어와서 outputstream에 저장하고 싶다.
//		byte[] in= {1,2,3,4,5};
//		byte[] out= null;
//		
//		ByteArrayInputStream input = null;
//		ByteArrayOutputStream output = null;
//		
//		output = new ByteArrayOutputStream();
//		input = new ByteArrayInputStream(in);
//		// 바이트 배열 in을 바이트단위 입력스트림에 저장한다. -> 읽어온다
//		
//		int r=0;
//		while((r=input.read()) != -1) {
//			output.write(r);	//출력하기 위한 output 스트림에 읽어온 데이터를 저장
//		}
//		out = output.toByteArray();
//		//바이트 스트림을 바이트 배열로 바꿔서 out(바이트 배열)
//		
//		
//		System.out.println(Arrays.toString(in));
//		System.out.println(Arrays.toString(out));

		
		
		//p.546 DataInputStream 과 DataOutputStream

		//파일 생성
//		DataOutputStream out = null; //기본자료형 값을 저장할 수 있다.
//		try {
//			int a=5;
//			double b =1.5;
//			boolean c=true;
//			
//			FileOutputStream fi=new FileOutputStream("h.txt");	//h.txt 파일 생성
//			
//			out = new DataOutputStream(fi);
//			out.writeInt(a);
//			out.writeDouble(b);
//			out.writeBoolean(c);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		out.close();
		
		
		//파일 읽어오기
		DataInputStream in = null;
		try {
			FileInputStream fi=new FileInputStream("h.txt");
			in=new DataInputStream(fi);
			
			int a=in.readInt();
			double b=in.readDouble();
			boolean c=in.readBoolean();
			
			//파일에 저장한 기본자료형 값을 읽어와서 출력
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		in.close();
		
		

	}

}
