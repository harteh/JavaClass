package abstractex;


class Arr {
	static int[] con(int[] a, int[] b) {
		int []arr = new int[a.length + b.length];	//8

		for(int i=0; i<a.length; i++) {
			arr[i] = a[i];	//a배열을 arr배열에 담는다.	//1234
			for(int j=a.length; j<a.length+b.length; j++) {	//j=4,5,6,7
				arr[j] = b[j - a.length];
			}
		}
		return arr;
	}
	
	static void pr(int[] a) {
		//배열 출력은 for문!
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

public class AbstEx04 {
	public static void main(String[] args) {
		
		int ary1[] = {1,2,3,4}; 
		int ary2[] = {5,6,7,8};
		
		int ary3[] = Arr.con(ary1, ary2);
		Arr.pr(ary3);
	}
}
