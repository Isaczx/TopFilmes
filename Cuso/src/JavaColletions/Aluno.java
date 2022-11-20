package JavaColletions;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return this.matricula;
	}
	@Override
	public String toString() {
		return "Aluno: " + this.nome + "   Matricula: " + this.matricula;
	}
	
	
	
	

}
