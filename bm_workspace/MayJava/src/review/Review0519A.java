package review;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Review0519A {

	public static void main(String[] args) throws IOException {
		
		//1-1.
		//FileOutputStream�� �̿��Ͽ� byte[] �迭 �ӿ� ����ִ� ���� test1.txt�� �����ض�
//		byte b[]= {4,6,7,8,-1,24};
//		try {
//			FileOutputStream fos = new FileOutputStream("test1.txt");
//			
//			for(int i=0; i<b.length; i++) {
//				try {
//					fos.write(b[i]);
//				
//				} catch (IOException e) {
//					// �����Ͱ� ���� �� ����ó��
//					e.printStackTrace();
//				}				
//			}
//			try {
//				fos.close();
//				
//			} catch (IOException e) {
//				// ������ �ʾ��� �� ����ó��
//				e.printStackTrace();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// ������ ���� �� ����ó��
//			e.printStackTrace();
//		}
		// -> �������� ������(����ó���� throws)
//		byte b[]= {4,6,7,8,-1,24};
//		FileOutputStream fos = new FileOutputStream("test1.txt");
//		fos.write(b);
//		fos.close();
		
		
		
		//1-2.
		//FileInpuStream �� �̿��Ͽ� ���� test1.txt������ �о� byte[] �ӿ� �����ϰ� ȭ�鿡 ����϶�
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
		//���ǹ�ȣ�� ��÷�� ���� ��ȭ Ȯ���Ͽ� ��ġ�ϴ� ��ȣ�� ������ ����ϴ� ���α׷�
		//�� �迭�� main�Ѽ��� ����, �� �迭���� ��ġ�ϴ� ��ȣ�� ã�� �� ������ ��ȯ
//		int lotto[]= {4,10,25,30,45,47};
//		int my[]= {1,4,7,26,45,48};
//		int r;
//		
//		r=same(lotto, my);
//		System.out.printf("��ġ�ϴ� ��ȣ�� ����: %d\n", r);

		
		
	}//main ��
	
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
	
		
	

}//Ŭ���� ��
