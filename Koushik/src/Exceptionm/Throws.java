package Exceptionm;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
	public static void main(String[] args) {
		Throws t = new Throws();
		try {
			t.filereader();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

public void filereader()  throws FileNotFoundException{
	FileReader in = new FileReader("text.txt");
	System.out.println("ram");
}

}

