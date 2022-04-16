import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		BufferedWriter writer = null;
		BufferedReader reader = null;
		File in = new File("C:\\Users\\Raaid\\Desktop\\input.txt");
		File out = new File("C:\\Users\\Raaid\\Desktop\\out.txt");
		try {
			reader = new BufferedReader(new FileReader(in));
			writer = new BufferedWriter(new FileWriter(out));
			String currentLine;
			
			while((currentLine = reader.readLine()) != null) {
				writer.write(currentLine + "\n");
			}
			writer.close();
			reader.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}