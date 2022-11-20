package br.com.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class OrdenaStings {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("isacsssssssssssssss");
		lista.add("comedor");
		lista.add("de xereca");
		
		lista.sort(Comparator.comparing(String::length));
		
		lista.forEach(System.out::println); 	
		
		
			
		 
		new Thread(() ->  System.out.println("Executando um Runnable")).start();
		
		
		}
		        		
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

