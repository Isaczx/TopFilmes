package JavaColletions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		
		
		

		        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
		                "Paulo Silveira");

		        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		        javaColecoes.adiciona(new Aula("Criando uma Aula", 25));
		        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		        
		        List<Aula> aulasImutaveis = javaColecoes.getAulas();
		        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		        
		        System.out.println(aulasImutaveis);
		        
		        java.util.Collections.sort(aulas);
		        
		        System.out.println(aulas);
		        System.out.println(javaColecoes.getTempoTotal());
		        
		        
		    }
		}
		
		
		
		
	
