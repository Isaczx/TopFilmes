package br.com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OrdCurso {

	public static void main(String[] args) {
		
	
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//cursos.sort(Comparator.comparingInt(C -> C.getAlunos()));
		//cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		//for (Curso curso : cursos) 	System.out.println(curso.getNome());
		
		//cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		//Stream <String> nomes = cursos.stream().map(Curso::getNome);
		
		//cursos.stream()
		   //.filter(c -> c.getAlunos() > 50)
		  // .map(Curso::getAlunos)
		  // .forEach(System.out::println);
		
		OptionalDouble soma = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		System.out.println(soma);
		  
	}

}
