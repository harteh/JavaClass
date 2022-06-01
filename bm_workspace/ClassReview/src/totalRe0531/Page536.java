package totalRe0531;

import java.io.FileReader;
import java.io.IOException;

public class Page536 {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("writer.txt")) {
			int i;
			while ((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
