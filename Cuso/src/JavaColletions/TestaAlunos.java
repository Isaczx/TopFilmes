package JavaColletions;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("isac santos");
		alunos.add("lucas mart");
		alunos.add("gabriel souza");
		alunos.add("gabriel souza");
		
		
		boolean matriculado = alunos.contains("isac santos");
		System.out.println(matriculado);
		System.out.println(alunos);
		System.out.println(alunos.size());
		alunos.forEach(aluno -> {System.out.println(aluno);});
	}

}
