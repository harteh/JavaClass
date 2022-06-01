package totalRe0531;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//p.525, 531, 536, 538. 551
public class Page525 {
	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("output.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
