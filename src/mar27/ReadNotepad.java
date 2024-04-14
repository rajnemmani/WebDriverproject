package mar27;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNotepad {

	public static void main(String[] args) throws Throwable{
		FileReader fr = new FileReader("D:/mrnbatch.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str= br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
		}
		

	}

}
