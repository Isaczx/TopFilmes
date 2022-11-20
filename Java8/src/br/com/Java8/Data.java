package br.com.Java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		LocalDate data8 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data8);
		
		Period periodo = Period.between(data, data8);
		System.out.println(periodo);
		
		DateTimeFormatter formatter	= DateTimeFormatter.ofPattern("dd/mm/yyyy ");
		String dataforma = formatter.format(data);
		System.out.println(dataforma);
				
		
		
		
	}

}
