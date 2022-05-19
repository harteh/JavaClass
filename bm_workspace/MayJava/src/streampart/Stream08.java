package streampart;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream08 {

	public static void main(String[] args) throws IOException {
		
		// ���ϻ��� - FileWriter
//		FileWriter f=new FileWriter("system.dat");
//		BufferedWriter b=new BufferedWriter(f);
//		
//		char a[]=new char[] {'��', '��', '��'};
//		
//		b.write(a);
//		b.close();

		// ���Ͽ� ������ �����ؼ� �����ϱ� - FileOutputStream
//		byte[] b= {7,38,36,29,64};
//		
//		FileOutputStream f=new FileOutputStream("test.txt");	//����� ������ �����Ѵ�
//		
//		for(int i=0; i<b.length; i++) {
//			f.write(b[i]);	//���Ͽ� b�迭 �����͸� �����Ѵ�. 
//		}
//		f.close();
//		System.out.println("������ ������-���α׷� ����");
		
		
		System.out.println("****************************************");
		
		// ���� �ҷ��ͼ� �����ֱ� - FileInputStream
//		byte[] b=new byte[5];	
//		//�� �迭�� ����
//		//�о�� �������� ũ�⸦ �𸦶� BufferedReader ���??
//		
//		try {
//			FileInputStream in=new FileInputStream("test.txt");	//�о�� ������ �����Ѵ�.
//			int n=0, r;
//			
//			while ((r=in.read()) != -1) {
//				b[n] = (byte)r;	//���� ����Ʈ�� �迭�� ����
//				n++;
//			}
//			for (int i = 0; i < b.length; i++) {
//				System.out.println(b[i]+" ");
//			}
//			in.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		// ����Ǿ� �ִ� ���� �ҷ��ͼ� �����ֱ�(���) - FileReader
//		char arr[]=new char[10];
//		int r;
//
//		try {
//		    FileReader in = new FileReader("c.txt");
//		    //���Ͽ� ������ ���ڸ� �о�鿩��
//		    try {
//		        r = in.read(arr, 0, arr.length);
//		        //�迭�� 0���� ���̸�ŭ �о�ͼ� r �� �����Ѵ�.
//
//		        for(int i=0; i<r; i++) {
//		            System.out.println(arr[i]);
//		        }
//
//		    } catch (IOException e) {
//		        // TODO Auto-generated catch block
//		        e.printStackTrace();
//		    }
//
//		} catch (Exception e) {
//		    // ������ ���� �� ����ó��
//		    e.printStackTrace();
//		}
		
		
		// ���� �ҷ��ͼ� ����ϱ� - BufferedReader
		try {
		    BufferedReader in=new BufferedReader(new FileReader("c.txt"));

		    String str;

		    while(true) {
		        try {
		            str=in.readLine();

		            if(str==null) {
		                break;	//���ѷ��� ������
		            }
		            System.out.println(str); //���� �����͸� �о�ͼ� ���

		        } catch (IOException e) { //���Ͽ� �����Ͱ� ���� �� ����
		            e.printStackTrace();
		        }
		    }

		    try {	
		        in.close();

		    } catch (IOException e) { //������ ������ �ʾ��� �� ����
		        e.printStackTrace();
		    }

		} catch (FileNotFoundException e) {	//�о�� ������ ���� �� ����
		    e.printStackTrace();
		}
		
		
		
	}

}
