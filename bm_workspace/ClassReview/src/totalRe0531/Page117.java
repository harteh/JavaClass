package totalRe0531;

public class Page117 {
	public static void main(String[] args) {
		//p.117
		int dan;
		int times;
		for(dan = 2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.print(dan+"X"+times+"="+ dan*times+" ");
			}
			System.out.println();
		}
		
		//p.121
		int sum=0;
		int num=0;
		for(num=0; ; num++) {
			sum+=num;
			if(sum>=100)
				break;
		}
		System.out.println("num: "+num+", sum: "+ sum);
		
	}
}
