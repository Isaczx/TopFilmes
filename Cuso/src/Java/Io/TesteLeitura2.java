package Java.Io;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
		String linha = scanner.nextLine();
		
		
		Scanner Linhascanner = new Scanner(linha);
		Linhascanner.useLocale(Locale.US);
		Linhascanner.useDelimiter(",");
		
		String tipoConta = Linhascanner.next();
		int agencia = Linhascanner.nextInt();
		int numero = Linhascanner.nextInt();
		String titular  = Linhascanner.next();
		double saldo = Linhascanner.nextDouble();
		
		String valorFormatado = String.format("%s - %d-%d, %s: %f", tipoConta, agencia, numero, titular, saldo);
		System.out.println(valorFormatado);
		
		
		
		Linhascanner.close();
		}
		
		
		scanner.close();
	}

}
