package exercicio;

public class Aluno extends Pessoa{
	private String matricula;
	private String curso;
	
	public Aluno(String nome, int idade, String matricula, String curso) {
		super(nome, idade);
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	protected String getMatricula() {
		return matricula;
	}
	
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	protected String getCurso() {
		return curso;
	}
	
	protected void set(String curso) {
		this.curso = curso;
	}
}
