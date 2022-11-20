package JavaColletions;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
	
		Curso javaColeções = new Curso("dominando as coleções", "paulo silveira");
		
		javaColeções.adiciona(new Aula("porno", 22));
		
		List<Aula> aulas = javaColeções.getAulas();
		
		System.out.println(aulas);
		
		
		
	}

}
