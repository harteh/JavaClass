package totalRe0531;

import java.util.Scanner;

//p.207, 208, 209, 210, 218
class Book207 {
	private String bookName;
	private String author;
	
	public Book207() {}
	public Book207(String bookName, String author) {
		this.bookName=bookName;		this.author=author;
	}
	
	public String getBookName(String bookName) {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	
	public String getAuthor(String author) {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName+", "+author);
	}
}

public class Page207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book207[] library = new Book207[5];
		
		String bn, au;
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			
			//p.210
			library[i] = new Book207(bn = sc.next(), au = sc.next());
		}
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		//218
		String[] strArr= {"java","Android","C","Script","Python"};
		for(String la :strArr) {
			System.out.print(la+" ");
		}
		
	}
}
