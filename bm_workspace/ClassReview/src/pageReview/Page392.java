package pageReview;

//392-394
class Power {
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
	
}
public class Page392 {
	public static void main(String[] args) {

	}
}
