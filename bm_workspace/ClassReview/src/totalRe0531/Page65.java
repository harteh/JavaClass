package totalRe0531;

//page 65, 68
public class Page65 {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);	//10
		System.out.println(iNum);	//10
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);	//10
		System.out.println(fNum);	//20.0
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);	//30.0
		
		//page 68
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);	
		System.out.println(iNum3);	//1
		System.out.println(iNum4);	//2
	}
}
