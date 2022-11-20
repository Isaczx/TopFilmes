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
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarEscrita {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader sr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(sr);
		
		OutputStream fs = new FileOutputStream("lorem2.txt");
		Writer srs = new OutputStreamWriter(fs);
		BufferedWriter bw = new BufferedWriter(srs);
		
		String linha = br.readLine();
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			
			
			
			
			linha = br.readLine();
			
			
			
		}
		
		bw.close();
		br.close();
	}
	
	
	
	
	
	

}
