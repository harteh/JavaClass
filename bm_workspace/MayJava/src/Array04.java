import java.util.Scanner;

/**
 * �������迭
 * - ����� for������ i(��), j(��)�� �ݺ��ϸ� ����Ѵ�..
 *
 */
public class Array04 {

	public static void main(String[] args) {

		System.out.println("****** ary�� �����͸� ary1�� ���� ******");
//		int ary[][] = {{1,2,3,4},
//					   {5,6,7,8}};		//2�� 4��
//		
//		int ary1[][] = new int[4][2];	//4�� 2��
//		
//		//���������ϰ� 
//		for(int i=0; i<2; i++) {		//2��
//			for(int j=0; j<4; j++) {	//4��
//				ary1[j][i]=ary[i][j];
//			}
//		}
//		
		System.out.println("****** 4�� 2�� ary1�� ����Ǿ� �ִ� ������ �� ��� ******");
//		for(int i=0; i<4; i++) {
//			for (int j=0; j<2; j++) {
//				System.out.print(ary1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** 2��3���� ������ �Է��� �Է��� ���� ���� ��� ******");
//		int ary[][] = new int[2][3];
//		int sum=0;
//		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				ary[i][j] = sc.nextInt();	//�迭 ��ǥ�� ������ �� ���� 1������..
//				sum += ary[i][j];
//			}
//		}
//		System.out.println(sum);
		
//		int ary[] = new int[5];
//		int n = ary.length;	//�迭�� ����
//		System.out.println(n);
		
		System.out.println("****** 2���� �迭�� ���� ******");
		int ary[][] = new int[2][5];
		int n = ary.length;
		System.out.println(n);	//2���� �迭�� ���� ���� (�迭��.length)
		
		int m = ary[0].length;	//2���� �迭�� ���� ���� (�迭��[0].length)
		System.out.println(m);
		
		
		System.out.println("****** �������� �迭 ******");
		String s[][] = {
				{"java"},
				{"c","c++"},
				{"html","css","python"}
		};
		
		for (int i = 0; i < s.length; i++) {
			for(int j=0; j<s[i].length; j++ ) {
				System.out.print(s[i][j]+" ");
			}
		}
		System.out.println();
		
		System.out.println("****** �迭 ��� ���ϱ� ******");
		int ary1[][] = { {90, 90, 110, 110}, 
						{120, 110, 100, 110}, 
		                {120, 140, 130, 150}};
		
		double sum = 0;
		int cnt = 0;
		for(int i=0; i<ary1.length; i++) {
			for(int j=0; j<ary1[i].length; j++) {
				sum += ary1[i][j];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/ary1.length);	//�� ���� ���
		System.out.println(sum/cnt);			//���� ���� ���
		
		
		
		
		
	}

}
