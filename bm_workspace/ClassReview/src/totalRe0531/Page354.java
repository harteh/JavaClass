package totalRe0531;

//p354, 356
class Book354 {
	int bookNum;
	String bookTitle;
	
	Book354(int n, String t) {
		bookNum = n;
		bookTitle = t;
	}

	public String toString() {
		return bookNum+", "+bookTitle;
	}
}
public class Page354 {
	public static void main(String[] args) {

		Book354 book1 = new Book354(200, "개미");
		
		System.out.println(book1);	//객체출력
		System.out.println(book1.toString());
	}
}
