package review;

public class Review0519B {

	public static void main(String[] args) {
		//4. show()�Լ��� �迭�� �������� ����ϴ� �Լ��� �����϶�
//		int ary[] = {6,2,8,4,9};
//		show(ary);
		
		//5. �迭�� ��ü �հ� ��� ���(�Ҽ��� ù°�ڸ�����)
		int [][]ary1= {
				{43, 97},
				{34, 77, 87},
				{100, 95, 38, 89}
		};
		show1(ary1);

	}//main ��

	//4.
//	static void show(int[] ary) {
//		for(int i=ary.length-1; i>=0; i--) {
//			System.out.println(ary[i]);
//		}
//	}
	
	static void show1(int[][] ary1) {
		int sum = 0;
		double avg = 0;
		int cnt=0;
		
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				sum+=ary1[i][j];
			}
			cnt += ary1[i].length;	//�� �迭����
		}
		avg = sum/cnt;
		
		System.out.printf("�迭�� ��: %d, ���: %.1f", sum, avg);
	}
	

}//Review0519B Ŭ���� ��
