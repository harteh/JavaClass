package pageReview;

//392-394
class Power {
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
	
}
public class Page392 {
	public static void main(String[] args) {

	}
}
