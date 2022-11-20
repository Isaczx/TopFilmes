package Java.Io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "c";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte [] bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + "  UTF-8" );
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + " UTF-16");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length +  ", US_ASCII");
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
}
