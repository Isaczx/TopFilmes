package Java.Io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		
		OutputStream fis = new FileOutputStream("lorem.txt");
		Writer isr = new OutputStreamWriter(fis);
		BufferedWriter br = new BufferedWriter(isr);
		
		br.write("meu pau no seu popo");
		br.newLine();
		br.write("seu popo no meu pau");
		
		
		
		br.close();
	}
	
	
	
	
	
	

}
