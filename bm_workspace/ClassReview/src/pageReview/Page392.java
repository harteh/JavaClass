package pageReview;

//392-394
class Powder {
	void doPrinting() {
		System.out.println("파우더 재료로 출력");
	}
	public String toString() {
		return "재료는 파우더 입니다.";
	}
}

class Plastic {
	void doPrinting() {
		System.out.println("플라스틱 재료로 출력");
	}
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
}

//GenericPrinter<T> 정의하기
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
