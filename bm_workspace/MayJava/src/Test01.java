
public class Test01 {

	public static void main(String[] args) {

		int ary[][] = {{1,2,3,4},
	               {5,6,7,8}};		//2�� 4��

	int ary1[][] = new int[4][2];	//4�� 2��

	for(int i=0; i<ary.length; i++) {		//2��
	    for(int j=0; j<ary[0].length; j++) {	//4��
	        ary1[j][i]=ary[i][j];
	    }
	}
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(ary1[i][j]+" ");
		}
		System.out.println();
	}
		
		
		
				
	}

}
