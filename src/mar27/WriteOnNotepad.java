package mar27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteOnNotepad {

	public static void main(String[] args) throws Throwable{
		// Create New File - JAVA Related
		File f = new File("D:/mrnbatch.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I want job in Top MNC");
		bw.newLine();
		bw.write("with 20 L Package");
		bw.newLine();
		bw.write("In Hyderabad");
		bw.flush();
		bw.close();
		

	}

}
