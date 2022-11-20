package JavaColletions;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoAluno {
	
	public static void main(String[] args) {
		

	   Curso javaColecoes = new Curso("Dominando as colecoes do Java",
               "Paulo Silveira");

       javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
       javaColecoes.adiciona(new Aula("Criando uma Aula", 25));
       javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
       
       Aluno a1 = new Aluno("isac", 174);
       Aluno a2 = new Aluno("lucas",137);
       Aluno a3 = new Aluno("william",857);
       
       javaColecoes.matricula(a1);
       javaColecoes.matricula(a2);
       javaColecoes.matricula(a3);
       
       Set<Aluno> alunos = javaColecoes.getAlunos();
       Iterator<Aluno> iterador =   alunos.iterator();
       
       while (iterador.hasNext()) {				
    	   Aluno proximo = iterador.next();
    	   System.out.println(proximo);
    	   	
	}
       
     
       
       System.out.println("Todos os alunos matriculados");
       javaColecoes.getAlunos().forEach(a -> {
    	   System.out.println(a);
       });
		
       System.out.println(javaColecoes.TemMatricula(a1));
	
       
	}

}
