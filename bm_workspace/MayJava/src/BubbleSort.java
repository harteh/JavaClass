/**
 * ��������
 * 3 2 1 6 5
 * 2 3 1 6 5
 * 2 1 3 6 5
 * 2 1 3 5 6 -> 1ȸ��
 * -----------------------
 * 1 2 3 5 6 -> 2ȸ��
 * 
 *
 */
public class BubbleSort {
	
	//��������
	public static void main(String[] args) {
		
		int ary[] = {3, 2, 1, 6, 5};
		int temp;	//�����
		
		int size = ary.length;	//5
		
		//�ΰ��� ��ȯ�ڵ� 1.
//		for(int i=0; i<size; i++) {			//0,1,2,3,4
//			for(int j=0; j<size-i-1; j++) {	//0,1,2,3
//				if( ary[j]>ary[j+1] ) {	// 3>2
//					temp = ary[j+1];	//temp=3
//					ary[j+1] = ary[j];	//ary[i]=2
//					ary[j] = temp;		//ary[j]=3
//				}
//			}
//		}
		
		//�ΰ��� ��ȯ�ڵ� 2.
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5; j++) {
				if( ary[i]>ary[j] ) {	// 3>2
					temp = ary[i];		//temp=3
					ary[i] = ary[j];	//ary[i]=2
					ary[j] = temp;		//ary[j]=3
				}
			}
		}
		
		for (int i = 0; i < ary.length; i++) {	//�迭 ���
			System.out.print(ary[i] +" ");
		}
		
	}
	
	
	
	
	//�迭���
//	static void show(int ary[]) {
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		int ary[]=new int[] {4,6,7,5,4};
//		show(ary);	//�迭 ������ ��� ���
//	}

	
}