/**
 * 버블정렬
 * 3 2 1 6 5
 * 2 3 1 6 5
 * 2 1 3 6 5
 * 2 1 3 5 6 -> 1회전
 * -----------------------
 * 1 2 3 5 6 -> 2회전
 * 
 *
 */
public class BubbleSort {
	
	//버블정렬
	public static void main(String[] args) {
		
		int ary[] = {3, 2, 1, 6, 5};
		int temp;	//빈공간
		
		//두개값 교환코드
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5; j++) {
				if( ary[i]>ary[j] ) {	// 3>2
					temp = ary[i];		//temp=3
					ary[i] = ary[j];	//ary[i]=2
					ary[j] = temp;		//ary[j]=3
				}
			}
		}
		
		for (int i = 0; i < ary.length; i++) {	//배열 출력
			System.out.print(ary[i] +" ");
		}
		
	}
	
	
	
	
	//배열출력
//	static void show(int ary[]) {
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		int ary[]=new int[] {4,6,7,5,4};
//		show(ary);	//배열 데이터 모두 출력
//	}

	
}
