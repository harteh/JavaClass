package pageReview0610;

//392-394
class Powder {
	void doPrinting() {
		System.out.println("�Ŀ�� ���� ���");
	}
	public String toString() {
		return "���� �Ŀ�� �Դϴ�.";
	}
}

class Plastic {
	void doPrinting() {
		System.out.println("�ö�ƽ ���� ���");
	}
	public String toString() {
		return "���� �ö�ƽ �Դϴ�.";
	}
}

//GenericPrinter<T> �����ϱ�
class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}

public class Page392 {
	public static void main(String[] args) {

		GenericPrinter<Powder> poPrinter = new GenericPrinter<Powder>();
		poPrinter.setMaterial(new Powder());
		Powder power = poPrinter.getMaterial();
		System.out.println(poPrinter);
		
		GenericPrinter<Plastic> plPrinter = new GenericPrinter<Plastic>();
		
		plPrinter.setMaterial(new Plastic());
		Plastic plastic = plPrinter.getMaterial();
		plastic.doPrinting();
		System.out.println(plPrinter);
		
		
	}
}
