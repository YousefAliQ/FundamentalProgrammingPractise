import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("c:/hello.java");
		Scanner s = new Scanner(f);

		String word = null;
		try {

			f = new File("c:/word_test.txt");
			PrintWriter writer;

			try {
				writer = new PrintWriter(new FileWriter(f));

				while ((word = s.next()) != null) {
					System.out.println(word);
					writer.write(word);
				}

				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (NoSuchElementException e) { // No more
												// tokens available
		}
		s.close();

	}
}
