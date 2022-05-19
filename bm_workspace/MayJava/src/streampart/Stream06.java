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
		
		// 1,2,3,4,5�� �о�ͼ� outputstream�� �����ϰ� �ʹ�.
//		byte[] in= {1,2,3,4,5};
//		byte[] out= null;
//		
//		ByteArrayInputStream input = null;
//		ByteArrayOutputStream output = null;
//		
//		output = new ByteArrayOutputStream();
//		input = new ByteArrayInputStream(in);
//		// ����Ʈ �迭 in�� ����Ʈ���� �Է½�Ʈ���� �����Ѵ�. -> �о�´�
//		
//		int r=0;
//		while((r=input.read()) != -1) {
//			output.write(r);	//����ϱ� ���� output ��Ʈ���� �о�� �����͸� ����
//		}
//		out = output.toByteArray();
//		//����Ʈ ��Ʈ���� ����Ʈ �迭�� �ٲ㼭 out(����Ʈ �迭)
//		
//		
//		System.out.println(Arrays.toString(in));
//		System.out.println(Arrays.toString(out));

		
		
		//p.546 DataInputStream �� DataOutputStream

		//���� ����
//		DataOutputStream out = null; //�⺻�ڷ��� ���� ������ �� �ִ�.
//		try {
//			int a=5;
//			double b =1.5;
//			boolean c=true;
//			
//			FileOutputStream fi=new FileOutputStream("h.txt");	//h.txt ���� ����
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
		
		
		//���� �о����
		DataInputStream in = null;
		try {
			FileInputStream fi=new FileInputStream("h.txt");
			in=new DataInputStream(fi);
			
			int a=in.readInt();
			double b=in.readDouble();
			boolean c=in.readBoolean();
			
			//���Ͽ� ������ �⺻�ڷ��� ���� �о�ͼ� ���
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		in.close();
		
		

	}

}
