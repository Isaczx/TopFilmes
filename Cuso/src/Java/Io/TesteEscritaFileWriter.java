package Java.Io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("meu pau no seu popo");
		bw.newLine();
		bw.newLine();
		bw.write("seu popo no meu pau");
		
		
		
		bw.close();
	}
	
	
	
	
	
	

}
