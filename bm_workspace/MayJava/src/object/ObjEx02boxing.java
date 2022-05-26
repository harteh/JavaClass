package object;

/*
 * 1. boxing	�⺻ Ÿ���� ��üȭ ��Ŵ
 * 
public class ObjEx02string {
	public static void main(String[] args) {
		Integer i = new Integer(10);	//���� 10�� ��üȭ
		//Integer i = 10;				
		Character c = new Character('C');	
		Boolean b = true;
		
		//�⺻ Ÿ���� ��üȭ ��Ŵ : boxing
		//��ü -> �⺻������ : unboxing
		
		Integer i1 = new Integer("10");
	}
}
*/

/*
 * 2. unboxing	��ü -> �⺻������
 */
public class ObjEx02boxing {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);	//boxing
		int i1 = i.intValue();			//unboxing
		
		Character c = new Character('a');
		char c1 = c.charValue();
		
		Boolean b = new Boolean(true);
		boolean b1 = b.booleanValue();
		
		//���ڿ��� �⺻Ÿ������ ��ȯ!!
		//parseInt : �⺻Ÿ������ �������ִ°�.
		int i2 = Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		
		int i3 = Integer.valueOf(123);
		int i4 = Integer.valueOf("10")+Integer.valueOf("20");
		
		System.out.println(i3+i2);
		//parse~~	: ����Ÿ���� �⺻�ڷ��� 
		//valueOf	: ����Ÿ���� ��ü
		
		
		String s = Integer.toString(123);
		//������ ��ü 123�� ���ڿ��� ��ȯ
		
		Integer i11 = 100;	//auto boxing
					//Integer Ŭ������ ��üȭ��Ŵ
		int n1 = i11+200;	//auto unboxing
		
	}
}
