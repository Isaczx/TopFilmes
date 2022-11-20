package Java.Io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("meu pau no seu popo");
		ps.println();
		ps.println();
		ps.println("seu popo no meu pau");
		
		
		
		ps.close();
	}
	
	
	
	
	
	

}
