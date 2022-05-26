package object;

/*
 * 1. boxing	기본 타입을 객체화 시킴
 * 
public class ObjEx02string {
	public static void main(String[] args) {
		Integer i = new Integer(10);	//정수 10을 객체화
		//Integer i = 10;				
		Character c = new Character('C');	
		Boolean b = true;
		
		//기본 타입을 객체화 시킴 : boxing
		//객체 -> 기본형으로 : unboxing
		
		Integer i1 = new Integer("10");
	}
}
*/

/*
 * 2. unboxing	객체 -> 기본형으로
 */
public class ObjEx02boxing {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);	//boxing
		int i1 = i.intValue();			//unboxing
		
		Character c = new Character('a');
		char c1 = c.charValue();
		
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		
		//문자열을 기본타입으로 변환!!
		//parseInt : 기본타입으로 변경해주는것.
		int i2 = Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		
		int i3 = Integer.valueOf(123);
		int i4 = Integer.valueOf("10")+Integer.valueOf("20");
		
		System.out.println(i3+i2);
		//parse~~	: 리턴타입이 기본자료형 
		//valueOf	: 리턴타입이 객체
		
		
		String s = Integer.toString(123);
		//정수형 객체 123을 문자열로 반환
		
		Integer i11 = 100;	//auto boxing
					//Integer 클래스로 객체화시킴
		int n1 = i11+200;	//auto unboxing
		
	}
}
